package ed1_2018_revisao_lista1;

import java.util.Scanner;
import java.math.*;

public class exe04 {
      public static void exe4() {
        Scanner scan = new Scanner(System.in);
        int a=0,b=0,c=0;
        System.out.println("Informe o valor de x²");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        while(a==0){
            System.out.println("x² não pode ser igual a zero\ninforme outro número");
            a=scan.nextInt();
        }
        double delta = ((b^2)-4*(a*c));
        if(delta < 0){
            System.out.println("Não existem raizes reais");
        }
        if(delta == 0){
            System.out.println("Raizes são iguais\ne seus valores são" + ((-b)/(2*a)));
        }
        if(delta>0){
            System.out.println("Raizes são iguais\ne seus valores são" +((-b)+(Math.sqrt(delta))/(2*a))+((-b)-(Math.sqrt(delta))/(2*a)));
        }
    }
    
}
