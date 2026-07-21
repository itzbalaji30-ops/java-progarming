
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
public class poly {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(5, 10));
        System.out.println(a.add(5.5, 10.5));
        System.out.println(a.add('A', 'B'));
    }
}
