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

public class scrollbarcardviewaudifonos extends AppCompatActivity {

    ImageView salirauditiva;
    ImageView egm453;
    ImageView egem454hv;
    ImageView egm450;
    ImageView apta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scrollbarcardviewaudifonos);

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
}