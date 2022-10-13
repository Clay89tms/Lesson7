public class Krug implements Figure {
    double pi = 3.14;
    double r = 5;
    double S = pi * Math.pow(r, 2);
    double P = 2 * pi * r;

    public Krug() {
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
            System.out.printf("Периметр Круга: %.2f %n", P);
        }
        if (i == "S") {
            System.out.printf("Площадь Круга: %.2f %n", S);
        }
        return null;
    }
}