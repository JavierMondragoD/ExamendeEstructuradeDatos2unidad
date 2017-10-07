
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
public class Binario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal;
        System.out.print("Introduzca un numero que usted decea: ");

        decimal = sc.nextInt();

        if (decimal >= 0) 
        {
            System.out.println();
            System.out.print("Es equivalente en binario " + decimal + "es: ");
            conversion(decimal);

        }else{
            decimal=decimal/-1;
            System.out.print("Es equivalente a notacion binaria de "+decimal+"es:-");
            conversion(decimal);
        }
        
    }

    public static void conversion(int decimal) {
        if (decimal < 2) {
            System.out.print(decimal);
            return;}
         else{
            conversion(decimal / 2);
            System.out.print(decimal%2);
            return;

        }
    }

}
