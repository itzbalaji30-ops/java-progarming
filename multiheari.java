class grandparent {
    public void show() {
        System.out.println("This is grandparent class");
    }
}
class parent extends grandparent {
    public void show1() {
        System.out.println("This is parent class");
    }
}
class child extends parent {
    public void show2() {
        System.out.println("This is child class");
    }
}
class sister extends child {
    public void show3() {
        System.out.println("This is sister class");
    }
}
class brother extends child {
    public void show4() {
        System.out.println("This is brother class");
    }
}
public class multiheari {
    public static void main(String[] args) {
        sister  c = new sister();
        c.show();
        c.show1();
        c.show2();
        c.show3();
        brother b = new brother();
        b.show();
        b.show1();
        b.show2();
        b.show4();
    }
}
