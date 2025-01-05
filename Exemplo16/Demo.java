package Facade;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IApartamentoService service = new ApartamentoService();

        System.out.println("Vamos cadastrar um Apartamento:");
        System.out.println("Digite abaixo o Código do Apartamento:");
        Long codigo = sc.nextLong();
        System.out.println("Agora digite o Endereço:");
        String endereco = sc.next();
        service.cadastratAp(new Apartamento(codigo, endereco));
    }
}
