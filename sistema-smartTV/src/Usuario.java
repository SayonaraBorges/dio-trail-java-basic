public class Usuario {
    public static void main(String[] args) throws Exception {
        //método main que executa a aplicação
       SmartTv smartTv = new SmartTv();

        //Exibição do estado
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: "+smartTv.volume); 
        System.out.println("Canal atual: "+smartTv.cancal);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: "+smartTv.cancal);

       System.out.println("TV ligada? "+smartTv.ligada);
       smartTv.aumentarVolume();
       System.out.println("Volume atual: "+smartTv.volume);
       //Chamar o método desligar
       smartTv.desligar();
       System.out.println("Atualização do Status -> TV ligada? "+smartTv.ligada);
       //Chamar o método ligar
       smartTv.ligar();
       System.out.println("Atualização do Status -> TV ligada? "+smartTv.ligada);
       
    }
}
