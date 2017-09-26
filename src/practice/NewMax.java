package practice;
import java.util.ArrayList;

public class NewMax {
    static ArrayList<Integer> maxSubMass(int a[]) {
        ArrayList arr1 = new ArrayList();
        int sum = 0;
        int ind1 = 0;
        int ind2 = 0;
        int max = 0;
        int indd = 0;
        if (a.length == 0) return arr1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) sum += a[i];
            if (a[i] < 0) {
                if (i == a.length) {
                    if (a[i] > 0) {
                        sum += a[i];
                    }
                    if (sum > max) {
                        max = sum;
                        ind1 = indd;
                        ind2 = i;
                    }
                } else {
                    if (sum > max) {
                        max = sum;
                        ind1 = indd;
                        ind2 = i - 1;
                    }

                    if (Math.abs(a[i]) > sum) {
                        sum = 0;
                        indd = i + 1;

                    } else {
                        sum += a[i];

                    }
                }
            }
        }
        if (a[a.length - 1] > 0) {
            if (sum > max) {
                max = sum;
                ind1 = indd;
                ind2 = a.length - 1;
            }
        }
        for (int j = ind1; j <= ind2; j++) {
            arr1.add(a[j]);
        }
        System.out.println(arr1);
        return arr1;
    }
}