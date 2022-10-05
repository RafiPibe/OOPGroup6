public class courier{
    public static void main(String[] args) {
        deliveryType a1 = new deliveryType("Type 1", 10.0, 100, 1);
        deliveryType a2 = new deliveryType("Type 2", 100.0, 1000, 2);
        deliveryType a3 = new deliveryType("Type 3", 3.5, 12, 3);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}