public class Triangulo {
    //Atributos da classe
    public double a;
    public double b;
    public double c;

    //Métodos da classe
    public double p() {
        return (a + b + c) / 2;
    }

    public double area() {
        return Math.sqrt(p() * (p() - a) * (p() - b) * (p() - c));
    }
}