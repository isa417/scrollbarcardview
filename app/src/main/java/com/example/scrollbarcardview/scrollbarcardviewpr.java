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

public class scrollbarcardviewpr extends AppCompatActivity {

    ImageView salir4;
    ImageView mfn11;
    ImageView mf2097;
    ImageView rm8511;
    ImageView m6200;
    ImageView m36700;
    ImageView apdp1601;
    ImageView apdp1602;
    ImageView m37;
    ImageView mr31501;
    ImageView mr37586;
    ImageView m36000;
    ImageView m36897;
    ImageView apm10ch;
    ImageView apm10chd;
    ImageView r3m8577;
    ImageView r3m9010;
    ImageView aprondo;
    ImageView m36889;
    ImageView m36893;
    ImageView mf32078;
    ImageView mf32091;
    ImageView mf32096;
    ImageView apd1906c;
    ImageView mf37093;
    ImageView apd793;
    ImageView apd793c;
    ImageView apd1901;
    ImageView mc36001;
    ImageView mc36006;
    ImageView apd102;
    ImageView apd104;
    ImageView apd109;
    ImageView mc360921;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_scrollbarcardviewpr);

        mc360921 = findViewById(R.id.mc360921);
        mc360921.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mc360921.class);
                startActivity(i);
            }
        });

        apd109 = findViewById(R.id.apd109);
        apd109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apd109.class);
                startActivity(i);
            }
        });

        apd104 = findViewById(R.id.apd104);
        apd104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apd104.class);
                startActivity(i);
            }
        });

        apd102 = findViewById(R.id.apd102);
        apd102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apd102.class);
                startActivity(i);
            }
        });


        mc36006 = findViewById(R.id.mc36006);
        mc36006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mc36006.class);
                startActivity(i);
            }
        });

        mc36001 = findViewById(R.id.mc36001);
        mc36001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, m3c6001.class);
                startActivity(i);
            }
        });

        apd1901 = findViewById(R.id.apd1901);
        apd1901.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apd1901.class);
                startActivity(i);
            }
        });

        apd793c = findViewById(R.id.apd793c);
        apd793c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apd793c.class);
                startActivity(i);
            }
        });

        apd793 = findViewById(R.id.apd793);
        apd793.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apd793.class);
                startActivity(i);
            }
        });

        mf37093 = findViewById(R.id.mf37093);
        mf37093.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mf37093.class);
                startActivity(i);
            }
        });

        apd1906c = findViewById(R.id.apd1906c);
        apd1906c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apd1906c.class);
                startActivity(i);
            }
        });

        mf32096 = findViewById(R.id.mf32096);
        mf32096.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mf32096.class);
                startActivity(i);
            }
        });

        mf32091 = findViewById(R.id.mf32091);
        mf32091.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mf32091.class);
                startActivity(i);
            }
        });

        mf32078 = findViewById(R.id.mf32078);
        mf32078.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mf32078.class);
                startActivity(i);
            }
        });

        m36893 = findViewById(R.id.m36893);
        m36893.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, m36893.class);
                startActivity(i);
            }
        });

        m36889 = findViewById(R.id.m36889);
        m36889.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, m36889.class);
                startActivity(i);
            }
        });

        aprondo = findViewById(R.id.aprondo);
        aprondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, aprondo.class);
                startActivity(i);
            }
        });

        r3m9010 = findViewById(R.id.r3m9010);
        r3m9010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, r3m9010.class);
                startActivity(i);
            }
        });

        r3m8577 = findViewById(R.id.r3m8577);
        r3m8577.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, r3m8577.class);
                startActivity(i);
            }
        });

        apm10chd = findViewById(R.id.apm10chd);
        apm10chd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apm10chd.class);
                startActivity(i);
            }
        });

        apm10ch = findViewById(R.id.apm10ch);
        apm10ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apm10ch.class);
                startActivity(i);
            }
        });

        m36897 = findViewById(R.id.m36897);
        m36897.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, m36897.class);
                startActivity(i);
            }
        });

        m36000 = findViewById(R.id.m36000);
        m36000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, m36000.class);
                startActivity(i);
            }
        });

        mr31501 = findViewById(R.id.mr31501);
        mr31501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mr3501.class);
                startActivity(i);
            }
        });

        mr37586 = findViewById(R.id.mr37586);
        mr37586.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mr37586.class);
                startActivity(i);
            }
        });

        apdp1602 = findViewById(R.id.apdp1602);
        apdp1602.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apdp1602.class);
                startActivity(i);
            }
        });

        apdp1601 = findViewById(R.id.apdp1601);
        apdp1601.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, apdp1601.class);
                startActivity(i);
            }
        });

        m37 = findViewById(R.id.m37);
        m37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, m37502.class);
                startActivity(i);
            }
        });

        m36700 = findViewById(R.id.m36700);
        m36700.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, m36700.class);
                startActivity(i);
            }
        });


        salir4 = findViewById(R.id.salir4);
        salir4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, drawviewseg.class);
                startActivity(i);
            }
        });


        mfn11 = findViewById(R.id.mfn11);
        mfn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mf5n11.class);
                startActivity(i);
            }
        });

        mf2097 = findViewById(R.id.mf2097);
        mf2097.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, mf2097.class);
                startActivity(i);
            }
        });

        rm8511 = findViewById(R.id.rm8511);
        rm8511.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, rm8511.class);
                startActivity(i);
            }
        });

        m6200 = findViewById(R.id.m6200);
        m6200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(scrollbarcardviewpr.this, m6200.class);
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