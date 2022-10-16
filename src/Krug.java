public class Krug implements Figure {
    double pi = 3.14;
    double r = 5;

    public Krug() {
    }
    @Override
    public double ploshad() {
        return (pi * Math.pow(r, 2));
    }

    @Override
    public double perimetr() {
        return (2 * pi * r);
    }

    @Override
    public String print(String i) {
        if (i == "P") {
            System.out.printf("Периметр Круга: %.2f %n", (2 * pi * r));
        }
        if (i == "S") {
            System.out.printf("Площадь Круга: %.2f %n", (pi * Math.pow(r, 2)));
        }
        return null;
    }
}