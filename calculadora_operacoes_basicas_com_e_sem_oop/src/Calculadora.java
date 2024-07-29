public class Calculadora {

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static double divisao(int a, int b) {
        return (double) a / b;
    }

    public static void calcular(String txt) {
        String cleanTxt = txt.trim().replaceAll("\\s+", "");
        char[] v = cleanTxt.toCharArray();
        int a = Integer.parseInt(String.valueOf(v[0]));
        String type = String.valueOf(v[1]);
        if (!(type.equals("+") ||
                type.equals("-") ||
                type.equals("*") ||
                type.equals("/"))) {
                    System.out.println("Tipo de operação inválida!");
                    return;
        }
        int b = Integer.parseInt(String.valueOf(v[2]));
        if (type.equals("+")) {
            System.out.println("O valor da soma é: " + soma(a, b));
        }
        if (type.equals("-")) {
            System.out.println("O valor da subtração é: " + subtracao(a, b));
        }
        if (type.equals("*")) {
            System.out.println("O valor da multiplicação é: " + multiplicacao(a, b));
        }
        if (type.equals("/")) {
            System.out.println("O valor da divisão é: " + divisao(a, b));
        }
    }
}
