public class RodarAplicacaoCarro{
    public static void main(String[] args) {
        
        Carro carro1= new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("Gol");
        carro1.setcapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getcapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.49));

        Carro carro2= new Carro("Cinza", "Audi", 65);
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getcapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.49));

    }
}