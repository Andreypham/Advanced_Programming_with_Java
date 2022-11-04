package SS7_Abstract_Class_And_Interface.Practice.Animal_and_interface_Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Chip...chip";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
