package com.developer.johhns.asteroides;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAcercaDe, btnSalir ;
    Toolbar toolbar ;
    Activity activity ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this ;
        toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        btnAcercaDe = findViewById(R.id.btnAcercaDe);
        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), AcercaDeActivity.class));
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int opcionSeleccionada = item.getItemId() ;
        switch ( opcionSeleccionada ) {
            case R.id.acercaDe:
                startActivity(new Intent(activity.getBaseContext(), AcercaDeActivity.class));
                break;
            case R.id.action_setting:
                startActivity(new Intent(activity.getBaseContext(), PreferenciasActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}