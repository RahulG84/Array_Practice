public class MaximumArray {
    public int maxiArray(int a []){
        for (int i=0; i<a.length; i++){
             int max = a[0]; //0th Index Compare
            for ( i=1; i<a.length; i++){
                if (a[i] > max){   // Minium Number -------> a[i] < min
                    max=a[i];
                }
            }
            System.out.println(max);
        }
        return (a.length);
    }
    public static void main(String[] args) {
        MaximumArray maximumArray = new MaximumArray();
        int a [] = {10,20,40,50};
        maximumArray.maxiArray(a);
    }
}
