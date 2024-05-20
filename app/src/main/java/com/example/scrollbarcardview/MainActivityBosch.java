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

public class MainActivityBosch extends AppCompatActivity {

    ImageView salirmenubosch;
    ImageView matilloATOR1;
    ImageView llavesimpacto;
    ImageView amoladoras;
    ImageView perforadores;
    ImageView aplicacionesdiversas;
    ImageView bateriabanner;
    ImageView cargadores;
    ImageView herramientamadera;
    ImageView herramientabanco;
    ImageView pulidora;
    ImageView medidoreslaser;
    ImageView discos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_bosch);

        medidoreslaser = findViewById(R.id.medidoreslaser);
        medidoreslaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, MedidoresLaserBosch.class);
                startActivity(i);
            }
        });

        salirmenubosch = findViewById(R.id.salirmenubosch);
        salirmenubosch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, drawviewind.class);
                startActivity(i);
            }
        });

        matilloATOR1 = findViewById(R.id.matilloATOR1);
        matilloATOR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, atornilladores.class);
                startActivity(i);
            }
        });

        llavesimpacto = findViewById(R.id.llavesimpacto);
        llavesimpacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, llavesdeimpacto.class);
                startActivity(i);
            }
        });

        amoladoras = findViewById(R.id.amoladoras);
        amoladoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, amoladoras.class);
                startActivity(i);
            }
        });

        perforadores = findViewById(R.id.perforadores);
        perforadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, martillosperforadores.class);
                startActivity(i);
            }
        });

        aplicacionesdiversas = findViewById(R.id.aplicacionesdiversas);
        aplicacionesdiversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, herramientasdiversas.class);
                startActivity(i);
            }
        });

        bateriabanner = findViewById(R.id.bateriabanner);
        bateriabanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, baterias.class);
                startActivity(i);
            }
        });

        cargadores = findViewById(R.id.cargadores);
        cargadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, cargadores.class);
                startActivity(i);
            }
        });

        herramientamadera = findViewById(R.id.herramientamadera);
        herramientamadera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, herramientasmadera.class);
                startActivity(i);
            }
        });

        herramientabanco = findViewById(R.id.herramientabanco);
        herramientabanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, herramientasbanco.class);
                startActivity(i);
            }
        });

        pulidora = findViewById(R.id.pulidora);
        pulidora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, pulidorarectificadora.class);
                startActivity(i);
            }
        });

        discos = findViewById(R.id.discos);
        discos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBosch.this, DiscosAbrasivosBosch.class);
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