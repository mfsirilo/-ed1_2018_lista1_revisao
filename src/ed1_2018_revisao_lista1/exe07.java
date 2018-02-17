package ed1_2018_revisao_lista1;

import java.util.*;

public class exe07 {

    public static void exe7() {
        int resultado = 1;
        for (int i = 1; i <= 15; i++) {
            if ((i % 2) != 0) {
                resultado = 2*i+1;
            }
        }
        System.out.println("Resultado final= " + resultado);
       
    }

}
