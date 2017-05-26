package com.example.windows7.demoandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ArrayList<List>contacts = new ArrayList<>();

    android.widget.ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (android.widget.ListView) findViewById(R.id.listView);

        contacts.add(new ListView("Calendar","System", "CPU : 0%", "1"));
        contacts.add(new ListView("Contacts","System", "CPU : 0%", "2"));
        contacts.add(new ListView("Facebook","Background", "CPU : 28%", "3"));
        contacts.add(new ListView("Twitter","Background", "CPU : 0%", "4"));
        contacts.add(new ListView("Messaging","System", "CPU : 0%", "5"));
        contacts.add(new ListView("Dictionary Provider","System", "CPU : 0%", "6"));
        contacts.add(new ListView("Music FX","System", "CPU : 0%", "7"));
        contacts.add(new ListView("Nfc Service","System", "CPU : 0%", "8"));

        ListAdapter contactAdapter = new ListAdapter(contacts);
        listView.setAdapter(contactAdapter);
    }
}
