package animal;
import Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: Cokku cokku!!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
