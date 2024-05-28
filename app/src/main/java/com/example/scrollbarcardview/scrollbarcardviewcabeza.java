package com.example.scrollbarcardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scrollbarcardviewcabeza extends AppCompatActivity {

    ImageView salir5;
    ImageView apc;
    ImageView cama;
    ImageView micas;
    ImageView cma;
    ImageView micaa;
    ImageView mist6500;
    ImageView m36885;
    ImageView apb;
    ImageView mmsa;
    ImageView msabar;
    ImageView msarcc;
    ImageView msasolaa;
    ImageView msasolc;
    ImageView vmsa;
    SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scrollbarcardviewcabeza);

        vmsa = findViewById(R.id.vmsa);
        vmsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, vmsa.class);
                startActivity(i);
            }
        });

        msasolc = findViewById(R.id.msasolc);
        msasolc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, msasolc.class);
                startActivity(i);
            }
        });

        msasolaa = findViewById(R.id.msasolaa);
        msasolaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, msasolaa.class);
                startActivity(i);
            }
        });

        msarcc = findViewById(R.id.msarcc);
        msarcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, msarcc.class);
                startActivity(i);
            }
        });

        msabar = findViewById(R.id.msabar);
        msabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, msabar.class);
                startActivity(i);
            }
        });

        mmsa = findViewById(R.id.mmsa);
        mmsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, mmsa.class);
                startActivity(i);
            }
        });

        apb = findViewById(R.id.apb);
        apb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, apb.class);
                startActivity(i);
            }
        });

        m36885 = findViewById(R.id.m36885);
        m36885.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, m36885.class);
                startActivity(i);
            }
        });

        mist6500 = findViewById(R.id.mist6500);
        mist6500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, mist6500.class);
                startActivity(i);
            }
        });

        micaa = findViewById(R.id.micaa);
        micaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, micaa.class);
                startActivity(i);
            }
        });

        cma = findViewById(R.id.cma);
        cma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, cma.class);
                startActivity(i);
            }
        });

        micas = findViewById(R.id.micas);
        micas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, micas.class);
                startActivity(i);
            }
        });

        cama = findViewById(R.id.cama);
        cama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, cama.class);
                startActivity(i);
            }
        });

        salir5 = findViewById(R.id.salir5);
        salir5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, drawviewseg.class);
                startActivity(i);
            }
        });

        apc = findViewById(R.id.apc);
        apc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcabeza.this, apc.class);
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