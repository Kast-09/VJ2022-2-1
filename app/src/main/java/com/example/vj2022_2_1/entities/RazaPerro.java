package com.example.vj2022_2_1.entities;

import com.google.gson.annotations.SerializedName;

public class RazaPerro {
    public int id;
    public String name;
    @SerializedName("bred_for")//para agregarle el nombre del atributo del json
    public String bredFor;
    public String temperament;
    public ImagenRazaPerro image;
}
