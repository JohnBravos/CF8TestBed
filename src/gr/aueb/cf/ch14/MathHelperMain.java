package gr.aueb.cf.ch14;

public class MathHelperMain {

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 9, 10, 13};

        System.out.println("Max = " + MathHelper.max(arr));
        System.out.println("Min = " + MathHelper.min(arr));
        System.out.println("Average = " + MathHelper.average(arr));
    }
}
