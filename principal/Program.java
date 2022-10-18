package principal;

import entities.Pessoas;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        List<Pessoas> pessoas = new ArrayList<>();

        System.out.println("Entre com o numero de pessoas que serão taxadas: ");
        int num_pessoa = sc.nextInt();

        for (int i = 0; i < num_pessoa; i++) {
            
            System.out.println("\nInformações da #" + (i+1) + " pessoa: ");
            System.out.print("Qual o tipo de pessoa? (i/c)");
            char tipo = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Renda anual: ");
            Double renda_anual = sc.nextDouble();
            
            if (tipo == 'i') {
                System.out.print("Gasto saude: ");
                Double gasto_saude = sc.nextDouble();
                pessoas.add(new PessoaFisica(name, renda_anual, gasto_saude));
            } else if (tipo == 'c') {
                System.out.print("Numeros de funcionarios: ");
                int num_funcionarios = sc.nextInt();
                pessoas.add(new PessoaJuridica(name, renda_anual, num_funcionarios));
            } else {
                System.out.println("Valor digitado invalido: ");
                i--;
            }

        }

        System.out.println("\nTAXAS A PAGAR: ");
        Double soma_taxa = 0.0;
        for (Pessoas pessoa : pessoas) {
            Double taxa = pessoa.taxaImposto();
            System.out.println(pessoa.getNome() + ": $" + taxa);
            soma_taxa += taxa;
        }


        System.out.println("TOTAL DAS TAXAS: $" + soma_taxa);
        // D4T10R
    }

}
