public class IncrementDecrement2 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a);
        System.out.println(++a + a++ + a++);
        //Ep=11, a=11
        //Ep=11,a=12
        //Ep=12,a=13
        System.out.println(a);
    }
}
