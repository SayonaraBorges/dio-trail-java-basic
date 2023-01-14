public class Retornos {
    public static void main(String[] args) {
        System.out.println("Exercício retornos");

        double areaQuadrado = Calcular.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Calcular.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Calcular.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);
 
    }
}
