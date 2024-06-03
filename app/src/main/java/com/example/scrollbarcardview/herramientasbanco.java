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

public class herramientasbanco extends AppCompatActivity {


    ImageView salirherramientasbanco;
    ImageView gcm254;
    ImageView gcm12gdl;
    ImageView gts254;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_herramientasbanco);

        gts254 = findViewById(R.id.gts254);
        gts254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasbanco.this, gts254.class);
                startActivity(i);
            }
        });

        gcm12gdl = findViewById(R.id.gcm12gdl);
        gcm12gdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasbanco.this, gcm12gdl.class);
                startActivity(i);
            }
        });

        gcm254 = findViewById(R.id.gcm254);
        gcm254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasbanco.this, gcm254.class);
                startActivity(i);
            }
        });

        salirherramientasbanco = findViewById(R.id.salirherramientasbanco);
        salirherramientasbanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasbanco.this, MainActivityBosch.class);
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