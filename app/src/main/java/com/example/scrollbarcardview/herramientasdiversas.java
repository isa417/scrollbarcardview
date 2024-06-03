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

public class herramientasdiversas extends AppCompatActivity {

    ImageView salirherramientas;
    ImageView gws12v7;
    ImageView gex12v125;
    ImageView gks12v26;
    ImageView gst12v70;
    ImageView gus12v300;
    ImageView propruner;
    ImageView gho12v20;
    ImageView gas12vli;
    ImageView gli12v300;
    ImageView gli12v330;
    ImageView gsa12vli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_herramientasdiversas);

        gsa12vli = findViewById(R.id.gsa12vli);
        gsa12vli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, gsa12vli.class);
                startActivity(i);
            }
        });

        gli12v330 = findViewById(R.id.gli12v330);
        gli12v330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, gli12v330.class);
                startActivity(i);
            }
        });

        gli12v300 = findViewById(R.id.gli12v300);
        gli12v300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, gli12v300.class);
                startActivity(i);
            }
        });

        gas12vli = findViewById(R.id.gas12vli);
        gas12vli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, gas12vli.class);
                startActivity(i);
            }
        });

        gho12v20 = findViewById(R.id.gho12v20);
        gho12v20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, gho12v20.class);
                startActivity(i);
            }
        });

        propruner = findViewById(R.id.propruner);
        propruner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, propruner.class);
                startActivity(i);
            }
        });

        gus12v300 = findViewById(R.id.gus12v300);
        gus12v300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, gus12v300.class);
                startActivity(i);
            }
        });


        gst12v70 = findViewById(R.id.gst12v70);
        gst12v70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, gst12v70.class);
                startActivity(i);
            }
        });

        gks12v26 = findViewById(R.id.gks12v26);
        gks12v26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, gks12v26.class);
                startActivity(i);
            }
        });

        gex12v125 = findViewById(R.id.gex12v125);
        gex12v125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, gex12v125.class);
                startActivity(i);
            }
        });

        gws12v7 = findViewById(R.id.gws12v7);
        gws12v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, gws12v76.class);
                startActivity(i);
            }
        });

        salirherramientas = findViewById(R.id.salirherramientas);
        salirherramientas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasdiversas.this, MainActivityBosch.class);
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