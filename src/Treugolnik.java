public class Treugolnik implements Figure {
    double a = 6.2;
    double b = 8.6;
    double c = 10.99;
    double h = Math.sqrt((a * a) - Math.pow((((c * c) + (a * a) - (b * b)) / (2 * c)), 2)); //4.836679847385279
    double S = (c * h * 0.5);
    double P = (a + b + c);

    public Treugolnik() {
    }

    @Override
    public double ploshad() {
        return S;
    }

    @Override
    public double perimetr() {
        return P;
    }

    @Override
    public String print(String i) {
        if (i == "P") {
            System.out.printf("Периметр Треугольника: %.2f %n", P);
        }
        if (i == "S") {
            System.out.printf("Площадь Треугольника: %.2f %n", S);
        }
        return null;
    }
}