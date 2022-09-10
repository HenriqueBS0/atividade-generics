package exercicio04;

public class Main {
    public static void main(String[] args) {
        HashTable<String> hashTable = new HashTable<String>();
        hashTable.add("Nome", "Henrique");
        hashTable.add("Nome", "Fernando");
        hashTable.add("Sobrenome", "Carlos");

        System.out.println(hashTable.get("Nome"));
        System.out.println(hashTable.get("Sobrenome"));
    }
}
