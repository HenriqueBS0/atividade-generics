package exercicio04;

import java.util.ArrayList;
import java.util.List;

public class HashTable<T> {
    private List<Element<T>> elementos = new ArrayList<Element<T>>();

    public boolean add(String chave, T dado) {
        if(get(chave) != null) {
            return false;
        }

        elementos.add(new Element<T>(chave, dado));

        return true;
    }

    public Element<T> get(String chave) {
        for (Element<T> element : elementos) {
            if(element.getChave() == chave) {
                return element;
            }
        }

        return null;
    }

}