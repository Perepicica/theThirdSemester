package practice;

import java.util.ArrayList;
import java.util.List;

public class NewMax {
    static List<Integer> maxSubMass(List<Integer> list) {
        List<Integer> arr1 = new ArrayList<>();
        int sum = 0;
        int begin = 0;
        int end = 0;
        int max = 0;
        int indd = 0;
        if (list.size() == 0) return arr1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                sum += list.get(i);
                if (i == list.size()-1 && sum > max) {
                    begin=indd;
                    end = i;
                }
            }
            if (list.get(i) < 0) {
                if (sum > max) {
                    max = sum;
                    begin = indd;
                    end = i - 1;
                }
                if (Math.abs(list.get(i)) > sum) {
                    sum = 0;
                    if(i!=list.size()-1) indd = i + 1;
                } else sum += list.get(i);
            }
        }
        arr1 = list.subList(begin, end+1);
        return arr1 ;
    }
}