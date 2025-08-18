package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriel", 25);
        Gson gson = new Gson();
        String json = gson.toJson(pessoa);
        System.out.println("Objeto convertido para JSON:");
        System.out.println(json);
    }

    static class Pessoa {
        String nome;
        int idade;

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }
}
