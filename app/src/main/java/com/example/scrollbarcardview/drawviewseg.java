package com.example.scrollbarcardview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class drawviewseg extends AppCompatActivity {

    ImageView guantes;
    ImageView lentees;
    ImageView audifonos;
    ImageView respiratoria;
    ImageView rodilleras;
    ImageView corporal;
    ImageView salirmenu;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawviewseg);

        guantes = findViewById(R.id.guantes);
        guantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(drawviewseg.this, scrollbarcardviewguantes.class);
                startActivity(i);
            }
        });

        lentees = findViewById(R.id.lentees);
        lentees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(drawviewseg.this, scrollbarcardviewlentes.class);
                startActivity(i);
            }
        });

        audifonos = findViewById(R.id.audifonos);
        audifonos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(drawviewseg.this, scrollbarcardviewaudifonos.class);
                startActivity(i);
            }
        });

        respiratoria = findViewById(R.id.respiratoria);
        respiratoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(drawviewseg.this, scrollbarcardviewpr.class);
                startActivity(i);
            }
        });

        rodilleras = findViewById(R.id.rodilleras);
        rodilleras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(drawviewseg.this, scrollbarcardviewrodilleras.class);
                startActivity(i);
            }
        });

        corporal = findViewById(R.id.corporal);
        corporal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(drawviewseg.this, scrollbarcardviewcorporal.class);
                startActivity(i);
            }
        });

        salirmenu = findViewById(R.id.salirmenu);
       salirmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(drawviewseg.this, MenuInicioActivity.class);
                startActivity(i);
            }
        });

    }
}
