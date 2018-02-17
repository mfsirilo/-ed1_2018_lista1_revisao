package ed1_2018_revisao_lista1;

import java.util.*;

public class exe06 {

    public static void exe6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tipor de operação a ser realizada");
        int escolha = scan.nextInt();
        scan.nextLine();

        System.out.println("Informe o valor a ser calculado");
        double numero = scan.nextDouble();
        scan.nextLine();

        switch (escolha) {
            case 1:
                double dezporncento = numero - (numero * 0.1);
                System.out.println("Venda a vista desconto de 10%" + dezporncento);
                break;
            case 2:
                double trintadias = numero - (numero * 0.05);
                System.out.println("Venda a prazo 30 dias - desconto 5% " + trintadias);
                break;
            case 3:
                System.out.println("Venda a prazo 60 dias" + numero);
                break;
            case 4:
                double mais5pcento = numero + (numero * 0.05);
                System.out.println("Venda com 90 dias - 5% de acrecimo" + mais5pcento);
                break;
            case 5:
                double debito = numero - (numero * 0.08);
                System.out.println("Venda debito - desconto 8% " + debito);
                break;
            case 6:
                double credito = numero - (numero * 0.07);
                System.out.println("Venda credito - desconto 7% " + credito);
                break;

        }

    }

}
