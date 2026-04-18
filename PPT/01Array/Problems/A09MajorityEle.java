import java.util.*;

public class A09MajorityEle {
    static int printMajority(int arr[]) {
        int majElement = arr[0], majCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majElement) {
                majCount++;
            } else {
                majCount--;
                if (majCount == 0) {
                    majElement = arr[i];
                    majCount = 1;
                }
            }
        }
        return majElement;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 4, 4, 4, 4 };
        System.out.println(printMajority(arr));
    }
}