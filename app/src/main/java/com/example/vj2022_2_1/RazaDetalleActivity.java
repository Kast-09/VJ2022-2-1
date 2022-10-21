package com.example.vj2022_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vj2022_2_1.entities.RazaPerro;
import com.example.vj2022_2_1.services.RazaDePerroServices;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RazaDetalleActivity extends AppCompatActivity {

    ImageView ivImage2;
    TextView tvRaza2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raza_detalle);

        ivImage2 = findViewById(R.id.ivImage2);
        tvRaza2 = findViewById(R.id.tvRaza2);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.thedogapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RazaDePerroServices service = retrofit.create(RazaDePerroServices.class);
        service.finById(2).enqueue(new Callback<RazaPerro>() {
            @Override
            public void onResponse(Call<RazaPerro> call, Response<RazaPerro> response) {
                RazaPerro data = response.body();
                //Picasso.get().load(data.image.url).into(ivImage2);
                tvRaza2.setText(data.name);
            }

            @Override
            public void onFailure(Call<RazaPerro> call, Throwable t) {

            }
        });
    }
}