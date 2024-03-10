import org.w3c.dom.ls.LSOutput;
import banks.Bank;
//object and classes.
//class Pen {
//    String color;
//    String type;  //ballpoint; gel
//
//    public void write() {
//        System.out.println("writing something");
//    }
//    public void printColor(){
//        System.out.println(this.color);
//    }
    class Student {
        String name ;
        int age ;
//polymorphism in java.
        public void printInfo(String name){
            System.out.println(name);
        }
        public void printInfo(int age){
            System.out.println(age);
        }
        //compile time polymorphism.
        public void printInfo(String name, int age){
            System.out.println(name+" "+age);
        }
        //non parameterized constructor.
//        Student(){
//            System.out.println("constructor called");
//        }
    //Parameterized constructor.
//    Student(String name, int age){
//        System.out.println("constructor called");
//    }
//        Student(Student s2) {
//            this.name = s2.name;
//            this.age = s2.age;
//        }


    }

    

public class OOPs_java {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "sahil";
       s1.age = 22;

//       Student s2 = new Student(si);
//       s2.printInfo();

       s1.printInfo(s1.name, s1.age);
        
    }
}

//Constructor is used to construct objects in java.
// there are three types of constructor in java
//Non Parameterized constructor.
//Parameterized constructor.
//Copy constructor.