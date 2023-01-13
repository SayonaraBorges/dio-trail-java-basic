public class OrdemInversa {
    public static void main(String[] args) throws Exception {
        int[] vetor = {5, 15, 8, -4, 3, 23};
        
        System.out.print("\nVetor: ");
        int contador=0;
        while (contador<(vetor.length)){
            System.out.print(vetor[contador]+" ");
            contador++;
            
        }
        System.out.print("\nVetor invertido: ");
        for (int i=(vetor.length-1); i>=0; i--){
            System.out.print(vetor[i]+" ");
        }

    }
}
