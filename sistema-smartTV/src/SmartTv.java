public class SmartTv {
    boolean ligada = true;
    int cancal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume: "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume: "+volume);
    }

    public void aumentarCanal(){
        cancal++;
    }

    public void diminuirCanal(){
        cancal--;
    }

    public void mudarCanal( int novoCanal){
        cancal=novoCanal;
    }

}