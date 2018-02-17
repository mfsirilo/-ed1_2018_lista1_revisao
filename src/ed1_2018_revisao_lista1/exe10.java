package ed1_2018_revisao_lista1;

import java.util.*;

public class exe10 {

    public static void exe10() {
        Scanner scan = new Scanner(System.in);

        float massaInicial, massaConstante = (float) 0.05; //gramas

        System.out.println("digite a massa inicial:");
        massaInicial = scan.nextFloat();

        int contTempo = 0;
        while (massaInicial > massaConstante) {
            massaInicial = massaInicial / 2;
            contTempo = contTempo + 50;
        }
        System.out.println("tempo necessario:" + contTempo);
    }
}
