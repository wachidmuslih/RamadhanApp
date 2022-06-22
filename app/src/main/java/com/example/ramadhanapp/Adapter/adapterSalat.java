package com.example.ramadhanapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ramadhanapp.Database.dbFardhu;
import com.example.ramadhanapp.R;
import com.example.ramadhanapp.holder.salatHolder;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class adapterSalat extends RecyclerView.Adapter<salatHolder> {

    private ArrayList<dbFardhu> daftarSalat;
    private Context context;
    private FirebaseFirestore fs;
    private DocumentReference reference;

    public adapterSalat(ArrayList<dbFardhu> salat, Context ctx ){
        daftarSalat = salat;
        context = ctx;
    }

    public adapterSalat(ArrayList<dbFardhu> salatArrayList) {
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView hariSalat;
        public ViewHolder(View itemView) {
            super(itemView);

            hariSalat = itemView.findViewById(R.id.tvHariSalat);

            fs = FirebaseFirestore.getInstance();
            reference = fs.collection("salatfardhu").document();
        }
    }

    @NonNull
    @Override
    public salatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View photoView = inflater.inflate(R.layout.activity_fardhu, parent, false);
        salatHolder viewHolder = new salatHolder(photoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull salatHolder holder, int position) {
        holder.hariSalat.setText(daftarSalat.get(position).getFardhuId());
    }

    @Override
    public int getItemCount() {
        return daftarSalat.size();
    }
}
