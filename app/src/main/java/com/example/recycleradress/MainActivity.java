package com.example.recycleradress;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private RecyclerView  recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recycles);
        ArrayList<String> address = new ArrayList<>();
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");
        address.add("Pravda");

        AdressAdapter adapter = new AdressAdapter(address);
        recyclerview.setAdapter(adapter);

    }
}