package br.com.carloswgama.intents.dao;

import java.util.ArrayList;

import br.com.carloswgama.intents.model.Contato;

public class ContatoDAO {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public ContatoDAO() {
        contatos.add(new Contato(1,"Carlos", "carloswgama@gmail.com", "9999-9999", 27, "Rua C"));
        contatos.add(new Contato(2,"João", "joao@gmail.com", "8888-8888", 20, "Rua A"));
        contatos.add(new Contato(3,"Maria", "maria@gmail.com", "9666-6666", 37, "Rua B"));
        contatos.add(new Contato(4,"Claudio", "claudio@gmail.com", "9777-7777", 32, "Rua D"));
    }

    /** Busca todos usuários **/
    public ArrayList<Contato> buscarTodos() {
        return contatos;
    }

    /** Busca um usua´rio com base no seu ID */
    public Contato buscar(int id) {
        for (Contato c: contatos) {
            if (c.getId() == id) return c;
        }
        return null;
    }
}
