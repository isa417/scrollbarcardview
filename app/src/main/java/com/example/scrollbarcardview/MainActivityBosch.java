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

public class MainActivityBosch extends AppCompatActivity {

    ImageView salirmenubosch;
    ImageView matilloATOR1;
    ImageView llavesimpacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_bosch);

        salirmenubosch = findViewById(R.id.salirmenubosch);
        salirmenubosch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, drawviewind.class);
                startActivity(i);
            }
        });

        matilloATOR1 = findViewById(R.id.matilloATOR1);
        matilloATOR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, atornilladores.class);
                startActivity(i);
            }
        });

        llavesimpacto = findViewById(R.id.llavesimpacto);
        llavesimpacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, llavesdeimpacto.class);
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