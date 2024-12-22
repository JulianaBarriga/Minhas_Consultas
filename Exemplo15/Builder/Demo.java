package Builder;

public class Demo {
    public static void main(String[] args) {
//        Gerente gerente = new Gerente(new CheeseBurger());
//        Burger buger = gerente.buildBurger();
//        buger.print();

        // Para não ser necessário criar outro gerente, por exemplo:

//        Gerente gerente1 = new Gerente(new VeganBurger());
//        Burger buger1 = gerente1.buildBurger();
//        buger1.print(); // fazemos da seguinte forma:

        // Na classe "Gerente", criamos o setter de Builder, para usar assim:

        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurger());
        Burger burger = gerente.buildBurger();
        burger.print();

        gerente.setBuilder(new VeganBurger());
        Burger burger1 = gerente.buildBurger();
        burger1.print();






    }
}
