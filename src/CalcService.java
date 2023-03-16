public class CalcService {

    public double calculate(double height, double weight){
        double bmi = weight / Math.pow(height,2);
        bmi = Math.round (bmi * 100);
        bmi = bmi / 100;
        return bmi;
    }
}
