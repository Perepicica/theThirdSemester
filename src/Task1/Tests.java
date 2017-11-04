package Task1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class Tests {
    List<Integer> a = Arrays.asList(1, 4, 78, 54, -100, 39, 84, 92, 12);
    List<Integer> result = Arrays.asList(1, 4, 78, 54, -100, 39, 84, 92, 12);

    List<Integer> a1 = Arrays.asList(1, 4, 24, 54, 100, 39, 84, 92, 12);
    List<Integer> result1 = Arrays.asList(1, 4, 24, 54, 100, 39, 84, 92, 12);

    List<Integer> a2 = Arrays.asList(9, -12, 23, 4, 0, -9);
    List<Integer> result2 = Arrays.asList(23, 4, 0);

    List<Integer> a3 = Arrays.asList(-9, -12, 23, 4, 0, -9, 34, 43, 0, 92, -92, 92);
    List<Integer> result3 = Arrays.asList(23, 4, 0, -9, 34, 43, 0, 92);

    List<Integer> a4 = Arrays.asList(25,5,-1996,12,15,30);
    List<Integer> result4 = Arrays.asList(12,15,30);

    List<Integer> a5 = Arrays.asList();
    List<Integer> result5 = Arrays.asList();

    List<Integer> a6 = Arrays.asList(-1, -2, -3, 7, -4, -5, -6);
    List<Integer> result6 = Arrays.asList(7);

    List<Integer> a7 = Arrays.asList(1, 2, 3, -79, 4, 5, 6, -80, 34, 4, 12, -99, 3, 1, 2);
    List<Integer> result7 = Arrays.asList(34, 4, 12);

    List<Integer> a8 = Arrays.asList(8, -90, 76, 98, 56, 1, 2, -3, 2, 43, 91, -234, 23, 134, 22, 33, -123, 90);
    List<Integer> result8 = Arrays.asList(76, 98, 56, 1, 2, -3, 2, 43, 91);

    List<Integer> a9 = Arrays.asList(-1, -2, -3);
    List<Integer> result9 = Arrays.asList(-1);

    @Test
    public void maxSub() {
        assertEquals(NewMax.maxSubMass(a),result);
        assertEquals(NewMax.maxSubMass(a1),result1);
        assertEquals(NewMax.maxSubMass(a2),result2);
        assertEquals(NewMax.maxSubMass(a3),result3);
        assertEquals(NewMax.maxSubMass(a4),result4);
        assertEquals(NewMax.maxSubMass(a5),result5);
        assertEquals(NewMax.maxSubMass(a6),result6);
        assertEquals(NewMax.maxSubMass(a7),result7);
        assertEquals(NewMax.maxSubMass(a8),result8);
        assertEquals(NewMax.maxSubMass(a9),result9);
    }
}
