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

public class DiscosAbrasivosBosch extends AppCompatActivity {

    ImageView salirdiscos;
    ImageView bsdc412;
    ImageView bsdcd;
    ImageView bsdf40;
    ImageView d598;
    ImageView d599;
    ImageView d650;
    ImageView d694;
    ImageView bsdf60;
    ImageView bsdcl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_discos_abrasivos_bosch);


        bsdcl = findViewById(R.id.bsdcl);
        bsdcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscosAbrasivosBosch.this, bsdcl.class);
                startActivity(i);
            }
        });

        bsdf60 = findViewById(R.id.bsdf60);
        bsdf60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscosAbrasivosBosch.this, dsdf60.class);
                startActivity(i);
            }
        });

        d694 = findViewById(R.id.d694);
        d694.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscosAbrasivosBosch.this, disco694.class);
                startActivity(i);
            }
        });

        d650 = findViewById(R.id.d650);
        d650.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscosAbrasivosBosch.this, disco650.class);
                startActivity(i);
            }
        });

        d599 = findViewById(R.id.d599);
        d599.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscosAbrasivosBosch.this, disco599.class);
                startActivity(i);
            }
        });

        d598 = findViewById(R.id.d598);
        d598.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscosAbrasivosBosch.this, disco598.class);
                startActivity(i);
            }
        });

        bsdf40 = findViewById(R.id.bsdf40);
        bsdf40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscosAbrasivosBosch.this, bsdf40.class);
                startActivity(i);
            }
        });

        bsdcd = findViewById(R.id.bsdcd);
        bsdcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscosAbrasivosBosch.this, bsdcd.class);
                startActivity(i);
            }
        });

        bsdc412 = findViewById(R.id.bsdc412);
        bsdc412.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscosAbrasivosBosch.this, bsdc412.class);
                startActivity(i);
            }
        });

        salirdiscos = findViewById(R.id.salirdiscos);
        salirdiscos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DiscosAbrasivosBosch.this, MainActivityBosch.class);
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