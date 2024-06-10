package com.example.scrollbarcardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MenuInicioActivity extends AppCompatActivity {
    ImageView seguridad;
    ImageView transporte;
    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;
    AdaptadorPersonajes adapter;
    TextView btn_cotización;
    ImageView industria;
    ImageView tornilleria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_inicio);

        listaPersonajes = new ArrayList<>();
        recyclerPersonajes = findViewById(R.id.RecycleId);

        // Configurar LinearLayoutManager horizontal y agregar espacio entre elementos
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerPersonajes.setLayoutManager(layoutManager);

        // Agregar espacio entre elementos del RecyclerView
        int espacioEntreElementos = getResources().getDimensionPixelSize(R.dimen.espacio_entre_elementos);
        EspacioItemDecoration espacioItemDecoration = new EspacioItemDecoration(espacioEntreElementos);
        recyclerPersonajes.addItemDecoration(espacioItemDecoration);

        adapter = new AdaptadorPersonajes(listaPersonajes);
        recyclerPersonajes.setAdapter(adapter);

        llenarPersonajes();


        seguridad = findViewById(R.id.seguridad);
        seguridad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuInicioActivity.this, drawviewseg.class);
                startActivity(i);
            }
        });

        tornilleria = findViewById(R.id.tornilleria);
        tornilleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuInicioActivity.this, menutornilleria.class);
                startActivity(i);
            }
        });

        transporte = findViewById(R.id.transporte);
        transporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuInicioActivity.this, transporte.class);
                startActivity(i);
            }
        });


        industria = findViewById(R.id.industria);
        industria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuInicioActivity.this, drawviewind.class);
                startActivity(i);
            }
        });


        btn_cotización = findViewById(R.id.btn_cotización);
        btn_cotización.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuInicioActivity.this, carritoActivity.class);
                startActivity(i);
            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.bottom_home) {
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
                startActivity(new Intent(getApplicationContext(), cuentaActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }
            return false;
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void llenarPersonajes() {
        listaPersonajes.add(new PersonajeVo("OTD", "Overol protector desechable", R.drawable.overol));
        listaPersonajes.add(new PersonajeVo("EGV076OL", "Chaleco Reflectante", R.drawable.chalecho));
        listaPersonajes.add(new PersonajeVo("F8263C-C", "Faja Elástica Reforzada", R.drawable.faja));
        listaPersonajes.add(new PersonajeVo("APC", "CASCO AP", R.drawable.casco));
        listaPersonajes.add(new PersonajeVo("APTA", "Tapón reutilizable silicón ", R.drawable.tapones));
        listaPersonajes.add(new PersonajeVo("EGM452HV", "Orejera Protectora", R.drawable.audifonosp));
        listaPersonajes.add(new PersonajeVo("MISTO18", "Guante anticorte", R.drawable.guantespop));
        listaPersonajes.add(new PersonajeVo("3MF2097", "Filtros para partículas P100", R.drawable.respiradorespop));
        listaPersonajes.add(new PersonajeVo("EGE 10 IMAF", "Lente De Seguridad Industrial", R.drawable.lentespopp));
        listaPersonajes.add(new PersonajeVo("MIST-6-500-075", "Lente aviador claro antifog anaranjada", R.drawable.lentespop));
        listaPersonajes.add(new PersonajeVo("R3M8511", "Respirador desechable", R.drawable.cubrebocaspop));
        listaPersonajes.add(new PersonajeVo("EGER553", "Rodilleras de alta resistencia ", R.drawable.rodilleras1pop));
        listaPersonajes.add(new PersonajeVo("EGER551", "Rodilleras de alta resistencia ", R.drawable.rodilleras2pop));
        adapter.notifyDataSetChanged(); // Notificar al adaptador que los datos han cambiado
    }
}



