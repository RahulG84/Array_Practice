public class DublicateArray {
//    public static void main(String[] args) {
//        int arr [] = {1,2,2,6,6,7};
//        for (int i=0; i<arr.length; i++){
//            for (int j=i+1; j<arr.length; j++){
//                if (arr[i] == arr[j]){
//                    System.out.println("The Dublicate Element is " +arr[j]);
//                }
//            }
//        }
//    }
    public int Duplicate(int a []){
        for (int i=0; i<a.length; i++){
            //System.out.println(a[i]);
            for (int j=i+1; j<a.length; j++){
                if (a[i] == a[j]){
                    System.out.println(a[j]);
                }
            }
        }
        return (a.length);
    }
    public static void main(String[] args) {
        int a [] = {1,2,2,3,4,4};
        DublicateArray dublicateArray = new DublicateArray();
        dublicateArray.Duplicate(a);
    }
}