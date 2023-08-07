public class Main {
    public static void main(String[] args) {
        Singeleton x=Singeleton.getInstance();
        Singeleton y=Singeleton.getInstance();
        Singeleton z=Singeleton.getInstance();

        System.out.println("HashCode for X is ::"+ x.hashCode());
        System.out.println("HashCode for y is ::"+ y.hashCode());
        System.out.println("HashCode for z is ::"+z.hashCode());

    }
}