/*
 * APLICAÇÃO QUE SOLICITA AO USUÁRIO QUANTOS PRODUTOS
ELE DESEJA COMPRAR. SE O VALOR FINAL DAS COMPRAS FOR MAIOR
QUE 1000 REAIS DE A ELE UM DESCONTO DE 10%

 */
package aula2infoa;

import java.util.Scanner;

public class controle_compras {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int quant= 0;
       double valor = 0;
       double total = 0;
       System.out.println(" Informe a quantidade de compras");
       quant = entrada.nextInt();
       
       for (int cont = 1; cont<=quant; cont ++){
           System.out.println("Informe o valor da "+ cont+ " compra");
           valor = entrada.nextDouble();
           total = total + valor;
       } 
       if (total > 1000){
           total = total - (total*10)/100;
       }
          System.out.println("Valor final das compras: "+ total); 
       }
       
   }

