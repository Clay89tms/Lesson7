public class Kvadrat implements Figure {
    double a = 5.85;
    double b = a;
    double c = a;
    double d = a;
    double P = (a + b + c + d);
    double S = (a * c);

    public Kvadrat() {
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
            System.out.printf("Периметр Квадрата равен: %.2f %n", P);
        }
        if (i == "S") {
            System.out.printf("Площадь Квадрата: %.2f %n", S);
        }
        return null;
    }
}