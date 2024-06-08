package com.example.scrollbarcardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tornilleria extends AppCompatActivity {

    ImageView arandela;
    ImageView perno;
    ImageView remache;
    ImageView tuerca;
    ImageView barra;
    ImageView tC;
    ImageView pija;
    ImageView ta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tornilleria);

        ta = findViewById(R.id.ta);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleria.this, ta.class);
                startActivity(i);
            }
        });

        pija = findViewById(R.id.pija);
        pija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleria.this, pija.class);
                startActivity(i);
            }
        });

        tC = findViewById(R.id.tC);
        tC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleria.this, tornillo.class);
                startActivity(i);
            }
        });

        barra = findViewById(R.id.barra);
        barra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleria.this, barra.class);
                startActivity(i);
            }
        });

        tuerca = findViewById(R.id.tuerca);
        tuerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleria.this, tuerca.class);
                startActivity(i);
            }
        });

        remache = findViewById(R.id.remache);
        remache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleria.this, remache.class);
                startActivity(i);
            }
        });

        arandela = findViewById(R.id.arandela);
        arandela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleria.this, arandelator.class);
                startActivity(i);
            }
        });

        perno = findViewById(R.id.perno);
        perno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleria.this, perno.class);
                startActivity(i);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}