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
    ImageView salir2;

    ImageView misto18;
    ImageView egg201;
    ImageView egg206;
    ImageView egg207;
    ImageView egg215;
    ImageView egg216;
    ImageView egg217;
    ImageView egg226;
    ImageView egg244lc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        salir2 = findViewById(R.id.salir2);
        salir2.setOnClickListener(new View.OnClickListener() {
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

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }
}
