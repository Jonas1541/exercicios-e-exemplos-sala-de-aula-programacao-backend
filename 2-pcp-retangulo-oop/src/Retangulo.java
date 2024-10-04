public class Retangulo {

    private double lado;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return lado * altura;
    }

    public double perimetro() {
        return 2 * (lado + altura);
    }

    public double diagonal() {
        return Math.sqrt(lado * lado + altura * altura);
    }
}
