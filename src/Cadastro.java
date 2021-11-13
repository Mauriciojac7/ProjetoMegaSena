import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome:");
        String name = scanner.nextLine();
        System.out.println("Ola, " + name);

         System.out.println("Qual sua idade :");
          String idade = scanner.nextLine();
          System.out.println(idade + ", ta veio");
    }
}
