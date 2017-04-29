
package exer10selcit;

import javax.swing.JOptionPane;
      
public class Exer10SelCit {

    
    public static void main(String[] args) {
   
        String cidade[] = {"Campo Grande", "Três Lagoas","Maracaju", "Dourados", "Ponta Porã"};
        
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.QUESTION_MESSAGE, 
         null, cidade, cidade[0]);
        
         
         if (escolha.equals("Campo Grande")){ JOptionPane.showMessageDialog(null, "Você escolheu Campo Grande!");   
         }  
         if (escolha.equals("Três Lagoas")){ JOptionPane.showMessageDialog(null, "Você escolheu Três Lagoas!");  
         }
         if(escolha.equals("Maracaju")){ JOptionPane.showMessageDialog(null, "Você escolheu Maracaju!");
         }
         if(escolha.equals("Dourados")){ JOptionPane.showMessageDialog(null, "Você escolheu Dourados!");
         }
         if(escolha.equals("Ponta Porã")){ JOptionPane.showMessageDialog(null, "Você escolheu Ponta Porã!");
          }
         
    }
}