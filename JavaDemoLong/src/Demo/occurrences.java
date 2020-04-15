package Demo;

import java.util.HashMap;
import java.util.Map;

public class occurrences {

	public static void main(String[] args) {
        int[] numbers = new int[]{1, 8, 3, 4, 3, 1, 3, 2, 5, 7, 3, 1, 4, 5, 6, 4, 3};

        Map<Integer, Integer> map = new HashMap<>();
        for (int key : numbers) {
            if (map.containsKey(key)) {
                int occurrence = map.get(key);
                occurrence++;
                map.put(key, occurrence);
            } else {
                map.put(key, 1);
            }
        }

        for (Integer key : map.keySet()) {
            int occurrence = map.get(key);
            System.out.println(key + " occur " + occurrence + " time(s).");
        }
    }
}
