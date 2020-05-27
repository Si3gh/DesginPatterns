package adapter.object;

public class FormaGeometricaAdapter implements Forma{
    private FormaGeometrica formaGeometrica;
    public FormaGeometricaAdapter(FormaGeometrica formaGeometrica) {
        super();
        this.formaGeometrica = formaGeometrica;
    }
    @Override
    public void desenhar() {
        formaGeometrica.desenhaForma();
    }
    @Override
    public void redimensionar() {
        System.out.println(descrição() + " não pode ser redimensionado. Crie outro com os valores apropriados");
    }
    @Override
    public String descrição() {
        if (formaGeometrica instanceof Triangulo) {
            return "Objeto Triangulo";
        } else if (formaGeometrica instanceof Losango) {
            return "Objeto Losango ";
        } else {
            return "Objeto desconhecido";
        }
    }
    @Override
    public boolean isHide() {
        return false;
    }

}
