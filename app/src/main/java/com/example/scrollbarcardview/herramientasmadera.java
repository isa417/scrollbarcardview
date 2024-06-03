package com.example.scrollbarcardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class herramientasmadera extends AppCompatActivity {

    ImageView salirMaders1;
    ImageView gks130;
    ImageView gks150;
    ImageView gks2065;
    ImageView gks235;
    ImageView fsn1400;
    ImageView gkf550;
    ImageView gof130;
    ImageView gho700;
    ImageView evs1617;
    ImageView gff1600;
    ImageView gst680;
    ImageView gst750;
    ImageView gst75e;
    ImageView gst90be;
    ImageView gst150bce;
    ImageView gho2682d;
    ImageView gss23ae;
    ImageView gex1251ae;
    ImageView gex40150;
    ImageView gss1401a;
    ImageView gss140;
    ImageView ghg180;
    ImageView gsa120;
    ImageView gop3028;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_herramientasmadera);

        gop3028 = findViewById(R.id.gop3028);
        gop3028.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gop3028.class);
                startActivity(i);
            }
        });

        gsa120 = findViewById(R.id.gsa120);
        gsa120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gsa120.class);
                startActivity(i);
            }
        });

        ghg180 = findViewById(R.id.ghg180);
        ghg180.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, ghg180.class);
                startActivity(i);
            }
        });

        gss140 = findViewById(R.id.gss140);
        gss140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gss140.class);
                startActivity(i);
            }
        });

        gss1401a = findViewById(R.id.gss1401a);
        gss1401a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gss1401a.class);
                startActivity(i);
            }
        });

        gex40150 = findViewById(R.id.gex40150);
        gex40150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gex40150.class);
                startActivity(i);
            }
        });

        gex1251ae = findViewById(R.id.gex1251ae);
        gex1251ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gex1251ae.class);
                startActivity(i);
            }
        });

        gss23ae = findViewById(R.id.gss23ae);
        gss23ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gss23ae.class);
                startActivity(i);
            }
        });

        gho2682d = findViewById(R.id.gho2682d);
        gho2682d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gho2682d.class);
                startActivity(i);
            }
        });

        gst150bce = findViewById(R.id.gst150bce);
        gst150bce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gst150bce.class);
                startActivity(i);
            }
        });

        gst90be = findViewById(R.id.gst90be);
        gst90be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gst90be.class);
                startActivity(i);
            }
        });

        gst75e = findViewById(R.id.gst75e);
        gst75e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gst75e.class);
                startActivity(i);
            }
        });

        gst750 = findViewById(R.id.gst750);
        gst750.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gst750.class);
                startActivity(i);
            }
        });

        gst680 = findViewById(R.id.gst680);
        gst680.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gst680.class);
                startActivity(i);
            }
        });

        gff1600 = findViewById(R.id.gff1600);
        gff1600.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gff1600.class);
                startActivity(i);
            }
        });

        evs1617 = findViewById(R.id.evs1617);
        evs1617.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, evs1617.class);
                startActivity(i);
            }
        });

        gho700 = findViewById(R.id.gho700);
        gho700.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gof1600ce.class);
                startActivity(i);
            }
        });

        gof130 = findViewById(R.id.gof130);
        gof130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gof130.class);
                startActivity(i);
            }
        });

        gkf550 = findViewById(R.id.gkf550);
        gkf550.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gkf550.class);
                startActivity(i);
            }
        });

        fsn1400 = findViewById(R.id.fsn1400);
        fsn1400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, fsn1400.class);
                startActivity(i);
            }
        });

        gks235 = findViewById(R.id.gks235);
        gks235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gks235.class);
                startActivity(i);
            }
        });

        gks2065 = findViewById(R.id.gks2065);
        gks2065.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gks2065.class);
                startActivity(i);
            }
        });

        gks150 = findViewById(R.id.gks150);
        gks150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gks150.class);
                startActivity(i);
            }
        });

        gks130 = findViewById(R.id.gks130);
        gks130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, gks130.class);
                startActivity(i);
            }
        });

        salirMaders1 = findViewById(R.id.salirMaders1);
        salirMaders1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(herramientasmadera.this, MainActivityBosch.class);
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