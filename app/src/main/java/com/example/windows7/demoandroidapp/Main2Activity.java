package com.example.windows7.demoandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ArrayList<List>contacts = new ArrayList<>();

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.listView);

        contacts.add(new Contact("Calendar","System", "CPU : 0%", "1"));
        contacts.add(new Contact("Contacts","System", "CPU : 0%", "2"));
        contacts.add(new Contact("Facebook","Background", "CPU : 28%", "3"));
        contacts.add(new Contact("Twitter","Background", "CPU : 0%", "4"));
        contacts.add(new Contact("Messaging","System", "CPU : 0%", "5"));
        contacts.add(new Contact("Dictionary Provider","System", "CPU : 0%", "6"));
        contacts.add(new Contact("Music FX","System", "CPU : 0%", "7"));
        contacts.add(new Contact("Nfc Service","System", "CPU : 0%", "8"));

        ContactAdapter contactAdapter = new ContactAdapter(contacts);
        listView.setAdapter(contactAdapter);
    }
}
