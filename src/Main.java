import java.util.Scanner;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultat = new int[5];

        System.out.println("Introdueix els 5 enters de a:");
        for (int i = 0; i < a.length; i++) {
            a[i] = teclat.nextInt();
        }

        System.out.println("Introdueix els 5 enters de b:");
        for (int i = 0; i < b.length; i++) {
            b[i] = teclat.nextInt();
        }

        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = a[i] + b[i];
        }

        System.out.print("a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.print("resultat: ");
        for (int i = 0; i < resultat.length; i++) {
            System.out.print(resultat[i] + " ");
        }
        System.out.println();
    }
}