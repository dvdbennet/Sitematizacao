package Aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Funcionario;

public class Program {
    // Lista para gravar dados//
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        // Scanner para ler o input//
        Scanner scanner = new Scanner(System.in);
        int opcao; //variavel utilizada no loop para definir a opção selecionada//

        do {                                                      //Loop de repetição que permite escolher a ação que deseja realizar//
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarFuncionario(scanner);
                    break;
                case 2:
                    exibirFuncionarios();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        } while (opcao != 3);  //Enquanto o imput for !=3 o bloco de instruções do ´do` continuará sendo executado//
        //pois a opção 3 é a que encerra o bloco//

        scanner.close();

    }

    private static void exibirMenu() {
        System.out.println("1. Adicionar Funcionário");
        System.out.println("2. Exibir Funcionários");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarFuncionario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Alergias: ");
        String alergias = scanner.nextLine();
        System.out.print("Problemas médicos: ");
        String problemasMed = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, idade, telefone, email, alergias, problemasMed);
        funcionarios.add(funcionario);
        System.out.println("Funcionario adicionado com sucesso.");
    }

    private static void exibirFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionario cadastrado. ");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }
}
