package OOPs_concepts;

//class Shape{
//    String color;
//}
////Now Triangle class inherited all the properties of Shape class.
//class Triangle extends Shape{
//
//
//}

class Shape {
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

class EquilateralTriangle extends Triangle{
    public void are(int l, int h){
        System.out.println(1/2*l*h);
    }

}
public class inheritance_ {
    public static void main(String[] args) {
//        Triangle t1 = new Triangle();
//        t1.color = "red";
    }
}

//inheritance is of four types.
//Single level inheritance.
//Multi level inheritance.
//Hierarchial inheritance.
//Hybrid inheritance
//Multiple Inheritance.
