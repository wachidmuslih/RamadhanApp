package com.example.ramadhanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.ramadhanapp.Activity.FardhuActivity;
import com.example.ramadhanapp.Activity.TadarusActivity;
import com.example.ramadhanapp.Activity.TarawihActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton imgTarawih,imgFardhu, imgTadarus;
    TextView tvTarawih,tvFardhu, tvTadarus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgTarawih =(ImageButton)findViewById(R.id.ibTarawih);
        imgTadarus =(ImageButton)findViewById(R.id.ibTadarus);
        imgFardhu =(ImageButton)findViewById(R.id.ibFardhu);

        tvFardhu = findViewById(R.id.tvFardhu);
        tvTadarus = findViewById(R.id.tvTadarus);
        tvTarawih = findViewById(R.id.txTarawih);

        imgFardhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FardhuActivity.class);
                startActivity(intent);
            }
        });

        imgTadarus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TadarusActivity.class);
                startActivity(intent);
            }
        });

        imgTarawih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TarawihActivity.class);
                startActivity(intent);
            }
        });

        tvTarawih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TarawihActivity.class);
                startActivity(intent);
            }
        });

        tvTadarus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TadarusActivity.class);
                startActivity(intent);
            }
        });

        tvFardhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FardhuActivity.class);
                startActivity(intent);
            }
        });
    }
}