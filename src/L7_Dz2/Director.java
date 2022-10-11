package L7_Dz2;

public class Director implements Printable {
    String name;

    public Director() {
    }

    public Director(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name + ": на должности Директора");
    }
}
