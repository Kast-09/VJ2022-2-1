package com.example.vj2022_2_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vj2022_2_1.adapters.ContactAdapter;
import com.example.vj2022_2_1.adapters.StringAdapter;
import com.example.vj2022_2_1.entities.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {

    private RecyclerView rvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        List<Contact> contactos = new ArrayList<Contact>();

        Contact contact = new Contact();
        contact.id = 1;
        contact.nombre = "Kevin";
        contact.apellido = "Sanchez";
        contact.NTelefono = "996327967";
        contact.imgURL = "https://cdn-icons-png.flaticon.com/512/147/147144.png";
        contactos.add(contact);

        Contact contact2 = new Contact();
        contact2.id = 2;
        contact2.nombre = "Diego";
        contact2.apellido = "Sanchez";
        contact2.NTelefono = "987654321";
        contact2.imgURL = "https://cdn-icons-png.flaticon.com/512/147/147144.png";
        contactos.add(contact2);

        Contact contact3 = new Contact();
        contact3.id = 3;
        contact3.nombre = "Lucero";
        contact3.apellido = "Sanchez";
        contact3.NTelefono = "963258741";
        contact3.imgURL = "https://www.pngall.com/wp-content/uploads/12/Avatar-Profile-Vector-PNG-Photos.png";
        contactos.add(contact3);

        rvContact = findViewById(R.id.rvContacts);
        rvContact.setLayoutManager(new LinearLayoutManager(this));
        rvContact.setAdapter(new ContactAdapter(contactos));
    }
}