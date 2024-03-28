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

public class scrollbarcardviewlentes extends AppCompatActivity {

    ImageView salir1;
    ImageView ge101imaf;
    ImageView ge103c;
    ImageView ge104;
    ImageView ge105;
    ImageView ge109;
    ImageView ge111;
    ImageView egg217;
    ImageView ge203saf;
    ImageView mist6500050;
    ImageView mist75;
    ImageView msacopper;
    ImageView t14308;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scrollbarcardviewlentes);

        salir1 = findViewById(R.id.salir1);
        salir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, drawviewseg.class);
                startActivity(i);
            }
        });


        //lentes

        ge101imaf = findViewById(R.id.ge101imaf);
        ge101imaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.ge101imaf.class);
                startActivity(i);
            }
        });

        ge103c = findViewById(R.id.ge103c);
        ge103c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.ge103c.class);
                startActivity(i);
            }
        });

        ge104 = findViewById(R.id.ge104);
        ge104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, ge104caf.class);
                startActivity(i);
            }
        });

        ge105 = findViewById(R.id.ge105);
        ge105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.ge105.class);
                startActivity(i);
            }
        });


        ge109 = findViewById(R.id.ge109);
        ge109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.ge109.class);
                startActivity(i);
            }
        });

        ge111 = findViewById(R.id.ge111);
        ge111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.ge111.class);
                startActivity(i);
            }
        });

        egg217 = findViewById(R.id.egg217);
        egg217.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.egg217.class);
                startActivity(i);
            }
        });

        ge203saf = findViewById(R.id.ge203saf);
        ge203saf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.ge203saf.class);
                startActivity(i);
            }
        });

        mist6500050 = findViewById(R.id.mist6500050);
        mist6500050.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.mist6500050.class);
                startActivity(i);
            }
        });

        mist75 = findViewById(R.id.mist75);
        mist75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.g27805.class);
                startActivity(i);
            }
        });

        msacopper = findViewById(R.id.msacopper);
        msacopper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.msacopper.class);
                startActivity(i);
            }
        });

        t14308 = findViewById(R.id.t14308);
        t14308.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewlentes.this, com.example.scrollbarcardview.t14308.class);
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