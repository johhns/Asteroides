package com.developer.johhns.asteroides;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.PreferenceManager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.developer.johhns.asteroides.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    public static ActivityMainBinding binding ;
    Button btnAcercaDe, btnSalir , btnConfig ;
    Toolbar toolbar ;
    public  Activity activity ;
    public   Context contexto ;
    public static View vista_ppl ;
    //public static AlmacenPuntuacionesArray almacen = new AlmacenPuntuacionesArray() ;
    public static  AlmacenPuntuacionesFicheroInterno almacen  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        activity  = this ;
        contexto  = this.getBaseContext() ;
        vista_ppl = findViewById(R.id.vista_principal);
        almacen   = new AlmacenPuntuacionesFicheroInterno() ;


        activity = this ;
        toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        btnAcercaDe = findViewById(R.id.btnAcercaDe);
        btnConfig = findViewById(R.id.btnConfig);
        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), AcercaDeActivity.class));
            }
        });

        btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity.getBaseContext(), PreferenciasActivity.class));
            }
        });

        btnSalir = findViewById( R.id.btnSalir ) ;
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mostrarPreferencias(view);
                startActivity(new Intent(activity.getBaseContext(), Puntuaciones.class));
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
                return true;
            case R.id.action_setting:
                startActivity(new Intent(activity.getBaseContext(), PreferenciasActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void mostrarPreferencias( View view ){
        SharedPreferences pref =
                PreferenceManager.getDefaultSharedPreferences(this);
        String s = "m??sica: "+ pref.getBoolean("musica",true)
                +", gr??ficos: " + pref.getString("graficos","?");
        Snackbar.make(view, s, Snackbar.LENGTH_LONG ).show();
    }

}