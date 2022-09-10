package exercicio02;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Produto<Integer>(1, 2.32, new Date(), new Date()));
        System.out.println(new Produto<String>("1", 2.32, new Date(), new Date()));
    }
}
