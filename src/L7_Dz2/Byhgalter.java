package L7_Dz2;

public class Byhgalter implements Printable {
    String name;

    public Byhgalter() {
    }

    public Byhgalter(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name + ": на должности Бухгалтера");
    }
}
