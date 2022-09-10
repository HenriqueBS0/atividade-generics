package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Armazenamento<Integer> integer = new Armazenamento<Integer>(1);
        Armazenamento<String> string = new Armazenamento<String>("Teste");
        Armazenamento<Scanner> scanner = new Armazenamento<Scanner>(new Scanner(System.in));
        
        Armazenamento<Cliente> cliente = new Armazenamento<Cliente>(new Cliente("Henrique", 18));


        System.out.println(integer);
        System.out.println(string);
        System.out.println(scanner);
        System.out.println(cliente);
    }
}
