package com.example.lenal.trombinoscope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AjoutPersonne extends AppCompatActivity {


    EditText inputNom;
    EditText inputPrenom;
    String stringNom;
    String stringPrenom;
    Personne p;
    Button ajout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_personne);

        ajout = (Button) findViewById(R.id.ajout);
        ajout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                inputNom = (EditText)findViewById(R.id.nom);
                stringNom = inputNom.getText().toString();
                inputPrenom = (EditText)findViewById(R.id.prenom);
                stringPrenom = inputPrenom.getText().toString();
                p = new Personne(stringNom, stringPrenom);
                new PersonneData(p);
                Toast.makeText(getApplicationContext(), stringNom+" "+stringPrenom+" a bien été ajouté", Toast.LENGTH_LONG).show();
            }
        });
    }
}
