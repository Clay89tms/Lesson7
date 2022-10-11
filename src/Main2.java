import L7_Dz2.Byhgalter;
import L7_Dz2.Director;
import L7_Dz2.Rabothiy;

public class Main2 {
    public static void main(String[] args){
        Director director = new Director("Иван Михайлович");
        director.print();

        Byhgalter byhgalter = new Byhgalter("Лариса Васильевна");
        byhgalter.print();

        Rabothiy rabothiy = new Rabothiy("Александр Петрович");
        rabothiy.print();
    }
}
