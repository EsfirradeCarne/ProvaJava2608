
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ProvaQuestao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1; 
        int n2; 
        int n3;
        int n4; 
        int n5;
        int maior;
        int menor = 0;
        
        System.out.println("Informe o valor do Número 1: ");
        n1 = sc.nextInt();
        
         System.out.println("Informe o valor do Número 2: ");
        n2 = sc.nextInt();
        
         System.out.println("Informe o valor do Número 3: ");
        n3 = sc.nextInt();
        
         System.out.println("Informe o valor do Número 4: ");
        n4 = sc.nextInt();
        
         System.out.println("Informe o valor do Número 5: ");
        n5 = sc.nextInt();
     
       
       if ((n1 < n2)&&(n1 < n3)&&(n1 < n4)&&(n1 < n5)){
           menor = n1;
       
       }else 
           
       if ((n2 < n1)&&(n2 < n3)&&(n1 < n4)&&(n1 < n5)){
           menor = n2;
       
       }else
           
       if ((n3 < n1)&&(n3 < n2)&&(n3 < n4)&&(n3 < n5)){
           menor = n3;
           
       }else
           
       if ((n4 < n1)&&(n4 < n2)&&(n4 < n3)&&(n4 < n5)){ 
           menor = n4;
           
       }else
           
       if ((n5 < n1)&&(n5 < n2)&&(n5 < n3)&&(n5 < n4)){ 
           menor = n5;
       }
       
        System.out.println("O menor número é: " + menor);
           
           
       if ((n1 > n2)&&(n1 > n3)&&(n1 > n4)&&(n1 > n5)){
           maior = n1;
       
       }else 
           
       if ((n2 > n1)&&(n2 > n3)&&(n2 > n4)&&(n2 > n5)){
           maior = n2;
       
       }else 
           
       if ((n3 > n1)&&(n3 > n2)&&(n3 > n4)&&(n1 > n5)){
           maior = n3;
       
       }else 
           
       if ((n4 > n1)&&(n1 > n2)&&(n1 > n3)&&(n1 > n5)){
           maior = n4;
       
       }else 
           
       if ((n5 > n1)&&(n5 > n2)&&(n5 > n3)&&(n5 > n4)){
           maior = n5; 
           
           System.out.printf("O maior número é : " + maior);
           
           
          
           }      
    }
}

    

