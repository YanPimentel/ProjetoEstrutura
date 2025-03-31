package principal;

import entidades.Aluno;
import servicos.AlunoServicoImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        repositorio.AlunoRepositorioImpl repositorio = new repositorio.AlunoRepositorioImpl();
        AlunoServicoImpl servico = new AlunoServicoImpl(repositorio);

        int opcao;
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Atualizar Aluno");
            System.out.println("4. Remover Aluno");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    servico.cadastrarAluno(new Aluno(matricula, nome, idade));
                    break;
                case 2:
                    for (Aluno a : repositorio.listar()) {
                        System.out.println(a);
                    }
                    break;
                case 3:
                    System.out.print("Matrícula do Aluno a Atualizar: ");
                    matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Nova Idade: ");
                    idade = scanner.nextInt();
                    servico.atualizarAluno(matricula, new Aluno(matricula, nome, idade));
                    break;
                case 4:
                    System.out.print("Matrícula do Aluno a Remover: ");
                    matricula = scanner.nextInt();
                    servico.removerAluno(matricula);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static class AlunoRepositorioImpl {
    }
}