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

public class scrollbarcardviewcorporal extends AppCompatActivity {

    ImageView salir6;
    ImageView apc;
    ImageView egv0;
    ImageView f8263cc;
    ImageView overol;
    ImageView pechera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scrollbarcardviewcorporal);

        salir6 = findViewById(R.id.salir6);
        salir6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcorporal.this, drawviewseg.class);
                startActivity(i);
            }
        });


        egv0 = findViewById(R.id.egv0);
        egv0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcorporal.this, egv076ol.class);
                startActivity(i);
            }
        });

        f8263cc = findViewById(R.id.f8263cc);
        f8263cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcorporal.this, f8263cc.class);
                startActivity(i);
            }
        });

        overol = findViewById(R.id.overol);
        overol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcorporal.this, otd.class);
                startActivity(i);
            }
        });

        pechera = findViewById(R.id.pechera);
        pechera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewcorporal.this, pechera.class);
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