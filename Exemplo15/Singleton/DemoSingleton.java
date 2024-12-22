package Singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        // Singleton permite apenas 1 instância
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        // Mesmo tendo sido chamado 2x, imprime somente a 1ª instância.
        System.out.println(singleton);
        System.out.println(singleton1);
    }

}
