
package leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MakingTupple {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int count = 0;

        List<List<Integer>> listOfTupples = new ArrayList<>();
        List<Integer> tupples = new ArrayList<>();
        for (int p = 0; p < 4; p++) {
            for (int i = 0; i < nums.length; i++) {
                if (tupples.size() < 4) {
                    tupples.add(nums[i]);
                } else if (tupples.size() == 4) {
                    System.out.println(tupples);
                    listOfTupples.add(tupples);
                    tupples.clear();
                    tupples.add(nums[i]);
                }
                for (int j = 0; j < nums.length; j++) {
                    if (tupples.size() < 4) {
                        if (i != j) {
                            tupples.add(nums[j]);
                        }
                    } else if (tupples.size() == 4) {
                        System.out.println(tupples);

                        listOfTupples.add(tupples);
                        tupples.clear();
                        tupples.add(nums[i]);
                        tupples.add(nums[j]);
                    }
                }
            }
            for (List<Integer> tp : listOfTupples) {
                for (int i : tp) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }

}