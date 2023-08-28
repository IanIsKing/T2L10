public class Main {
    public static void main(String[] args) {
        // Create an instance of the Factory class to generate animals
        Factory factory = new Factory();

        // Create a kangaroo, cheetah, and lion using the instance of the Factory class
        Animal kangaroo = factory.get("Kangaroo");
        kangaroo.create();
        Animal cheetah = factory.get("Cheetah");
        cheetah.create();
        Animal lion = factory.get("Lion");
        lion.create();
    }
}
