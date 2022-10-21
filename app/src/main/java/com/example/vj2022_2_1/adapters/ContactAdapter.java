package com.example.vj2022_2_1.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vj2022_2_1.R;
import com.example.vj2022_2_1.entities.Contact;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter {

    List<Contact> data = new ArrayList<Contact>();

    public ContactAdapter(List<Contact> data){
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_contact, parent, false);
        return new StringAdapter.StringViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TextView tvNombreContacto = holder.itemView.findViewById(R.id.tvNombreContacto);
        tvNombreContacto.setText(data.get(position).nombre + " " + data.get(position).apellido);

        TextView tvNTelefonoContacto = holder.itemView.findViewById(R.id.tvTelefonoContacto);
        tvNTelefonoContacto.setText(data.get(position).NTelefono);

        ImageView ivContacto = holder.itemView.findViewById(R.id.ivContacto);
        //ivContacto.setImageResource(R.drawable.avatar1);
        Picasso.get().load(data.get(position).imgURL).into(ivContacto);

        holder.itemView.getContext();//con esto podremos acceder al contexto por ejemplo para acceder a otra actividad
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class StringViewHolder extends RecyclerView.ViewHolder {
        public StringViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
