public class Main {
    public static void main(String[] args) {
        double P;
        double S;
        Figure kvadrat = new Kvadrat();
//        kvadrat.Perimetr();
//        kvadrat.Ploshad();
//        System.out.println();
//
        Figure krug = new Krug();
//        krug.Perimetr();
//        krug.Ploshad();
//        System.out.println();
//
        Figure priamougolnik = new Priamougolnik();
//        priamougolnik.Perimetr();
//        priamougolnik.Ploshad();
//        System.out.println();
//
        Figure treugolnik = new Treugolnik();
//        treugolnik.Perimetr();
//        treugolnik.Ploshad();
//        System.out.println();
//
        Figure trapecyia = new Trapecyia();
//        trapecyia.Perimetr();
//        trapecyia.Ploshad();
//        System.out.println();
//
        double sumPer = 0;
        double[] MasPer = {krug.Perimetr(), priamougolnik.Perimetr(),
                treugolnik.Perimetr(), kvadrat.Perimetr(), trapecyia.Perimetr()};

        System.out.print("\nРеализуем массив объектов: \n{ ");
        for (int i = 0; i < 5; i++) {
            sumPer += MasPer[i];
            System.out.print(MasPer[i] + " ");
        }
        System.out.print("}");

        System.out.println("\nСумма Периметров 5 объектов: " + sumPer + "\n");
        double sumPlos = 0;
        double[] MasPlos = new double[]{krug.Ploshad(), priamougolnik.Ploshad(),
                treugolnik.Ploshad(), kvadrat.Ploshad(), trapecyia.Ploshad()};
        System.out.print("\nРеализуем массив объектов: \n{ ");
        for (int i = 0; i < 5; i++) {
            sumPlos += MasPlos[i];
            System.out.print(MasPlos[i] + " ");
        }
        System.out.print("}");
        System.out.println("\nСумма Площадей 5 объектов: " + sumPlos);
    }
}