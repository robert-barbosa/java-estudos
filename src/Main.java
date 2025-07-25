import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = sc.nextInt();

        System.out.print("Digite um número: ");
        int b = sc.nextInt();

        System.out.print("Digite um número: ");
        int c = sc.nextInt();

        System.out.print("Digite um número: ");
        int d = sc.nextInt();

        int dif = ((a * b)-(c * d));

        System.out.println("Diferença = " + dif);

        sc.close();
    }
}