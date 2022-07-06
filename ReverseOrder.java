import java.util.Scanner;

public class ReverseOrder {
//    public static void main(String[] args) {
//        int a[] = new int[5];
//        Scanner r = new Scanner(System.in);
//        System.out.println("Enter Element in Array : ");
//        for (int i = 0; i < a.length; i++) {
//            a[i] = r.nextInt();
//        }
//        System.out.println("Array Elements : ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println("Array Elements in Reverse : ");
//        for (int i = a.length - 1; i > 0; i--) {
//            System.out.print(a[i] + " ");
//        }
//    }
    public int Reverse(int a []){
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        for (int i=a.length-1; i>=0; i--){ // l=2=i ||
            System.out.println(a[i]);
        }
        return (a.length);
    }
    public static void main(String[] args) {
        int a [] = {10,20,30};
        ReverseOrder reverseOrder = new ReverseOrder();
        reverseOrder.Reverse(a);
    }
}
