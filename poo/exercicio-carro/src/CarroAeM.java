class Carro {
    //atributos
    String cor;
    String modelo;
    int capacidadeTanque;
    //construtor
    Carro(){

    }

    //construtor com sobrecarga
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor=cor;
        this.modelo=modelo;
        this.capacidadeTanque=capacidadeTanque;
    }

    //gets e sets
    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setcapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getcapacidadeTanque(){
        return capacidadeTanque;
    }
    //metodos com regras de negocio
    double totalValorTanque (double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
