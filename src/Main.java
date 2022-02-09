public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90;
        int growth = 177;
        int index = service.calculate(weight, growth);
        System.out.println("Ваш индекс массы тела: " + index);
    }
}
