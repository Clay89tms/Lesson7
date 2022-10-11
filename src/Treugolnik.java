public class Treugolnik implements Figure {
    double S; //Площадь
    double P; //Периметр
    double a = 6.2;
    double b = 8.6;
    double c = 10.99;
    double h; //Высота


    @Override
    public double Ploshad() {
        h = Math.sqrt((a * a) - ((((c * c) + (a * a) - (b * b)) / (2 * c)) * (((c * c) + (a * a) - (b * b)) / (2 * c))));
        System.out.println("Вычесленная высота <h> треугольника равна: " + h);
        S = (c * h * 0.5);
        System.out.println("Площадь Треугольника: " + S);
        return S;
    }

    @Override
    public double Perimetr() {
        P = (a + b + c);
        System.out.println("Периметр Треугольника равен: " + P);
        return P;
    }

}