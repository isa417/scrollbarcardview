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

public class cargadores extends AppCompatActivity {

    ImageView salircargadores;
    ImageView gal1880cv;
    ImageView gal18v20;
    ImageView gal18v40;
    ImageView gal12v20;
    ImageView gal12v40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cargadores);

        gal12v40 = findViewById(R.id.gal12v40);
        gal12v40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cargadores.this, gal12v40.class);
                startActivity(i);
            }
        });

        gal12v20 = findViewById(R.id.gal12v20);
        gal12v20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cargadores.this, gal12v20.class);
                startActivity(i);
            }
        });

        gal18v40 = findViewById(R.id.gal18v40);
        gal18v40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cargadores.this, gal18v40.class);
                startActivity(i);
            }
        });


        gal18v20 = findViewById(R.id.gal18v20);
        gal18v20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cargadores.this, gal18v20.class);
                startActivity(i);
            }
        });

        gal1880cv = findViewById(R.id.gal1880cv);
        gal1880cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cargadores.this, gal1880cv.class);
                startActivity(i);
            }
        });

        salircargadores = findViewById(R.id.salircargadores);
        salircargadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cargadores.this, MainActivityBosch.class);
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