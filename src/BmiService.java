public class BmiService {
    public int calculate(int weight, int growth) {
        int index = weight / ((growth * growth) / 10_000);
        return index;
    }
}
