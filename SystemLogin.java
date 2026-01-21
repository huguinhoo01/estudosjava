// bem vindo ao meu novo programa! Aqui, simula um dashboard ok?? Caso queira parar a execução, digite um 5.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();

        int senhaCorreta = 832541;

        boolean acesso = verifyLogin(senha, senhaCorreta);

        if(acesso) {
            System.out.println("Acesso permitido, você será redirecionado ao dashboard.");
            dashboardJava(name, sc);
        } else {
            System.out.println("Acesso negado, tente novamente.");
        }

    }

    public static boolean verifyLogin(int senha, int senhaCorreta) {
        return senha == senhaCorreta;
    }

    public static void dashboardJava(String name, Scanner sc) {
        System.out.println("Bem vindo, " + name + "! Você chegou ao dashboard!");
        System.out.println("Selecione as opções abaixo:");
        int opcao;
        do {
            System.out.println("1 - Falar com o suporte");
            System.out.println("2 - Ver suas faturas");
            System.out.println("3 - Sugestão e Reclamações");
            System.out.println("4 - Atualização Cadastral");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.println("Redirecionando para o supote...");
                    break;
            
                case 2:
                    System.out.println("Abrindo suas faturas...");
                    break;

                case 3:
                    System.out.println("Transferindo você ao SAC...");
                    break;

                case 4: 
                    System.out.println("Redirecionando ao portal de Atualizações...");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao!= 5);

        sc.close();
    }
}
