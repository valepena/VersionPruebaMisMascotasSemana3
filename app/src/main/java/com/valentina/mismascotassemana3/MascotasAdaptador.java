package com.valentina.mismascotassemana3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotasViewHolder>{
    ArrayList<Mascotas> mascota;

    public MascotasAdaptador(ArrayList<Mascotas> mascota) {this.mascota = mascota; }

    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new MascotasViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MascotasViewHolder mascotasViewHolder, int position) {
        final Mascotas mascotas = mascota.get(position);

        mascotasViewHolder.imgFoto.setImageResource(mascotas.getFoto());
        mascotasViewHolder.tvNombreCV.setText(mascotas.getNombre());
        mascotasViewHolder.tvLikes.setText(mascotas.getLikes() +"");

        mascotasViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mascotas.setLikes(mascotas.getLikes()+1);
                notifyDataSetChanged();

            }
        });
    }

    @Override
    public int getItemCount() { return mascota.size(); }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvNombreCV;
        private ImageButton btnLike;
        private TextView tvLikes;


        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFoto         = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombreCV      = (TextView) itemView.findViewById(R.id.tvNombreCV);
            btnLike         = (ImageButton) itemView.findViewById(R.id.btnLike);
            tvLikes         = (TextView) itemView.findViewById(R.id.tvLikes);
        }
    }

}
