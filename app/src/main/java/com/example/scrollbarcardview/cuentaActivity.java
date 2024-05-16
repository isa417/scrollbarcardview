package com.example.scrollbarcardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class cuentaActivity extends AppCompatActivity {

    TextView tv_razonsocial, tv_nombre, tv_telefono, tv_correo;
    Button btn_cerrarsesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cuenta);

        tv_razonsocial = findViewById(R.id.tv_razonsocial);
        tv_nombre = findViewById(R.id.tv_nombre);
        tv_telefono = findViewById(R.id.tv_telefono);
        tv_correo = findViewById(R.id.tv_correo);
        btn_cerrarsesion = findViewById(R.id.btn_cerrarsesion);

        getUser();

        btn_cerrarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerrarsesion();
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.bottom_count);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.bottom_home) {
                startActivity(new Intent(getApplicationContext(), MenuInicioActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;

            } else if (itemId == R.id.bottom_favoritos) {
                startActivity(new Intent(getApplicationContext(), FavoritoActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;

            } else if (itemId == R.id.bottom_car) {
                startActivity(new Intent(getApplicationContext(), carritoActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;


            } else if (itemId == R.id.bottom_count) {
                return true;
            }

            return false;
        });
    }

    private void getUser() {
        tv_razonsocial.setText("Razón social: - ");
        tv_nombre.setText("Nombre: - ");
        tv_telefono.setText("telefono: - ");
        tv_correo.setText("Correo: - ");
    }

    private void cerrarsesion() {
        Intent intent = new Intent(cuentaActivity.this, login.class);
        startActivity(intent);
        finish();
    }
}
