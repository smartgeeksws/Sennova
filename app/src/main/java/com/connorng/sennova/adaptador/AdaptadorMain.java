package com.connorng.sennova.adaptador;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.connorng.sennova.CultivoDescripcionFragment;
import com.connorng.sennova.R;

import java.util.List;

public class AdaptadorMain extends RecyclerView.Adapter<AdaptadorMain.CultivosViewHolder> {
    Context context;
    List<CultivosEntidad> cultivosEntidads;


    public AdaptadorMain(List<CultivosEntidad> cultivosEntidads) {
        this.cultivosEntidads = cultivosEntidads;
    }

    @Override
    public CultivosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_main, parent,false);
        CultivosViewHolder cultivosViewHolder = new CultivosViewHolder(v);

        return cultivosViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CultivosViewHolder holder, final int position) {
        holder.cardViewPpal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"presiono"+cultivosEntidads.get(position).getNombreCultivo(),Toast.LENGTH_SHORT).show();
                SharedPreferences preferences = context.getSharedPreferences("configuracion",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("NOMBRECULTIVO",cultivosEntidads.get(position).getNombreCultivo());
                editor.commit();
            }
        });
        holder.urlImagen.setImageResource(cultivosEntidads.get(position).urlCultivo);
        holder.nombreCultivo.setText(cultivosEntidads.get(position).nombreCultivo);
        holder.descripcionCultivo.setText(cultivosEntidads.get(position).descripcionCultivo);
    }

    @Override
    public int getItemCount() {
        return cultivosEntidads.size();
    }



    public static class CultivosViewHolder extends RecyclerView.ViewHolder{

        ImageView urlImagen;
        TextView nombreCultivo, descripcionCultivo;
        CardView cardViewPpal;

        public CultivosViewHolder(View itemView) {
            super(itemView);
            cardViewPpal = (CardView)itemView.findViewById(R.id.llCardView);
                urlImagen = (ImageView)itemView.findViewById(R.id.ivUrlCultivo);
                nombreCultivo = (TextView)itemView.findViewById(R.id.tvNombreCultivo);
                descripcionCultivo = (TextView)itemView.findViewById(R.id.tvDescripcionCultivo);
        }
    }
}
