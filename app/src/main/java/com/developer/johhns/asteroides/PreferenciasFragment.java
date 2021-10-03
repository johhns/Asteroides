package com.developer.johhns.asteroides;

import android.os.Bundle;

import android.widget.Toast;

import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class PreferenciasFragment extends PreferenceFragmentCompat {

    final EditTextPreference fragmentos = (EditTextPreference) findPreference(
            "fragmentos");

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferencias, rootKey);
    }

    /*
Preference.OnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()

    {

        @Override
        public boolean onPreferenceChange (Preference preference, Objectn newValue){
        int valor;
        try {
            valor = Integer.parseInt((String) newValue);
        } catch (Exception e) {
            Toast.makeText(getActivity(), "Ha de ser un número",
                    Toast.LENGTH_SHORT).show();
            return false;
        }

        if (valor >= 0 && valor <= 9) {
            fragmentos.setSummary(
                    "En cuantos trozos se divide un asteroide (" + valor + ")");
            return true;
        } else {
            Toast.makeText(getActivity(), "Máximo de fragmentos 9",
                    Toast.LENGTH_SHORT).show();
            return false;
        }

    }
    }  );
    */

}
