package com.example.ramadhanapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ramadhanapp.Database.dbHelper;
import com.example.ramadhanapp.Firebase.dbHelperF;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.sql.Struct;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin, btnRegister;
    TextInputLayout edEmail, edPassword;
    FirebaseFirestore fs;
    DocumentReference reference;
    public dbHelper dbh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        edEmail = findViewById(R.id.txEmail);
        edPassword = findViewById(R.id.txPasswd);

        dbh = new dbHelper(this);

        fs = FirebaseFirestore.getInstance();


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailCheck = edEmail.getEditText().getText().toString();
                String passCheck = edPassword.getEditText().getText().toString();

                if (emailCheck.isEmpty() || passCheck.isEmpty())
                {
                    Snackbar.make(view, "Wajib Diisi!", Snackbar.LENGTH_LONG).show();
                }
                else {
                    fs.collection("user")
                            .get()
                            .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                @Override
                                public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                    if(task.isSuccessful()){
                                        for(QueryDocumentSnapshot doc : task.getResult())
                                        {
                                            String a = doc.getString("email");
                                            String b = doc.getString("password");
                                            String a1 = emailCheck.trim();
                                            String b1 = passCheck.trim();
                                            if(a.equalsIgnoreCase(a1) && b.equalsIgnoreCase(b1)){
                                                Intent main = new Intent(LoginActivity.this, MainActivity.class);
                                                startActivity(main);
                                                Toast.makeText(LoginActivity.this, "Logged In", Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    }

                                }
                            });
                }
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}