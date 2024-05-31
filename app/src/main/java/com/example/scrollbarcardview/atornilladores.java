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

public class atornilladores extends AppCompatActivity {

    ImageView salirmenutalados;
    ImageView gsr180li;
    ImageView gsr18v60fc;
    ImageView gtb185li;
    ImageView gsb185li;
    ImageView gsb18v50;
    ImageView GSB18V90C;
    ImageView gsb18v150c;
    ImageView nuevoboschgo;
    ImageView gsr1000smart;
    ImageView gsr120li;
    ImageView gwb12v10;
    ImageView gsb120li;
    ImageView gsb12v30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_atornilladores);

        gsb12v30 = findViewById(R.id.gsb12v30);
        gsb12v30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gsb12v30.class);
                startActivity(i);
            }
        });

        gsb120li = findViewById(R.id.gsb120li);
        gsb120li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gsb120li.class);
                startActivity(i);
            }
        });

        gwb12v10 = findViewById(R.id.gwb12v10);
        gwb12v10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gwb12v10.class);
                startActivity(i);
            }
        });

        gsr120li = findViewById(R.id.gsr120li);
        gsr120li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gsr120li.class);
                startActivity(i);
            }
        });

        gsb185li = findViewById(R.id.gsb185li);
        gsb185li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gsb185li.class);
                startActivity(i);
            }
        });

        gsr1000smart = findViewById(R.id.gsr1000smart);
        gsr1000smart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gsr1000smart.class);
                startActivity(i);
            }
        });

        nuevoboschgo = findViewById(R.id.nuevoboschgo);
        nuevoboschgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, nuevoboschgo.class);
                startActivity(i);
            }
        });

        gsb18v150c = findViewById(R.id.gsb18v150c);
        gsb18v150c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gsb18v150c.class);
                startActivity(i);
            }
        });

        GSB18V90C = findViewById(R.id.GSB18V90C);
        GSB18V90C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gsb18v90c.class);
                startActivity(i);
            }
        });

        gsb18v50 = findViewById(R.id.gsb18v50);
        gsb18v50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gsb18v50.class);
                startActivity(i);
            }
        });


        gtb185li = findViewById(R.id.gtb185li);
        gtb185li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gtb185li.class);
                startActivity(i);
            }
        });

        gsr18v60fc = findViewById(R.id.gsr18v60fc);
        gsr18v60fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gsr18v60pc.class);
                startActivity(i);
            }
        });

        gsr180li = findViewById(R.id.gsr180li);
        gsr180li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, gsr180li.class);
                startActivity(i);
            }
        });

        salirmenutalados = findViewById(R.id.salirmenutalados);
        salirmenutalados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atornilladores.this, MainActivityBosch.class);
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