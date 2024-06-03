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

public class pulidorarectificadora extends AppCompatActivity {

    ImageView salirherramientapulidora;
    ImageView gpo12ce;
    ImageView ggs28;
    ImageView ggs28l;
    ImageView ggs28ce;
    ImageView ggs28lce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pulidorarectificadora);

        ggs28lce = findViewById(R.id.ggs28lce);
        ggs28lce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pulidorarectificadora.this, ggs28lce.class);
                startActivity(i);
            }
        });

        ggs28ce = findViewById(R.id.ggs28ce);
        ggs28ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pulidorarectificadora.this, ggs28ce.class);
                startActivity(i);
            }
        });

        ggs28l = findViewById(R.id.ggs28l);
        ggs28l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pulidorarectificadora.this, ggs28l.class);
                startActivity(i);
            }
        });

        ggs28 = findViewById(R.id.ggs28);
        ggs28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pulidorarectificadora.this, ggs28.class);
                startActivity(i);
            }
        });

        gpo12ce = findViewById(R.id.gpo12ce);
        gpo12ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pulidorarectificadora.this, gpo12ce.class);
                startActivity(i);
            }
        });

        salirherramientapulidora = findViewById(R.id.salirherramientapulidora);
        salirherramientapulidora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pulidorarectificadora.this, MainActivityBosch.class);
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