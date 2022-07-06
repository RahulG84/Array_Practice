import java.util.Scanner;

public class DeleteArray {
    public int deleteArray(int a[]) {
        Scanner sc = new Scanner(System.in);
        int loc;
        int b = a.length;
        for (int i = 0; i < b; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter Array Location : ");
        loc = sc.nextInt();
        for (int i = loc; i < b - 1; i++) {
            a[i] = a[i + 1];
        }
        b--;
        for (int i = 0; i < b; i++){
        System.out.println(a[i]);
    }
        return(b);
}

    public static void main(String[] args) {
        DeleteArray deleteArray = new DeleteArray();
        int a[] = {10, 20, 30 , 50 , 60};
        deleteArray.deleteArray(a);
    }
}
