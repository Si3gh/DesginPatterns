package adapter.object;

public class Circulo implements Forma {

    public void desenhar() {
        System.out.println("Desenha Circulo");
    }
    public void redimensionar() {
        System.out.println("Redimensiona Circulo");
    }
    public String descrição() {
        return "Objeto: Circulo";
    }

    public boolean isHide() {
        return false;
    }
}
