//abstract class :- koi concept hai usko sach ni krna wo bs exist krta uske baare mei soach skte hai but create nhi kr skte.
class Animal{
    public void walk(){

    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }

}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class OOp_ {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Animal animal = new Animal();
        animal.walk();

    }
}

//interfaces

