public class Priamougolnik implements Figure {
    double a = 7.2;
    double b = 10.1;
    double c = a;
    double d = b;

    public Priamougolnik() {
    }

    @Override
    public double ploshad() {
        return (Math.pow(a, 2));
    }

    @Override
    public double perimetr() {
        return ((a + b + c + d));
    }

    @Override
    public String print(String i) {
        if (i == "P") {
            System.out.printf("Периметр Прямоугольника: %.2f %n", ((a + b + c + d)));
        }
        if (i == "S") {
            System.out.printf("Площадь Прямоугольника: %.2f %n", (Math.pow(a, 2)));
        }
        return null;
    }
}