package com.example.scrollbarcardview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    private Button btn_login, btn_reg;
    private EditText et_user, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Configuración de la barra de título
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Login");
        }

        // Inicialización de vistas
        et_user = findViewById(R.id.et_user);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);
        btn_reg = findViewById(R.id.btn_reg); // Inicializar btn_reg

        // Configuración del OnClickListener para el botón de inicio de sesión
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLogin();
            }
        });

        // Configuración del OnClickListener para el botón de registro
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, registerActivity.class);
                startActivity(intent);
            }
        });
    }

    // Método para verificar los campos de inicio de sesión
    private void checkLogin() {
        String user = et_user.getText().toString().trim();
        String password = et_password.getText().toString().trim();

        if (user.isEmpty() || password.isEmpty()) {
            alertFail("Correo y contraseña son requeridos");
        } else {
            sendLogin(user, password);
        }
    }

    // Método para enviar los datos de inicio de sesión
    private void sendLogin(String user, String password) {
        Intent intent = new Intent(this, MenuInicioActivity.class);
        startActivity(intent);
        finish();
        Toast.makeText(this, "Enviando datos de inicio de sesión", Toast.LENGTH_SHORT).show();
    }

    // Método para mostrar un mensaje de alerta en caso de falla
    private void alertFail(String message) {
        new AlertDialog.Builder(this)
                .setTitle("Error")
                .setIcon(R.drawable.logo)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }
}