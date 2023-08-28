public class AnimalGeneric implements Animal {
    private String type;

    public AnimalGeneric(String type) {
        this.type = type;
    }

    @Override
    public void create() {
        System.out.println("You've just created a generic animal type: " + type + "!");
    }
}
