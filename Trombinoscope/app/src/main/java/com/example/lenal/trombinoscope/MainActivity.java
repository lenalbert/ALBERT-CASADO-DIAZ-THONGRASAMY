package com.example.lenal.trombinoscope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    Button btn_trombinoscope;
    Button btn_ajout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.i(TAG, msg:"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_trombinoscope = (Button) findViewById(R.id.trombi);
        btn_trombinoscope.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(MainActivity.this, Trombinoscope.class);
                Toast.makeText(getApplicationContext(), "BIENVENUE AU TROMBINOSCOPE", Toast.LENGTH_LONG).show();
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });

        btn_ajout = (Button) findViewById(R.id.ajout);
        btn_ajout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Log.i(TAG, "REDIRECTION VERS PERSONNSLIST");
                Intent activityChangeIntent = new Intent(MainActivity.this, AjoutPersonne.class);
                Toast.makeText(getApplicationContext(), "REDIRECTION VERS AJOUT DE PERSONNES", Toast.LENGTH_LONG).show();
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
    }
}
