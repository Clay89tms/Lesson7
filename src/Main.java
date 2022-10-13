public class Main {
    public static void main(String[] args) {
        double P;
        double S;
        Figure kvadrat = new Kvadrat();
        Figure krug = new Krug();
        Figure priamougolnik = new Priamougolnik();
        Figure treugolnik = new Treugolnik();
        Figure trapecyia = new Trapecyia();

        Figure[] mas = {kvadrat, krug, trapecyia, treugolnik, priamougolnik};
        double SPL = 0;
        double SPE = 0;
        for (Figure i : mas) {
            SPE += i.perimetr();
            SPL += i.ploshad();
        }
        System.out.printf("summa Perimetrov = %.2f %n", SPE);
        System.out.printf("Summa Ploshadey = %.2f %n", SPL);
        System.out.println();

        for (Figure i : mas){
            i.print("P");
            i.print("S");

        }
    }

}