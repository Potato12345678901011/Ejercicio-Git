public class Emerson {
    private String name;

    public Emerson(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("El nombre es " + this.name);
    }

    public static void main(String[] args) {
        Emerson persona = new Emerson("Emerson");
        persona.printName();
    }
}
