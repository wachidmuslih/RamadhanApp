package com.example.ramadhanapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ramadhanapp.Database.dbHelper;
import com.example.ramadhanapp.Firebase.dbHelperF;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    TextInputLayout userName, email, password, repassword;
    Button register;
    public dbHelper dbhelp;
//    FirebaseDatabase database;
//    DatabaseReference reference;
    FirebaseFirestore fs;
    DocumentReference reference;
    private dbHelperF dbHelperFS ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        userName = findViewById(R.id.tNama);
        email = findViewById(R.id.tEmail);
        password = findViewById(R.id.edPass);
        repassword = findViewById(R.id.edRepass);
        register = findViewById(R.id.btReg);

        dbhelp = new dbHelper(this);
        fs = FirebaseFirestore.getInstance();
        reference = fs.collection("user").document();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usrNm = userName.getEditText().getText().toString();
                String eml = email.getEditText().getText().toString();
                String pass = password.getEditText().getText().toString();
                String repass = repassword.getEditText().getText().toString();

                if (usrNm.isEmpty() || eml.isEmpty() || pass.isEmpty() || repass.isEmpty())
                {
                    Snackbar.make(view, "Wajib Diisi!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if(pass.equals(repass))
                    {
                        reference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                if (documentSnapshot.exists())
                                {
                                    Toast.makeText(RegisterActivity.this, "Sorry,this user exists", Toast.LENGTH_SHORT).show();
                                }
                                else{
                                    Map<String, Object> regist = new HashMap<>();
                                    regist.put("name", usrNm);
                                    regist.put("email", eml);
                                    regist.put("password", pass);
                                    regist.put("repassword", repass);

                                    fs.collection("user").add(regist).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                        @Override
                                        public void onSuccess(DocumentReference documentReference) {
                                            Toast.makeText(RegisterActivity.this, "Successfully added", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                            startActivity(intent);
                                        }
                                    }).addOnFailureListener(new OnFailureListener() {
                                        @Override
                                        public void onFailure(@NonNull Exception e) {
                                            Log.d("Error", e.getMessage());
                                        }
                                    });
                                }
                            }
                        });
                    }
                }

            }
        });
    }
}