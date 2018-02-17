package ed1_2018_revisao_lista1;

import java.util.*;

public class Ed1_2018_revisao_lista1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe o número do exercício a ser executado (entre 1 a 15)\nSe deseja sair informe 99");
        int i;
        i = scan.nextInt();
        scan.nextLine();
        int count = 0;

        while (i != 99) {
            if (count == 1) {

                while ((i < 1) || (i > 15)) {
                    System.out.println("O exercício tem de ser entre 1 a 15\nTente novamente\nCaso queira sair informe 99");
                    i = scan.nextInt();
                    if (i == 99) {
                        break;
                    }
                }

            }
            count++;

            switch (i) {
                case 1:
                    exe01.exe1();
                    break;
                case 2:
                    exe02.exe2();
                    break;
                case 3:
                    exe03.exe3();
                    break;
                case 4:
                    exe04.exe4();
                    break;
                case 5:
                    exe05.exe5();
                    break;
                case 6:
                    exe06.exe6();
                    break;
                case 7:
                    exe07.exe7();
                    break;
            }
        }
    }
}
