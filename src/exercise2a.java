public class exercise2a{
    public static void main(String[]args) {
        int price=35;
        int quantity=5;
        double tax=(0.21);
        double totaal=(price*quantity);

        System.out.println("The total price is "+ (totaal+(totaal*tax)));
    }
}
