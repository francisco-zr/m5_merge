import java.util.Scanner;

public class Array{
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int [] numeros = new int [6];
    int i = 0;
    int k = 0;

    while(i < 6){
        numeros[i] = scan.nextInt();
        i++;     
    }

    System.out.println("Número a buscar:");
    int numero = scan.nextInt();

    while(k<6){
        if (numeros[k] == numero){
            System.out.println ("S'ha trobat el número a la posició: " + (k + 1));
            break;
        }
        k++;
    }
    if(k == 6){
        System.out.println ("No s'ha trobat el número");
    }



    }
}