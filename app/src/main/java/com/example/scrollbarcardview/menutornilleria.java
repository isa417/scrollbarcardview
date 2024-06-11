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

public class menutornilleria extends AppCompatActivity {

    ImageView acero;
    ImageView inoxidable;
    ImageView salirmenutorssprincipal;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menutornilleria);

        salirmenutorssprincipal = findViewById(R.id.salirmenutorssprincipal);
        salirmenutorssprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menutornilleria.this, MenuInicioActivity.class);
                startActivity(i);
            }
        });

        inoxidable = findViewById(R.id.inoxidable);
        inoxidable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menutornilleria.this, tornilleriainoxidable.class);
                startActivity(i);
            }
        });

        acero = findViewById(R.id.acero);
        acero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menutornilleria.this, tornilleria.class);
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