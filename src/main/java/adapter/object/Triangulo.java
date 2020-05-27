package adapter.object;

public class Triangulo implements FormaGeometrica {

    private final double a;
    private final double b;
    private final double c;
    public Triangulo() {
        this(1.0d, 1.0d, 1.0d);
    }
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double perimetro() {
        return a + b + c;
    }
    @Override
    public void desenhaForma() {
        System.out.println("Desenhando Triangulo com area: " + area() + " e perimetro: " + perimetro());
    }

}
