package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    // double é o tipo de dado que o metodo retorna
    // se o metodo não retorna nada, usa-se void
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
