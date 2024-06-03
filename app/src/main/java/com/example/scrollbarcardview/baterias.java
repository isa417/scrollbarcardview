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

public class baterias extends AppCompatActivity {


    ImageView salirbaterias;
    ImageView gba18v20ah;
    ImageView gba18v40ah;
    ImageView gba18v50ah;
    ImageView procore18v40ah;
    ImageView procore18v80ah;
    ImageView procore18v120ah;
    ImageView gba12v20ah;
    ImageView gba12v40ah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_baterias);

        gba12v40ah = findViewById(R.id.gba12v40ah);
        gba12v40ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(baterias.this, gba12v40ah.class);
                startActivity(i);
            }
        });

        gba12v20ah = findViewById(R.id.gba12v20ah);
        gba12v20ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(baterias.this, gba12v20ah.class);
                startActivity(i);
            }
        });

        procore18v120ah = findViewById(R.id.procore18v120ah);
        procore18v120ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(baterias.this, procore18v120ah.class);
                startActivity(i);
            }
        });

        procore18v80ah = findViewById(R.id.procore18v80ah);
        procore18v80ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(baterias.this, procore18v80ah.class);
                startActivity(i);
            }
        });

        procore18v40ah = findViewById(R.id.procore18v40ah);
        procore18v40ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(baterias.this, procore18v40ah.class);
                startActivity(i);
            }
        });

        gba18v50ah = findViewById(R.id.gba18v50ah);
        gba18v50ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(baterias.this, gba18v50ah.class);
                startActivity(i);
            }
        });

        gba18v40ah = findViewById(R.id.gba18v40ah);
        gba18v40ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(baterias.this, gba18v40ah.class);
                startActivity(i);
            }
        });

        gba18v20ah = findViewById(R.id.gba18v20ah);
        gba18v20ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(baterias.this, gba18v40ah.class);
                startActivity(i);
            }
        });

        salirbaterias = findViewById(R.id.salirbaterias);
        salirbaterias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(baterias.this, MainActivityBosch.class);
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