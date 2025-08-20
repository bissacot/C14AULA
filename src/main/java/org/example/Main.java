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
        if(nome.equalsIgnoreCase("FIM")){
            break;
        }
        System.out.print("Digite a idade: ");
            int idade;
            try {
                idade = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Idade inválida. Tente novamente.");
                continue;
            }
        pessoa.add(new Pessoa(nome, idade));
    }

        System.out.println("Objeto(s) convertido(s) para JSON:");
        String json = gson.toJson(pessoa);
        System.out.println(json);
    }

    static class Pessoa {
        String cpf;
        int rg;

        Pessoa(String cpf, int rg) {
            this.nome = cpf;
            this.idade = rg;
        }
    }
}
