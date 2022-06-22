package com.example.ramadhanapp.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ramadhanapp.R;

public class salatHolder extends RecyclerView.ViewHolder {
    public TextView hariSalat;
    View view;

    public salatHolder(@NonNull View itemView) {
        super(itemView);

        hariSalat = (TextView) itemView.findViewById(R.id.tvHariSalat);
        view = itemView;
    }
}
