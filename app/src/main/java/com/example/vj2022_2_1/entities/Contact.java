package com.example.vj2022_2_1.entities;

import com.google.gson.annotations.SerializedName;

public class Contact {

    public int id;
    @SerializedName("name")
    public String nombre;
    @SerializedName("lastname")
    public String apellido;
    public String NTelefono;
    public String imgURL;
}
