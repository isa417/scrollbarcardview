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

public class scrollbarcardviewzapatos extends AppCompatActivity {

    ImageView salirCALZADO;
    ImageView bb362;
    ImageView bb651;
    ImageView bb703;
    ImageView cubrec;
    ImageView bz28n;
    ImageView bcr;
    ImageView beros;
    ImageView bhera;
    ImageView bpet;
    ImageView bz28h;
    ImageView bth;
    ImageView bthor;
    ImageView bcosmo;
    ImageView bapolo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scrollbarcardviewzapatos);

        bapolo = findViewById(R.id.bapolo);
        bapolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bapolo.class);
                startActivity(i);
            }
        });

        bcosmo = findViewById(R.id.bcosmo);
        bcosmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bcosmo.class);
                startActivity(i);
            }
        });

        bthor = findViewById(R.id.bthor);
        bthor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bthor.class);
                startActivity(i);
            }
        });

        bth = findViewById(R.id.bth);
        bth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bth.class);
                startActivity(i);
            }
        });

        bz28h = findViewById(R.id.bz28h);
        bz28h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bz28h.class);
                startActivity(i);
            }
        });

        bpet = findViewById(R.id.bpet);
        bpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bpet.class);
                startActivity(i);
            }
        });

        bhera = findViewById(R.id.bhera);
        bhera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bhera.class);
                startActivity(i);
            }
        });

        beros = findViewById(R.id.beros);
        beros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, beros.class);
                startActivity(i);
            }
        });

        bcr = findViewById(R.id.bcr);
        bcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bcr.class);
                startActivity(i);
            }
        });

        cubrec = findViewById(R.id.cubrec);
        cubrec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, cubrec.class);
                startActivity(i);
            }
        });

        bz28n = findViewById(R.id.bz28n);
        bz28n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bz28n.class);
                startActivity(i);
            }
        });

        bb703 = findViewById(R.id.bb703);
        bb703.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bb703.class);
                startActivity(i);
            }
        });

        bb651 = findViewById(R.id.bb651);
        bb651.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bb651.class);
                startActivity(i);
            }
        });

        bb362 = findViewById(R.id.bb362);
        bb362.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, bb362.class);
                startActivity(i);
            }
        });

        salirCALZADO = findViewById(R.id.salirCALZADO);
        salirCALZADO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewzapatos.this, drawviewseg.class);
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