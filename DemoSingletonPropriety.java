package Singleton;

public class DemoSingletonPropriety {
    public static void main(String[] args) {
        SingletonPropriety singleton = SingletonPropriety.getInstance("Instância Única");
        SingletonPropriety singleton1 = SingletonPropriety.getInstance("Instância Única parte 2");
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());

    }
}
