package ed1_2018_revisao_lista1;

import java.util.*;
public class exe01 {

    public String Calcula(String nota1, String nota2, String nota3) {
        double media;
        nota1.replaceAll( "," , "." );
        nota2.replaceAll( "," , "." );
        nota3.replaceAll( "," , "." );
        String resultado;
        media = (nota1 + nota2 + nota3) / 3;
        int resultado;
        if ((media >= 0) && (media < 3)) {
            resultado = System.out.println("Reprovado");
            return
        } else if ((media >= 3) && (media < 7)) {
            System.out.println("Reteste");
        } else if ((media >= 6) && (media <= 10)) {
            System.out.println("Aprovado");
        }
    }
     public void exe1 (String[] args) {
        Scanner scan = new Scanner(System.in);
        String nota1, nota2, nota3;
        String resultado;
        int[] alunos = new int[3];
        int x = 3;

        System.out.println("informe a primeira a nota " + x);
        nota1 = scan.next();
        nota2 = scan.next();
        nota3 = scan.next();

        resultado = Calcula(nota1, nota2, nota3);
        
        System.out.println("O Aluno esta ");

    }


    
}
