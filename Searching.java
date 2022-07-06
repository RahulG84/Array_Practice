import java.util.Scanner;

public class Searching {
//    public static void main(String[] args) {
//        int count=0;
//        int a[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("Array Element ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] + " ");
//        }
//        System.out.println("Enter Search Element");
//        int n = sc.nextInt();
//        for (int i=0; i<a.length; i++) {
//            if (a[i] == n) {
//                count++;
//            }
//        }
//            if (count>0)
//                System.out.println("Element Found " +count+ " times ");
//            else
//                System.out.println("Item Not Found");
//            }
    public int find(int a []){
        Scanner R = new Scanner(System.in);
        int n = R.nextInt();
        int count =0;
        for (int i=0; i<a.length; i++){
            if (a[i] == n){
                count ++;
            }
        }
        if (count>0)
            System.out.println("Item Found");
        else System.out.println("Item Not Found");
        return count;
    }
    public static void main(String[] args) {
        Searching searching = new Searching();
        int a [] = {10,20,30,40};
        searching.find(a);
    }
}
