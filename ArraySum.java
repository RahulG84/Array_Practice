import java.util.Scanner;

public class ArraySum {
//    public static void main(String[] args) {
//        int a[] = new int[5];
//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Element in Array : ");
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("Array Element : ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] + " ");
//            sum = a[i] + sum;
//        }
//        System.out.println(sum);
//    }

    public int ArrayAddition(int a []){
        int sum = 0;
        for (int i=0; i<a.length; i++){
            sum = a[i] + sum;
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int a [] = {10,20,30,40};
        ArraySum arraySum = new ArraySum();
        arraySum.ArrayAddition(a);
    }
}
