public class Kvadrat implements Figure {
    //Стороны Квардрата a,b,c,d (равны)
    double P;
    double S;
    double a = 5.85;
    double b = a;
    double c = a;
    double d = a;


    @Override
    public double Ploshad() {
        S = (a * c);
        System.out.println("Площадь Квадрата: " + S);
        return S;
    }

    @Override
    public double Perimetr() {
        P = (a + b + c + d);
        System.out.println("Периметр Квадрата : " + P);
        return P;
    }
}