package xyz;


public class SumOfMultiple {
    public static void main(String[] args) {
        int sum = getSum(12);
        System.out.println("The sum of Multiple of 3 and 5 is:" + " " + sum);
    }
    public static int getSum(int a){
        int count = 0;
        for (int i = 1; i<a; i++){
            if(i%3 == 0 || i%5 == 0){
                count = count+i;
            }
        }
        return count;
    }
}
