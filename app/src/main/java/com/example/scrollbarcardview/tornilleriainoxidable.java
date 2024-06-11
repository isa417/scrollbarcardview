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

public class tornilleriainoxidable extends AppCompatActivity {

    ImageView allen;
    ImageView tuercasinox;
    ImageView tornillohexagonal;
    ImageView pijasinox;
    ImageView barrasinox;
    ImageView salirmenuinox;
    ImageView rondana;
    ImageView chavetas;
    ImageView din;
    ImageView cb;
    ImageView tor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tornilleriainoxidable);

        tor = findViewById(R.id.tor);
        tor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, t.class);
                startActivity(i);
            }
        });

        cb = findViewById(R.id.cb);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, cb.class);
                startActivity(i);
            }
        });

        chavetas = findViewById(R.id.chavetas);
        chavetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, chavetas.class);
                startActivity(i);
            }
        });

        din = findViewById(R.id.din);
        din.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, din.class);
                startActivity(i);
            }
        });


        barrasinox = findViewById(R.id.barrasinox);
        barrasinox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, barrainox.class);
                startActivity(i);
            }
        });

        rondana = findViewById(R.id.rondana);
        rondana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, rondanainox.class);
                startActivity(i);
            }
        });

        pijasinox = findViewById(R.id.pijasinox);
        pijasinox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, pijainox.class);
                startActivity(i);
            }
        });

        tuercasinox = findViewById(R.id.tuercasinox);
        tuercasinox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, tuercasinox.class);
                startActivity(i);
            }
        });

        salirmenuinox = findViewById(R.id.salirmenuinox);
        salirmenuinox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, menutornilleria.class);
                startActivity(i);
            }
        });

        tornillohexagonal = findViewById(R.id.tornillohexagonal);
        tornillohexagonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, tornillohexagonal.class);
                startActivity(i);
            }
        });

        allen = findViewById(R.id.allen);
        allen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(tornilleriainoxidable.this, alleninox.class);
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