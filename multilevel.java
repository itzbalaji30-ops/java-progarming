class Granparent {
    void display1() {
        System.out.println("As a Grandparent.");
    }
}
class Parent extends Granparent {
    void display2() {
        System.out.println("As a Parent.");
    }
}
class Child extends Parent {
    void display3() {
        System.out.println("As a Child.");
    }
}
public class multilevel {
    public static void main(String[] args) {
        Child c = new Child();
        c.display1();
        c.display2();
        c.display3();
    }
}
