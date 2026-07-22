
class A{
    int add(int x, int y){
        return x+y;
    }
    double add(double x, double y){
        return x+y;
    }
    char add(char x, char y){
        return (char)(x+y);
    }
}
class B extends A{
@Override
int add(int x, int y){ 
        System.out.println("In class B trying to add two variables");
        return x+y;
    }
@Override
char add(char x, char y){
        System.out.println("In class B trying to add two variables");
        return (char)(x+y);
    }

}
public class poly {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(5, 10));
        System.out.println(a.add(5.5, 10.5));
        System.out.println(a.add('A', 'B'));
        B b = new B();
        b.add(5, 10);

    }
}
