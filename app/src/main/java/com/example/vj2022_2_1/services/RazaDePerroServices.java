package com.example.vj2022_2_1.services;

import com.example.vj2022_2_1.entities.RazaPerro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RazaDePerroServices {
    //https://api.thedogapi.com/v1/breeds?limit=20&page=0
    @GET("v1/breeds")
    //?limit=10&page=1
    Call<List<RazaPerro>> getAll(@Query("limit") int limit, @Query("page") int pagina);

    @GET("v1/breeds/{razaId}")
    Call<RazaPerro> finById(@Path("razaId") int id);
}
