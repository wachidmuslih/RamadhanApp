package com.example.ramadhanapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ramadhanapp.Action.AddFardhuActivity;
import com.example.ramadhanapp.Adapter.adapterSalat;
import com.example.ramadhanapp.Database.dbFardhu;
import com.example.ramadhanapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class FardhuActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapterSalat adapter;
    private ArrayList<dbFardhu> salatArrayList;
    FloatingActionButton fabSalat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fardhu);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new adapterSalat(salatArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FardhuActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        fabSalat = findViewById(R.id.fabFardhu);

        fabSalat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FardhuActivity.this, AddFardhuActivity.class);
            }
        });
    }
}