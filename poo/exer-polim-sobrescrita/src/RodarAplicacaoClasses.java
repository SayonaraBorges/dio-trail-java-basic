public class RodarAplicacaoClasses {
    public static void main(String[] args)  {
        ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
        
        for (ClasseMae novavariavel : classes) {
            novavariavel.metodo1();
        //sobrescrita com polimorfismo em [0] e [1]
        //apenas sobrescrita em [2]
        }

        System.out.println(" ");

        for (ClasseMae novavariavel : classes) {
            novavariavel.metodo2();
        //sobrescrita com polimorfismo em [0] e [1]
        //apenas sobrescrita em [2]
        }

        System.out.println(" ");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
        //sobrescrita apenas - cricou o objeto e chamou método

    }
}
