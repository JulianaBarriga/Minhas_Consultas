package Singleton;

public class SingletonPropriety {
    private static SingletonPropriety singleton;
    private String value;
    private SingletonPropriety(String value){
        this.value = value;

    }

    public static SingletonPropriety getInstance(String value){
        if(singleton == null){
            singleton = new SingletonPropriety(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
