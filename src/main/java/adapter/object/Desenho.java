package adapter.object;

import java.util.ArrayList;
import java.util.List;

public class Desenho {
    List<Forma> formas = new ArrayList<Forma>();
    public Desenho() {
        super();
    }
    public void addForma(Forma Forma) {
        formas.add(Forma);
    }
    public List<Forma> getformas() {
        return new ArrayList<Forma>(formas);
    }
    public void draw() {
        if (formas.isEmpty()) {
            System.out.println("Nada para desenhar");
        } else {
            formas.stream().forEach(Forma -> Forma.desenhar());
        }
    }
    public void resize() {
        if (formas.isEmpty()) {
            System.out.println("Nada para redimensionar");
        } else {
            formas.stream().forEach(Forma -> Forma.redimensionar());
        }
    }
}
