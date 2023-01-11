public class SimNão {
    public static void main(String[] args) {
        //OPERADORES RELACIONAIS
        String nomeUm = "Sayonara";
        String nomeDois = "SayonarA";
        System.out.println(nomeUm == nomeDois);

        String nome3 = "SANDRINHA";
        String nome4 = new String("SANDRINHA");
        System.out.println(nome3.equals(nome3)); //método equals comprara o conteúdos 
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? "+simNao);

        if(numero1<numero2){
            System.out.println("A condição é verdadeira ");    
        }
        
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? "+simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? "+simNao);
    }
}
