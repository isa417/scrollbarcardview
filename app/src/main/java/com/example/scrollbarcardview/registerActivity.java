package com.example.scrollbarcardview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class registerActivity extends AppCompatActivity {

    EditText stRazonsocial, stNombre, stTelefono, stCorreo, stContraseña, stConfiContraseña;
    Button btn_registrar;
    String razonsocial, nombre, telefono, correo, contraseña, confiContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Configuración de la barra de título
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Register");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Habilitar EdgeToEdge (si es necesario)
        EdgeToEdge.enable(this);

        // Inicialización de vistas
        stRazonsocial = findViewById(R.id.stRazonsocial);
        stNombre = findViewById(R.id.stNombre);
        stTelefono = findViewById(R.id.stTelefono);
        stCorreo = findViewById(R.id.stCorreo);
        stContraseña = findViewById(R.id.stContraseña);
        stConfiContraseña = findViewById(R.id.stConfiContraseña);
        btn_registrar = findViewById(R.id.btn_registrar); // Inicializar btn_registrar

        // Configuración del OnClickListener para el botón de registro
        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkRegister();
            }
        });
    }

    private void checkRegister() {
        razonsocial = stRazonsocial.getText().toString();
        nombre = stNombre.getText().toString();
        telefono = stTelefono.getText().toString();
        correo = stCorreo.getText().toString();
        contraseña = stContraseña.getText().toString();
        confiContraseña = stConfiContraseña.getText().toString();

        if (razonsocial.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || correo.isEmpty() || contraseña.isEmpty()) {
            alertFail("Rellena todos los campos");
        } else if (!contraseña.equals(confiContraseña)) {
            alertFail("La contraseña y la confirmación de contraseña no coinciden");
        } else {
            sendRegister();
        }
    }

    private void sendRegister() {
        alertSuccess("El registro es exitoso");
    }

    private void alertSuccess(String s) {
        new AlertDialog.Builder(this)
                .setTitle("Success")
                .setIcon(R.drawable.logo)
                .setMessage(s)
                .setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }
                }).show();
    }

    private void alertFail(String a) {
        new AlertDialog.Builder(this)
                .setTitle("Failed")
                .setIcon(R.drawable.logo)
                .setMessage(a)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();
    }
}