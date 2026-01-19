import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();

        if(ageVerify(age)) {
          System.out.println("Bem vindo, " + name + "! Você está autorizado a entrar.");
        } else {
        System.out.println("Poxa, " + name + "! você não está autorizado a entrar.");
    }

        sc.close();
    }

    public static boolean ageVerify(int age) {
        return age >= 18;
    }
    
}
