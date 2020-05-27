package adapter.object;

public class Retangulo implements Forma {

    public void desenhar() {
        System.out.println("Desenha Retangulo");
    }
    public void redimensionar() {
        System.out.println("Redimensiona Retangulo");
    }
    public String descrição() {
        return "Objeto: Rectangle";
    }

    public boolean isHide() {
        return false;
    }
}
