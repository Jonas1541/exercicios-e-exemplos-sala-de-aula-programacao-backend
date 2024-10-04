public class Retangulo {

    private double largura;
    private double altura;

    // Construtor que começa vazio
    public Retangulo() {
    }

    // Construtor que começa preenchido
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Getters e Setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Métodos do retângulo
    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return largura * 2 + altura * 2;
    }

    public double diagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
}
