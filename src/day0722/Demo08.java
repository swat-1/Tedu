package day0722;

public class Demo08 {
    public static void main(String[] args) {
        //int[] arr = new int[4];
        //int[] arr = {2, 5, 7, 9};
        int[] arr = new int[]{2, 5, 7, 9};
        System.out.println(arr[0]);
        arr[1] = 100;
        System.out.println(arr[1]);
        System.out.println(arr[arr.length - 1]);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println(arr[i]);
        }

    }
}
