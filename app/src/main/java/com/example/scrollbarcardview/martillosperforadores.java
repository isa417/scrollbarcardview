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

public class martillosperforadores extends AppCompatActivity {

    ImageView salirmartillos;
    ImageView gbh180li;
    ImageView gbh185li;
    ImageView gbh187li;
    ImageView gbh18v26d;
    ImageView gbh1836c;
    ImageView gbh18v40c;
    ImageView gbh18v45c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_martillosperforadores);

        gbh18v45c = findViewById(R.id.gbh18v45c);
        gbh18v45c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(martillosperforadores.this, gbh18v45c.class);
                startActivity(i);
            }
        });

        gbh18v40c = findViewById(R.id.gbh18v40c);
        gbh18v40c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(martillosperforadores.this, gbh18v40c.class);
                startActivity(i);
            }
        });

        gbh1836c = findViewById(R.id.gbh1836c);
        gbh1836c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(martillosperforadores.this, gbh18v36c.class);
                startActivity(i);
            }
        });


        gbh18v26d = findViewById(R.id.gbh18v26d);
        gbh18v26d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(martillosperforadores.this, gbh18v26d.class);
                startActivity(i);
            }
        });

        gbh187li = findViewById(R.id.gbh187li);
        gbh187li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(martillosperforadores.this, gbh187li.class);
                startActivity(i);
            }
        });

        gbh185li = findViewById(R.id.gbh185li);
        gbh185li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(martillosperforadores.this, gbh185li.class);
                startActivity(i);
            }
        });

        gbh180li = findViewById(R.id.gbh180li);
        gbh180li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(martillosperforadores.this, gbh180l.class);
                startActivity(i);
            }
        });

        salirmartillos = findViewById(R.id.salirmartillos);
        salirmartillos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(martillosperforadores.this, MainActivityBosch.class);
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