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

public class scrollbarcardviewpr extends AppCompatActivity {

    ImageView salir4;
    ImageView mfn11;
    ImageView mf2097;
    ImageView rm8511;
    ImageView m6200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scrollbarcardviewpr);

        salir4 = findViewById(R.id.salir4);
        salir4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, drawviewseg.class);
                startActivity(i);
            }
        });


        mfn11 = findViewById(R.id.mfn11);
        mfn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mf5n11.class);
                startActivity(i);
            }
        });

        mf2097 = findViewById(R.id.mf2097);
        mf2097.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mf2097.class);
                startActivity(i);
            }
        });

        rm8511 = findViewById(R.id.rm8511);
        rm8511.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, rm8511.class);
                startActivity(i);
            }
        });

        m6200 = findViewById(R.id.m6200);
        m6200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, m6200.class);
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