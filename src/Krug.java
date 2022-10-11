public class Krug implements Figure {
    double S;
    double P;
    double pi = 3.14;
    double r = 4.2;


    @Override
    public double Ploshad() {
        S = pi * r * r;
        System.out.println("Площадь Круга: " + S);
        return S;
    }

    @Override
    public double Perimetr() {
        P = 2 * pi * r;
        System.out.println("Периметр Круга (длинна окружности) : " + P);
        return P;
    }


}