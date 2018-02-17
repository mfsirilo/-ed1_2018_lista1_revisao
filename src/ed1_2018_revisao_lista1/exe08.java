package ed1_2018_revisao_lista1;
public class exe08 {
     
    public static void exe8(){
        int anoContratoCont;
        int anoContrato=2005;
        int anoAtual=2018;
        double salario=1000;
        
        for(anoContratoCont=anoContrato; anoContratoCont <= anoAtual; anoContratoCont++){
            
            System.out.println(anoContratoCont);
            
             if(anoContratoCont == anoContrato+1){
                
                int n=1;
                float aumentoPorc=0;
                aumentoPorc = (float) 0.015 * n;
                salario = salario + (aumentoPorc * salario);
                
             }
             
            if (anoContratoCont > anoContrato + 1) {

                int n = 2;
                float aumentoPorc = 0;
                aumentoPorc = (float) 0.015 * n;
                salario = salario + (aumentoPorc * salario);

            }
            System.out.println("valor ano " + anoContratoCont + " atual:" + salario);
        }
        
    }
}
