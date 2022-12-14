package com.example.vj2022_2_1.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vj2022_2_1.R;

import java.util.List;

public class StringAdapter extends RecyclerView.Adapter {

    List<String> data;

    public StringAdapter(List<String> data){
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View itemView = inflater.inflate(R.layout.item_string, parent, false);
        return new StringViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TextView tvNombre = holder.itemView.findViewById(R.id.tvNombreContacto);
        tvNombre.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class StringViewHolder extends RecyclerView.ViewHolder {
        public StringViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
