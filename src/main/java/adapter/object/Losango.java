package adapter.object;

public class Losango implements FormaGeometrica {

    private final double a;
    private final double b;
    private final double c;
    public Losango() {
        this(1.0d, 1.0d, 1.0d);
    }
    public Losango(double a, double b, double c) {
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
        System.out.println("Desenhando Losango com area: " + area() + " e perimetro: " + perimetro());
    }
}
