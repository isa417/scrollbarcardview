package com.example.scrollbarcardview;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class transporte extends AppCompatActivity {

    ImageView pernos;
    ImageView bujes;
    ImageView soportemotor;
    ImageView suspenciones;
    ImageView salirmenutransporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_transporte);

        pernos = findViewById(R.id.pernos);
        pernos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(transporte.this, pernos.class);
                startActivity(i);
            }
        });

        bujes = findViewById(R.id.bujes);
        bujes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(transporte.this, buje.class);
                startActivity(i);
            }
        });

        soportemotor = findViewById(R.id.soportemotor);
        soportemotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(transporte.this, soporteMotor.class);
                startActivity(i);
            }
        });

        suspenciones = findViewById(R.id.suspenciones);
        suspenciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(transporte.this, arandela.class);
                startActivity(i);
            }
        });

        salirmenutransporte = findViewById(R.id.salirmenutransporte);
        salirmenutransporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(transporte.this, MenuInicioActivity.class);
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