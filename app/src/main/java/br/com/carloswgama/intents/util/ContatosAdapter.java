package br.com.carloswgama.intents.util;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.carloswgama.intents.DetalhesActivity;
import br.com.carloswgama.intents.R;
import br.com.carloswgama.intents.model.Contato;

public class ContatosAdapter extends RecyclerView.Adapter {

    public class ContatoViewHolder extends RecyclerView.ViewHolder {

        private TextView nome;

        public ContatoViewHolder(final View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.rv_tv_nome);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), DetalhesActivity.class);
                    intent.putExtra("id", contatos.get(getAdapterPosition()).getId());
                    itemView.getContext().startActivity(intent);
                }
            });
        }

        public TextView getNome() {
            return nome;
        }
    }

    private ArrayList<Contato> contatos;

    public ContatosAdapter(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_contatos, parent, false);
        return new ContatoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ContatoViewHolder h = (ContatoViewHolder) holder;
        h.getNome().setText(contatos.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }
}
