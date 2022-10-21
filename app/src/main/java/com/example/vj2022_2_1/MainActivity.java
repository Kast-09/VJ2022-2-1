package com.example.vj2022_2_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vj2022_2_1.adapters.StringAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvNombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> nombres = new ArrayList<String>();

        nombres.add("Kevin");
        nombres.add("Diego");
        nombres.add("Lucero");

        rvNombres = findViewById(R.id.rvNombres);
        rvNombres.setLayoutManager(new LinearLayoutManager(this));
        rvNombres.setAdapter(new StringAdapter(nombres));
    }
}