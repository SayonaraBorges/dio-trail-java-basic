import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args)   {
        Random aleatorios = new Random(); // para gerar numeros 

        int[] numerosAleatorios = new int[20]; // criei vetor
        
        for ( int i=0; i<numerosAleatorios.length; i++){ // para armazenar
            int numero = aleatorios.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("              Números Aleatórios: "); // para imprimir 
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");    
        }

        System.out.print("\nAntecessores dos números gerados: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\n  Sucessores dos números gerados: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
