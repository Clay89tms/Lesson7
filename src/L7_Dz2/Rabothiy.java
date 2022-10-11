package L7_Dz2;

public class Rabothiy implements Printable{
    String name;

    public Rabothiy() {
    }

    public Rabothiy(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name + ": на должности Рабочего");
    }
}
