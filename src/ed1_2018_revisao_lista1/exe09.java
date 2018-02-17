package ed1_2018_revisao_lista1;
import java.util.*;
public class exe09 {
    
    Scanner ler = new Scanner(System.in);
    
    public float eni,E;
    public int i;
    
    public void leitura(){
        System.out.println("Digite um numero positivo:");
        eni = ler.nextFloat();
        float aux=eni%2;
        if(aux == 1){
            System.out.println("numero nao positivo:");
        }
    }
    
    public void formulando(){
       float eniFatorial = 1;
       
       for(i=1; i<=eni;i++){
           eniFatorial = eniFatorial * i; 
       }
        System.out.println(eniFatorial);
       // E =  1+1/1! + 1/2! + 1/N!
       E = 1 + (1/(1*1)) + (1/(2*1)) + (1/eniFatorial);
        System.out.println("E:" + E);
    }    
    
}
    
    
