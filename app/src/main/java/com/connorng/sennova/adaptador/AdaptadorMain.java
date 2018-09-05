package com.connorng.sennova.adaptador;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.connorng.sennova.R;

import java.util.List;

public class AdaptadorMain extends RecyclerView.Adapter<AdaptadorMain.CultivosViewHolder> {

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
    public void onBindViewHolder(@NonNull CultivosViewHolder holder, int position) {
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

        public CultivosViewHolder(View itemView) {
            super(itemView);
                urlImagen = (ImageView)itemView.findViewById(R.id.ivUrlCultivo);
                nombreCultivo = (TextView)itemView.findViewById(R.id.tvNombreCultivo);
                descripcionCultivo = (TextView)itemView.findViewById(R.id.tvDescripcionCultivo);
        }
    }
}
