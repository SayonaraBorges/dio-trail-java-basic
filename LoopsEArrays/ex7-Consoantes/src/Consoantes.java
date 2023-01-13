import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] vetor = new String[6];
        int qtdconsoantes = 0;

        int contador=0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = teclado.next();

            if(!(letra.equalsIgnoreCase("a") | 
                 letra.equalsIgnoreCase("e") |
                 letra.equalsIgnoreCase("i") |
                 letra.equalsIgnoreCase("o") |
                 letra.equalsIgnoreCase("u")) ){
            vetor[contador]=letra;
            qtdconsoantes++;
            }
            contador++;

        } while (contador < vetor.length);
        System.out.print("Temos: ");
        for (String consoante : vetor) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("\nQuantidade de consoantes: "+qtdconsoantes);
        System.out.println("Quantidade de espaços: "+vetor.length);
        
    }
}
