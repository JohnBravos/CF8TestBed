package gr.aueb.cf.augustChallenges;

/*
    Επιστρέφει τους δείκτες δύο αριθμών ενός πίνακα, το
    άθροισμα των οποίων δίνει ένα συγκεκριμένο στόχο.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NineteenthChallenge {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(numbersIndex(nums, target)));

    }

    public static int[] numbersIndex(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            // To Map είναι μνήμη του τι έχει περάσει
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
