public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 1021;
        int miles = service.calculate(price);
        System.out.println(miles);

        int price1 = 10;
        int miles1 = service.calculate(price1);
        System.out.println(miles1);

        int price2 = 100;
        int miles2 = service.calculate(price2);
        System.out.println(miles2);
    }
}