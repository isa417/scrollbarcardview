package com.example.scrollbarcardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scrollbarcardviewaudifonos extends AppCompatActivity {

    ImageView salirauditiva;
    ImageView egm453;
    ImageView egem454hv;
    ImageView egm450;
    ImageView apta;
    ImageView msaorejera;
    ImageView ta1;
    ImageView ta4;
    ImageView ta6;
    ImageView ta5;

    private ScrollView ScrollView;
    private int scrollX = 0;
    private int scrollY = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scrollbarcardviewaudifonos);

        ScrollView = findViewById(R.id.ScrollView); // Asegúrate de que este ID corresponda a tu ScrollView en el layout

        // Restaurar la posición de desplazamiento si hay un estado guardado
        if (savedInstanceState != null) {
            scrollX = savedInstanceState.getInt("scrollX");
            scrollY = savedInstanceState.getInt("scrollY");
            ScrollView.post(() -> ScrollView.scrollTo(scrollX, scrollY));
        }

        ta6 = findViewById(R.id.ta6);
        ta6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewaudifonos.this, ta6.class);
                startActivity(i);
            }
        });

        ta5 = findViewById(R.id.ta5);
        ta5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewaudifonos.this, ta5.class);
                startActivity(i);
            }
        });

        ta4 = findViewById(R.id.ta4);
        ta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewaudifonos.this, ta4.class);
                startActivity(i);
            }
        });

        ta1 = findViewById(R.id.ta1);
        ta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewaudifonos.this, ta1.class);
                startActivity(i);
            }
        });

        msaorejera = findViewById(R.id.msaorejera);
        msaorejera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewaudifonos.this, msaorejera.class);
                startActivity(i);
            }
        });

        salirauditiva = findViewById(R.id.salirauditiva);
        salirauditiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewaudifonos.this, drawviewseg.class);
                startActivity(i);
            }
        });

        egm453 = findViewById(R.id.egm453);
        egm453.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewaudifonos.this, egm453.class);
                startActivity(i);
            }
        });

        egem454hv = findViewById(R.id.egem454hv);
        egem454hv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewaudifonos.this, egem454hv.class);
                startActivity(i);
            }
        });

        egm450 = findViewById(R.id.egm450);
        egm450.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewaudifonos.this, egm450.class);
                startActivity(i);
            }
        });

        apta = findViewById(R.id.apta);
        apta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewaudifonos.this, apta.class);
                startActivity(i);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Guarda la posición de desplazamiento
        scrollX = ScrollView.getScrollX();
        scrollY = ScrollView.getScrollY();
        outState.putInt("scrollX", scrollX);
        outState.putInt("scrollY", scrollY);
    }

    // ... el resto de tus métodos ...

}


