import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
              
        System.out.println("Digite um número entre 0-10 para ver a tabuada: ");
        int numero = teclado.nextInt();

        System.out.println("Tabuada de "+numero);

        for (int i=1; i<=10; i++){
            System.out.println(i+" x "+numero+"= "+(i*numero));
        }
        
    }
}
