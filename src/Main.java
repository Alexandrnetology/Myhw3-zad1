public class Main {
        public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        System.out.println();
        System.out.println("price=5000");
        System.out.println(service.calculate(price = 5000));

        System.out.println();
        System.out.println("price=9999");
        System.out.println(service.calculate(price = 9999));
    }
}