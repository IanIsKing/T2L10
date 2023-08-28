public class Factory {
    public Animal get(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Cheetah")) {
            return new AnimalCheetah();
        } else if (type.equalsIgnoreCase("Kangaroo")) {
            return new AnimalKangaroo();
        } else if (type.equalsIgnoreCase("Lion")) {
            return new AnimalLion();
        }
        // For any other type not explicitly defined, return a generic animal
        return new AnimalGeneric(type);
    }
}
