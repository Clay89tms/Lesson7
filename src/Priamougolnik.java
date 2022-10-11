public class Priamougolnik implements Figure {
    double S;
    double P;
    double a = 7.2;
    double b = 10.1;
    double c = a;
    double d = b;

    public Priamougolnik() {
    }

    public Priamougolnik(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double Ploshad() {
        S = (a * b);
        System.out.println("Площадь Прямоугольника: " + S);
        return S;
    }

    @Override
    public double Perimetr() {
        P = (a + b + c + d);
        System.out.println("Периметр Прямоугольника : " + P);
        return P;
    }

}