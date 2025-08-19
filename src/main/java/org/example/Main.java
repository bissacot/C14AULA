package org.example;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoa = new ArrayList<>();
        Gson gson = new Gson();

        //Pessoa pessoa = new Pessoa("Gabriel", 25);
        while (true) {
        System.out.print("Digite o nome (ou FIM para encerrar): ");
        String nome = scanner.nextLine();
        if(nome.equalsIgnoreCase(FIM)){
            break;
        }
        System.out.print("Digite a idade: ");
            int idade;
        pessoas.add(new Pessoa(nome, idade))
    }

        System.out.println("Objeto(s) convertido(s) para JSON:");
        String json = gson.toJson(pessoa);
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
