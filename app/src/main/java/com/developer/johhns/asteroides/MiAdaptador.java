package com.developer.johhns.asteroides;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {

private LayoutInflater inflador ;
private List<String> lista ;

    public MiAdaptador(Context contexto, List<String> lista) {
        this.lista = lista;
        inflador = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public MiAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflador.inflate(R.layout.elemento_vista,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdaptador.ViewHolder holder, int position) {
      holder.titulo.setText( lista.get(position) );
      switch ( Math.round( (float) Math.random() * 3 ) ){
          case 0:
              holder.icono.setImageResource(R.drawable.ic_launcher_foreground);
              break;
          case 1:
              holder.icono.setImageResource(R.drawable.ic_launcher_foreground);
              break;
          default:
              holder.icono.setImageResource(R.drawable.ic_launcher_foreground);
              break;
      }
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titulo, subtitulo ;
        public ImageView icono ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo    = itemView.findViewById(R.id.titulo);
            subtitulo = itemView.findViewById(R.id.subtitulo);
            icono     = itemView.findViewById(R.id.icono) ;
        }
    }
}
