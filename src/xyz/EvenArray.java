package xyz;

public class EvenArray {

    public static void main(String[] args) {

        int arr[] = new int[]{3, 2, 8, 1, 4, 7};
        int totalCount = countEven(arr);
        System.out.println("Total even numbers:" + " " + totalCount);

    }
    public static int countEven(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
        }
    }



