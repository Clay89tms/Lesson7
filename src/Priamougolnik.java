public class Priamougolnik implements Figure {
    double a = 7.2;
    double b = 10.1;
    double c = a;
    double d = b;
    double S = Math.pow(a, 2);
    double P = (a + b + c + d);

    public Priamougolnik() {
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
            System.out.printf("Периметр Прямоугольника: %.2f %n", P);
        }
        if (i == "S") {
            System.out.printf("Площадь Прямоугольника: %.2f %n", S);
        }
        return null;
    }
}