package com.example.ramadhanapp.Action;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.ramadhanapp.R;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class AddFardhuActivity extends AppCompatActivity {

    CheckBox subuh, dzuhur, ashar, magrib, isya;
    Button btSave;

    FirebaseFirestore fs = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fardhu);

        subuh = (CheckBox) findViewById(R.id.cbSubuh);
        dzuhur = (CheckBox) findViewById(R.id.cbDzuhur);
        ashar = (CheckBox) findViewById(R.id.cbAshar);
        magrib = (CheckBox) findViewById(R.id.cbMagrib);
        isya = (CheckBox) findViewById(R.id.cbIsya);
        btSave = findViewById(R.id.btnSaveSalat);

        Boolean subuhState = subuh.isChecked();
        Boolean dzuhurState = dzuhur.isChecked();
        Boolean asharState = ashar.isChecked();
        Boolean magribState = magrib.isChecked();
        Boolean isyaState = isya.isChecked();

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DocumentReference reference = fs.collection("salatfardhu").document();
                if(subuhState) {
                    
                }

                if(mSecondCheckBox.isChecked()) {
                    current_user_db.child("2").setValue("Operating Systems");
                }

                if(mThirdCheckBox.isChecked()) {
                    current_user_db.child("3").setValue("Software Engineering");
                }
            }
        });


    }
}