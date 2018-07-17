package br.com.carloswgama.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.carloswgama.intents.dao.ContatoDAO;
import br.com.carloswgama.intents.model.Contato;

public class DetalhesActivity extends AppCompatActivity {

    private ContatoDAO dao = new ContatoDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        Intent intent = getIntent();
        //ID usado para popular
        int id = intent.getIntExtra("id", 0);
        Contato contato = dao.buscar(id);

        //Nome
        TextView tvNome = findViewById(R.id.detalhes_tv_nome);
        tvNome.setText(contato.getNome());
        //Email
        TextView tvEmail = findViewById(R.id.detalhes_tv_email);
        tvEmail.setText(contato.getEmail());
        //Telefone
        TextView tvTelefone = findViewById(R.id.detalhes_tv_telefone);
        tvTelefone.setText(contato.getTelefone());
        //Idade
        TextView tvIdade = findViewById(R.id.detalhes_tv_idade);
        tvIdade.setText(String.valueOf(contato.getIdade()));
        //Endereço
        TextView tvEndereco = findViewById(R.id.detalhes_tv_endereco);
        tvEndereco.setText(contato.getEndereco());
    }
}
