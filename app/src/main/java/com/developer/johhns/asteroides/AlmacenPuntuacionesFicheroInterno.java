package com.developer.johhns.asteroides;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.developer.johhns.asteroides.databinding.ActivityMainBinding;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;


public class AlmacenPuntuacionesFicheroInterno implements AlmacenPuntuaciones {

    private static String FICHERO = "puntuaciones.txt";
    private Context context ;
    ActivityMainBinding binding = MainActivity.binding ;

    public AlmacenPuntuacionesFicheroInterno() {
        this.context = binding.vistaPrincipal.getContext() ;
        guardarPuntuacion(1000, "Pepito Dominguez", new Date().getTime());
        guardarPuntuacion(2000, "Juan Perez",new Date().getTime());
        guardarPuntuacion(3000, "Jose Sanchez",new Date().getTime());


    }

    public void guardarPuntuacion(int puntos, String nombre, long fecha) {
        try {
            FileOutputStream f = context.openFileOutput(FICHERO, Context.MODE_APPEND);
            String texto = puntos + " " + nombre + "\n";
            f.write(texto.getBytes());
            f.close();
        } catch (Exception e) {
            Log.e("Asteroides", e.getMessage(), e);
        }
    }

    public ArrayList<String> listaPuntuaciones(int cantidad) {
        ArrayList<String> result = new ArrayList<String>();
        try {
            FileInputStream f = context.openFileInput(FICHERO);
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(f));
            int n = 0;
            String linea;
            do {
                linea = entrada.readLine();
                if (linea != null) {
                    result.add(linea);
                    n++;
                }
            } while (n < cantidad && linea != null);
            f.close();
        } catch (Exception e) {
            Log.e("Asteroides", e.getMessage(), e);
        }
        return result;
    }

}
