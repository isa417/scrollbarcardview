package com.example.scrollbarcardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scrollbarcardviewguantes extends AppCompatActivity {

    Button trans;
    ImageView salirguantes;
    ImageView misto18;
    ImageView egg201;
    ImageView egg206;
    ImageView egg207;
    ImageView egg215;
    ImageView egg216;
    ImageView egg217;
    ImageView egg226;
    ImageView egg244lc;
    ImageView g27805;
    ImageView g48305;
    ImageView gne;
    ImageView gccd;
    ImageView gcl;
    ImageView gccr;
    ImageView gcomb;
    ImageView gelec;
    ImageView gelececo;
    ImageView geller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scrollbarcardviewguantes);

        geller = findViewById(R.id.geller);
        geller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, geller.class);
                startActivity(i);
            }
        });

        gelececo = findViewById(R.id.gelececo);
        gelececo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, gelececo.class);
                startActivity(i);
            }
        });

        gccr = findViewById(R.id.gccr);
        gccr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, gccr.class);
                startActivity(i);
            }
        });

        gelec = findViewById(R.id.gelec);
        gelec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, gelec.class);
                startActivity(i);
            }
        });

        gcomb = findViewById(R.id.gcomb);
        gcomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, gcomb.class);
                startActivity(i);
            }
        });

        gcl = findViewById(R.id.gcl);
        gcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, gcl.class);
                startActivity(i);
            }
        });

        gccd = findViewById(R.id.gccd);
        gccd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, gccd.class);
                startActivity(i);
            }
        });

        salirguantes = findViewById(R.id.salirguantes);
        salirguantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, drawviewseg.class);
                startActivity(i);
            }
        });

        misto18 = findViewById(R.id.misto18);
        misto18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, misto18.class);
                startActivity(i);
            }
        });

        egg201 = findViewById(R.id.egg201);
        egg201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, egg201.class);
                startActivity(i);
            }
        });

        egg206 = findViewById(R.id.egg206);
        egg206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, egg206.class);
                startActivity(i);
            }
        });

        egg207 = findViewById(R.id.egg207);
        egg207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, egg207.class);
                startActivity(i);
            }
        });

        egg215 = findViewById(R.id.egg215);
        egg215.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, egg215.class);
                startActivity(i);
            }
        });

        egg216 = findViewById(R.id.egg216);
        egg216.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, egg2016.class);
                startActivity(i);
            }
        });

        egg217 = findViewById(R.id.egg217);
        egg217.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, egg2017.class);
                startActivity(i);
            }
        });

        egg226 = findViewById(R.id.eggg226);
        egg226.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, egg226.class);
                startActivity(i);
            }
        });

        egg244lc = findViewById(R.id.egg244lc);
        egg244lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, egg244lc.class);
                startActivity(i);
            }
        });

        g27805 = findViewById(R.id.g27805);
        g27805.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, plastico.class);
                startActivity(i);
            }
        });

        g48305 = findViewById(R.id.g48305);
        g48305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, ggee48305.class);
                startActivity(i);
            }
        });

        gne = findViewById(R.id.gne);
        gne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewguantes.this, garc.class);
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
