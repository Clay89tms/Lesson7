public class Trapecyia implements Figure {
    double S;
    double P;
    double a = 10;
    double b = 8;
    double c = 6;
    double d = 5;

    @Override
    public double Ploshad() {
        S = ((a + b) / 2) * Math.sqrt((c * c) - (((a - b) * (a - b) + (c * c) - (d * d)) / (2 * (a - b))) *
                (((a - b) * (a - b) + (c * c) - (d * d)) / (2 * (a - b))));
        System.out.println("Площадь Трапеции: " + S);
        return S;
    }

    @Override
    public double Perimetr() {
        P = (a + b + c + d);
        System.out.println("Периметр Трапеции : " + P);
        return P;
    }
}
