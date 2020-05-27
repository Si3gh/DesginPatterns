package adapter.classAdapter;

public class LosangoAdapter extends Triangulo implements Forma {
    public LosangoAdapter() {
        super();
    }
    @Override
    public void desenhar() {
        this.desenhaForma();
    }
    @Override
    public void redimensionar() {
        System.out.println("O Losango não pôde ser redimensionado. Crie um novo com os valores adequados");
    }
    @Override
    public String descrição() {
        return "Objeto Losangos";
    }
    @Override
    public boolean isHide() {
        return false;
    }

}
