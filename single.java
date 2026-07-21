 class animal{
    public void sound(){
        System.out.println(" generate Animal sound");
    }
}
 class dog extends animal{
    public void bark(){
        System.out.println(" bow bow...!");
    }
}
public class single {
    public static void main(String[] args) {

        dog d = new dog();
        d.bark();
        d.sound();
    }
}
