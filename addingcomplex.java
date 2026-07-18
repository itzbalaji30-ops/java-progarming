public class addingcomplex {
    int real;
    float img;
    public addingcomplex(int r, float i){
        real = r;
        img = i;
    }
    public static void main(String[] args) {
        addingcomplex c1 = new addingcomplex(2, 3.5f);
        addingcomplex c2 = new addingcomplex(4, 5.5f);
        addingcomplex c3 = new addingcomplex(c1.real + c2.real, c1.img + c2.img);
        System.out.println("The sum of complex numbers is: " + c3.real + " + " + c3.img + "i");
    }
}
