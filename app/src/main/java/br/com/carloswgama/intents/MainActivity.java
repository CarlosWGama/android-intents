package br.com.carloswgama.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import br.com.carloswgama.intents.dao.ContatoDAO;
import br.com.carloswgama.intents.util.ContatosAdapter;

public class MainActivity extends AppCompatActivity {

    private ContatoDAO dao = new ContatoDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recycle View
        RecyclerView recyclerView = findViewById(R.id.rv_contatos);

        //Adapter
        ContatosAdapter adapter = new ContatosAdapter(dao.buscarTodos());
        recyclerView.setAdapter(adapter);

        //Layout Manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
