package com.developer.johhns.asteroides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAcercaDe, btnSalir ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAcercaDe = findViewById(R.id.btnAcercaDe);
        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarAcerdaDe( view );
            }
        });

        btnSalir = findViewById( R.id.btnSalir ) ;
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    public void mostrarAcerdaDe(View v) {
        startActivity(new Intent(v.getContext(), AcercaDeActivity.class));
    }


}