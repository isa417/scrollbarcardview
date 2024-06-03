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

public class MedidoresLaserBosch extends AppCompatActivity {

    ImageView bsglm15027c;
    ImageView bsgll380cg;
    ImageView bsglm20;
    ImageView bsglm40;
    ImageView salirbosch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_medidores_laser_bosch);

        bsglm40 = findViewById(R.id.bsglm40);
        bsglm40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MedidoresLaserBosch.this, bsglm40.class);
                startActivity(i);
            }
        });

        bsglm20 = findViewById(R.id.bsglm20);
        bsglm20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MedidoresLaserBosch.this, bsglm20.class);
                startActivity(i);
            }
        });

        bsgll380cg = findViewById(R.id.bsgll380cg);
        bsgll380cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MedidoresLaserBosch.this, bsgll380cg.class);
                startActivity(i);
            }
        });

        bsglm15027c = findViewById(R.id.bsglm15027c);
        bsglm15027c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MedidoresLaserBosch.this, bsglm15027c.class);
                startActivity(i);
            }
        });

        salirbosch = findViewById(R.id.salirbosch);
        salirbosch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MedidoresLaserBosch.this, MainActivityBosch.class);
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