package ed1_2018_revisao_lista1;

import java.util.*;
public class exe01 {

    public static String Calcula(double nota1, double nota2, double nota3) {
        double media;
        String resultado;
        media = (nota1 + nota2 + nota3) / 3;
        if ((media >= 0) && (media < 3)) {
            resultado ="Reprovado";
            return resultado;
        } else if ((media >= 3) && (media < 7)) {
            resultado ="Reteste";
            return resultado;
        } else if ((media >= 6) && (media <= 10)) {
            resultado ="Aprovado";
            return resultado;
        }
        return null;
    }
     public static void exe1 () {
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, nota3;
        String resultado;
        int[] alunos = new int[3];
        int x = 3;

        System.out.println("informe a primeira a nota " + x);
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();

        resultado = Calcula(nota1, nota2, nota3);
        System.out.println("O Aluno esta "+resultado);
    }
}
