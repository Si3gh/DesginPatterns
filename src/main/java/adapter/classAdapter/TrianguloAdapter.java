package adapter.classAdapter;

public class TrianguloAdapter extends Triangulo implements Forma {
    public TrianguloAdapter() {
        super();
    }
    @Override
    public void desenhar() {
        this.desenhaForma();
    }
    @Override
    public void redimensionar() {
        System.out.println("O triangulo não pôde ser redimensionado. Crie um novo com os valores adequados");
    }
    @Override
    public String descrição() {
        return "Objeto Triangulo";
    }
    @Override
    public boolean isHide() {
        return false;
    }

}
