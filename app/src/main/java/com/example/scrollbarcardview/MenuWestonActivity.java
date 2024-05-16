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

public class MenuWestonActivity extends AppCompatActivity {


    ImageView antorchas, salirmenuweston, caretas, inversores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_weston);

        antorchas = findViewById(R.id.antorchas);
        antorchas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuWestonActivity.this, antorchaActivity.class);
                startActivity(i);
            }
        });

        salirmenuweston = findViewById(R.id.salirmenuweston);
        salirmenuweston.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuWestonActivity.this, WestonSoldadura  .class);
                startActivity(i);
            }
        });

        caretas = findViewById(R.id.caretas);
        caretas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuWestonActivity.this, CaretasActivity.class);
                startActivity(i);
            }
        });

        inversores = findViewById(R.id.inversores);
        inversores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuWestonActivity.this, inversoresActivity.class);
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