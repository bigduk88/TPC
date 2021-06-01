import tpc.Animal;
import tpc.Cat;
import tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        Animal ani = new Dog(); // upcasting
        ani.eat();

        ani = new Cat(); // upcasting
        ani.eat();
        ((Cat)ani).night();  //downcasting
    }
}
