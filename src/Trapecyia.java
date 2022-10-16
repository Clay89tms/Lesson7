public class Trapecyia implements Figure {

    double a = 10;
    double b = 8;
    double c = 6;
    double d = 5;
    double S = 0;

    @Override
    public double ploshad() {
        S = ((a + b) / 2) * Math.sqrt((c * c) - Math.pow((((a - b) * (a - b) + (c * c) - (d * d)) / (2 * (a - b))), 2));
        return S;
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
            System.out.printf("Площадь Квадрата: %.2f %n", S);
        }
        return null;
    }
}
