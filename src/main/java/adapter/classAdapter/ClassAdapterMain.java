package adapter.classAdapter;

public class ClassAdapterMain {
    public static void main(String[] args) {
        System.out.println("Creating drawing of shapes...");
        Desenho desenhando = new Desenho();
        desenhando.addForma(new Retangulo());
        desenhando.addForma(new Circulo());
        desenhando.addForma(new TrianguloAdapter());
        desenhando.addForma(new LosangoAdapter());
        System.out.println("Desenhando...");
        desenhando.desenhar();
        System.out.println("Redimensionando...");
        desenhando.redimensionar();
    }
}
