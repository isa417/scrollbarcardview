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

public class llavesdeimpacto extends AppCompatActivity {

    ImageView salirmenullaves;
    ImageView gdx180li;
    ImageView gsx18v200;
    ImageView gds18v400;
    ImageView gds18v1000;
    ImageView gdr120li1;
    ImageView gdr12v110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_llavesdeimpacto);

        gdr12v110 = findViewById(R.id.gdr12v110);
        gdr12v110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(llavesdeimpacto.this, gdr12v110.class);
                startActivity(i);
            }
        });

        gdr120li1 = findViewById(R.id.gdr120li1);
        gdr120li1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(llavesdeimpacto.this, gdr120li.class);
                startActivity(i);
            }
        });

        gds18v1000 = findViewById(R.id.gds18v1000);
        gds18v1000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(llavesdeimpacto.this, gds18v1000.class);
                startActivity(i);
            }
        });

        gds18v400 = findViewById(R.id.gds18v400);
        gds18v400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(llavesdeimpacto.this, gds18v400.class);
                startActivity(i);
            }
        });

        gsx18v200 = findViewById(R.id.gsx18v200);
        gsx18v200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(llavesdeimpacto.this, gsx18v200.class);
                startActivity(i);
            }
        });

        gdx180li = findViewById(R.id.gdx180li);
        gdx180li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(llavesdeimpacto.this, gdx180li.class);
                startActivity(i);
            }
        });

        salirmenullaves = findViewById(R.id.salirmenullaves);
        salirmenullaves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(llavesdeimpacto.this, MainActivityBosch.class);
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