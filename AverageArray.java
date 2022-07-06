public class AverageArray {
    public double average(int a []) {
        int sum = 0;
        double Avg;
        for (int i = 0; i < a.length; i++) {
            sum = a[i] + sum;
        }
        Avg = ((sum) / (a.length));
        System.out.println(Avg);
        return Avg;
    }
    public static void main(String[] args) {
        int a [] = {10,20,30,40,50};
        AverageArray averageArray = new AverageArray();
        averageArray.average(a);
    }
}
