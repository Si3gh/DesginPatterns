package adapter.object;

public class ObjectAdapterMain {
    public static void main(String[] args) {
        System.out.println("Criando desenho das formas geometricas...");
        Desenho drawing = new Desenho();
//        drawing.addForma(new Retangulo());
//        drawing.addForma(new Circulo());
        drawing.addForma(new FormaGeometricaAdapter(new Triangulo()));
        drawing.addForma(new FormaGeometricaAdapter(new Losango()));
        System.out.println("Desenhando...");
        drawing.draw();
        System.out.println("Redimensionando...");
        drawing.resize();
    }
}
