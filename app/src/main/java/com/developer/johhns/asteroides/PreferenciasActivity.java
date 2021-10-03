package com.developer.johhns.asteroides;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PreferenciasActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
       getSupportFragmentManager().beginTransaction()
               .replace(android.R.id.content,new PreferenciasFragment())
               .commit() ;
    }

}
