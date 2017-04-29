
package exer7;

import java.util.Scanner;

public class Exer7 {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        float parar, nota, soma = 0;
        int cont = 0;
        
       do{
        
            System.out.println("Digite a nota do aluno:");
            nota = input.nextFloat();
            
            System.out.println("Digite qualquer valor para continuar ou -1 para parar");
            parar = input.nextFloat();
       
           
         soma = nota + soma;
         cont++;              
           
       }while(parar != -1);
             
       
       
        System.out.println("A média do aluno é: " + soma / cont); 
      
    }
}