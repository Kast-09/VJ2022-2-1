package com.example.vj2022_2_1.services;

import com.example.vj2022_2_1.entities.Contact;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ContactService {
    @POST("contacts")
    Call<Void> create(@Body Contact contact);//guardar datos

    @PUT("contacts/{id}")
    Call<Void> update(@Body Contact contact, @Path("id") int id);//actualizar datos
}
