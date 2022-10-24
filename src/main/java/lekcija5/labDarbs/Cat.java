package lekcija5.labDarbs;

public class Cat extends Animal {
    public void makeSound() {
        System.out.println("Mjau mjau mjau");
    }
    public void sharpenClaws(){
        System.out.println("Es asinu nagus");
    }
    public void printClimbing(){
        System.out.println("Kaķis kāpj kokā " + canClimbTrees);
    }
}
