package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactoAdapter extends RecyclerView.Adapter<ContactoAdapter.ContactoViewHolder> {
    ArrayList<Contacto> contactos;
    OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(Contacto contacto);
    }
    public ContactoAdapter(ArrayList<Contacto> contactos, OnItemClickListener listener){
        this.contactos = contactos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ContactoViewHolder contactoViewHolder =
                new ContactoViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.contactoview, parent, false)
                );
        return contactoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder holder, int position) {
        Contacto contacto = contactos.get(position);
        holder.imagen.setImageResource(contacto.getImagen());
        holder.nombre.setText(contacto.getNombre() + ", " + (contacto.getApellidos()));
        holder.telefono.setText(String.valueOf(contacto.getNumero()));
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public class ContactoViewHolder extends RecyclerView.ViewHolder{
        ImageView imagen;
        TextView nombre;
        TextView telefono;

        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imagen);
            nombre = itemView.findViewById(R.id.nombre);
            telefono = itemView.findViewById(R.id.telefono);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        listener.onItemClick(contactos.get(getAdapterPosition()));
                    }
                }
            });
        }
    }
}

