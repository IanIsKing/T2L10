public class Factory {
    // create an instance of the Factory class to generate animals
    public Animal get(String type) {
        // if the type is null, return null
        if (type == null) {
            return null;
        }
        // if the type is a cheetah, return a new instance of AnimalCheetah
        if (type.equalsIgnoreCase("Cheetah")) { // Updated to match Cheetah
            return new AnimalCheetah();
        }
        // if the type is a kangaroo, return a new instance of AnimalKangaroo
        else if (type.equalsIgnoreCase("Kangaroo")) { // Updated to match Kangaroo
            return new AnimalKangaroo();
        }
        // if the type is a lion, return a new instance of AnimalLion
        else if (type.equalsIgnoreCase("Lion")) {
            return new AnimalLion();
        }
        // if the type is not a cheetah, kangaroo, or lion, return null
        return null;
    }
}
