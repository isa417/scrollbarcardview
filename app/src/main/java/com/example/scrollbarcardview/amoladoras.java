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

public class amoladoras extends AppCompatActivity {

    ImageView saliramoladoras;
    ImageView gws180li;
    ImageView gws18v10;
    ImageView gws18v10p;
    ImageView gws18v10pc;
    ImageView gws18v10psc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amoladoras);

        gws18v10pc = findViewById(R.id.gws18v10pc);
        gws18v10pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(amoladoras.this, gws18v10pc.class);
                startActivity(i);
            }
        });

        gws18v10psc = findViewById(R.id.gws18v10psc);
        gws18v10psc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(amoladoras.this, gws18v10psc.class);
                startActivity(i);
            }
        });

        gws18v10p = findViewById(R.id.gws18v10p);
        gws18v10p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(amoladoras.this, gws18v10p.class);
                startActivity(i);
            }
        });

        gws18v10 = findViewById(R.id.gws18v10);
        gws18v10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(amoladoras.this, gws18v10.class);
                startActivity(i);
            }
        });

        gws180li = findViewById(R.id.gws180li);
        gws180li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(amoladoras.this, gws180li.class);
                startActivity(i);
            }
        });

        saliramoladoras = findViewById(R.id.saliramoladoras);
        saliramoladoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(amoladoras.this, MainActivityBosch.class);
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