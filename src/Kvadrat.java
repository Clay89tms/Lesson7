public class Kvadrat implements Figure {
    double a = 5.85;
    double b = a;
    double c = a;
    double d = a;

    public Kvadrat() {
    }
    @Override
    public double ploshad() {
        return ((a * c));
    }

    @Override
    public double perimetr() {
        return ((a + b + c + d));
    }

    @Override
    public String print(String i) {
        if (i == "P") {
            System.out.printf("Периметр Квадрата равен: %.2f %n", ((a + b + c + d)));
        }
        if (i == "S") {
            System.out.printf("Площадь Квадрата: %.2f %n", ((a * c)));
        }
        return null;
    }
}