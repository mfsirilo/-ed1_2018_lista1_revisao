package ed1_2018_revisao_lista1;

import java.math.*;
import java.util.*;

public class exe05 {

    public static void exe5() {
        Scanner scan = new Scanner(System.in);
        double numero;
        int escolha;
        System.out.println("Informe o tipo de operação a ser executada");
        escolha = scan.nextInt();
        scan.nextLine();

        System.out.println("Informe o número a ser calculado");
        numero = scan.nextDouble();
        scan.nextLine();

        switch (escolha) {
            case 101:
                double raiz = Math.sqrt(numero);
                System.out.println("A raiz é = " + raiz);
                break;

            case 102:
                double metade = (numero / 2);
                System.out.println("A metade é = " + metade);
                break;

            case 103:
                double dezporcento = (numero * .1);
                System.out.println("10% é = " + dezporcento);
                break;

            case 104:
                double odobro = numero * 2;
                System.out.println("O dobro é = " + odobro);
                break;
        }
    }

}
