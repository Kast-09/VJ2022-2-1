package com.example.vj2022_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.vj2022_2_1.entities.Contact;
import com.example.vj2022_2_1.services.ContactService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FormContactActivity extends AppCompatActivity {

    EditText edName, edLastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_contact);

        edName = findViewById(R.id.edName);
        edLastname = findViewById(R.id.edLastname);

        /*Contact contact = new Contact();
        contact.nombre = "Kevin";
        contact.apellido = "Sanchez";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://6352ca44a9f3f34c3749009a.mockapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ContactService services = retrofit.create(ContactService.class);
        services.create(contact).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                Log.i("MAIN_APP", "Responde: "+response.code());
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });*/
    }

    public void enviar(View v){
        String name = edName.getText().toString();
        String lastaname = edLastname.getText().toString();

        Contact contact = new Contact();
        contact.nombre = name;
        contact.apellido = lastaname;

        postRetrofit(contact);
    }

    public void postRetrofit(Contact contact){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://6352ca44a9f3f34c3749009a.mockapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ContactService services = retrofit.create(ContactService.class);
        services.create(contact).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                Log.i("MAIN_APP", "Responde: "+response.code());
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }

    public void updateRetrofit(Contact contact, int id){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://6352ca44a9f3f34c3749009a.mockapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ContactService services = retrofit.create(ContactService.class);
        services.update(contact, id).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                Log.i("MAIN_APP", "Responde: "+response.code());
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }
}