import java.util.Scanner;

public class AcsendingOrder {
    //    public static void main(String[] args) {
//        int temp;
//        int a [] = new int[4];
//        Scanner R = new Scanner(System.in);
//        System.out.println("Enter Element is Array");
//        for (int i=0; i<a.length; i++){
//            a[i]=R.nextInt();
//        }
//        for (int i=0; i<a.length; i++){  // 10,20,30,40;
//            for (int j=i+1; j<a.length; j++){
//                if (a[i] > a[j]){
//                    temp = a[i];  //temp=10;
//                    a[i]=a[j];    // i = 20;
//                    a[j]=temp;    // j = 10;
//                }
//            }
//        }for (int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }
//    }
    public int accesending(int a[]) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {       // a[i]<a[j] -------> Descending Order
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
        return (a.length);
    }
    public static void main(String[] args) {
        AcsendingOrder acsendingOrder = new AcsendingOrder();
        int a [] = {14,10,50,30,40};
        acsendingOrder.accesending(a);
    }
}