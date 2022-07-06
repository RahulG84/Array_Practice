import java.util.Scanner;

public class CopyElement {
//    public static void main(String[] args) {
//        int a [] = new int[5];
//        int b [] = new int[5];
//        Scanner r =new Scanner(System.in);
//        System.out.println("Enter value in First Array");
//        for (int i=0; i<5; i++){
//            a[i]=r.nextInt();
//        }
//        System.out.println("First Array Element ");
//        for (int i=0; i<5; i++){
//            System.out.println(a[i] + " ");
//        }
//        System.out.println("Second Line ");
//        for (int i=0; i<5; i++){
//            b[i]=a[i];
//            System.out.print(b[i] + " ");
//        }
//    }
    public int CopyArray(int a [], int b []){
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        for (int i=0; i<b.length; i++){
            b[i]=a[i];
        }
        return (b.length);
    }
    public static void main(String[] args) {
        int a [] = {10,20,40};
        int b [] = {50,60,40};
        CopyElement copyElement =new CopyElement();
        copyElement.CopyArray(a,b);
    }
}