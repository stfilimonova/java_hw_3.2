public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        double height = 1.75;
        double weight = 60;
        double bmi = service.calculate(height,weight);
        System.out.println(bmi);
    }
}