package lekcija5.labDarbs;

public class Main {
    public static void main(String[] args) {
    Cat rima = new Cat();
    Dog juce = new Dog();
    Fish zive = new Fish();
    rima.age=5;
    juce.age=3;
    rima.canClimbTrees = true;
    juce.canClimbTrees = false;

    rima.breathe();
    juce.breathe();
    zive.breathe();

    rima.makeSound();
    juce.makeSound();

    rima.eat();
    juce.eat();

    rima.sharpenClaws();
    juce.growl();

    rima.printClimbing();

    Calculator kalkulators = new Calculator();
        System.out.println(kalkulators.add(5,9));
        System.out.println(kalkulators.add(52.6,9.3));
    House house = new House(1,2,3,"Malta",6,52140,true);
    house.setKadastraVertiba(542782L);
    house.printHouse();
        System.out.println( "Mājas adrese ir "+ house.getAdrese());

    }
}
