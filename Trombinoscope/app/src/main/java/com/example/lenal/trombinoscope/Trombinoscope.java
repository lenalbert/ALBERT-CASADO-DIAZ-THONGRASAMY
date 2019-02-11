package com.example.lenal.trombinoscope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.lenal.trombinoscope.PersonneData.personneListe;

public class Trombinoscope extends AppCompatActivity {
    ListView liste;
    Adapter adapter;
    Personne p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_trombinoscope);

            liste = (ListView) findViewById(R.id.list);
            adapter = new Adapter(Trombinoscope.this, PersonneData.personneListe);
            liste.setAdapter(adapter);


    }
}
