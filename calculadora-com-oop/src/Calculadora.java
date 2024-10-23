//Classe calculadora com métodos e atributos estáticos
public class Calculadora {
    
    //Atributo estático
    static double PI = 3.14;

    //Métodos estáticos
    static double circunferencia(double raio) {
        return 2 * raio * PI;
    }

    static double area(double raio) {
        return PI * raio * raio;
    }
}
