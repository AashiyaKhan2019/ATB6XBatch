public class TypeCasting {
    public static void main(String[] args) {
        int a =10;
        byte b=(byte)a;//Explicite casting
        System.out.println(b);
        int price =300;
        float GST=18.90f;
        float total=price +GST;
        System.out.println(total);
         //GST=(int)GST;
         price=price+(int)GST;//Explicite casting
        System.out.println(price);

    }
}
