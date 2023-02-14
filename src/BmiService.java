public class BmiService {
    public int calculate(double height, double weight) {
        int result = (int) (weight / (height * height));
        return result;
    }
}
