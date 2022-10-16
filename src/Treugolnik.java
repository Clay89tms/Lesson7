public class Treugolnik implements Figure {
    double a = 6.2;
    double b = 8.6;
    double c = 10.99;
    double h;

    public Treugolnik() {
    }

    @Override
    public double ploshad() {
        h = Math.sqrt((a * a) - Math.pow((((c * c) + (a * a) - (b * b)) / (2 * c)), 2)); //4.836679847385279
        return ((c * h * 0.5));
    }

    @Override
    public double perimetr() {
        return ((a + b + c));
    }

    @Override
    public String print(String i) {
        if (i == "P") {
            System.out.printf("Периметр Треугольника: %.2f %n", ((a + b + c)));
        }
        if (i == "S") {
            System.out.printf("Площадь Треугольника: %.2f %n", ((c * h * 0.5)));
        }
        return null;
    }
}