
import java.util.HashMap;
import java.util.Map;

public class SolutionCode {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (pairs.containsKey(nums[i])) {
                result[0] = pairs.get(nums[i]);
                result[1] = i;
                found = true;
                break;
            } else {
                pairs.put(target - nums[i], i);
            }
        }
        return found ? result : null;
    }

    public static int[] findTwoSum2(int[] nums, int target) {
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (pairs.containsKey(nums[i])) {
                result[0] = pairs.get(nums[i]);
                result[1] = i;
                found = true;
                break;
            } else {
                pairs.put(target - nums[i], i);
            }
        }
        return found ? result : null;
    }

    public static void main(String[] args) {

        int[] indices = findTwoSum(new int[] { 5, 1, 5, 7, 5, 9 }, 10);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }

        int[] indices2 = findTwoSum2(new int[] { 5, 1, 5, 7, 5, 9 }, 10);
        if (indices != null) {
            System.out.println(indices2[0] + " " + indices2[1]);
        }

    }
}