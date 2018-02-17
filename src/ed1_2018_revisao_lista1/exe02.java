package ed1_2018_revisao_lista1;

import java.util.Scanner;
public class exe02 {
public static void exe2 () {
    Scanner scan = new Scanner(System.in);
        double n1 = 0;
        double n2 = 0;
        System.out.println("informe o primeiro número");
        n1 = scan.nextDouble();
        System.out.println("informe o segundo número");
        n2 = scan.nextDouble();
        while (n2 == 0) {
            System.out.println("n2 não pode ser igual a Zero \n informe outro número");
            n2 = scan.nextDouble();
        }
        System.out.println("A divisão é "+n1/n2);
    }
    
}
