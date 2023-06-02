package fourthHomework.sortedSeriesOfNumbers;

import java.util.ArrayList;
import java.util.List;


    public class RangeFormation {
        public static String formRanges(int[] nums) {
            StringBuilder result = new StringBuilder();
            List<String> ranges = new ArrayList<>();

            int start = nums[0];
            int end = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == end + 1) {
                    end = nums[i];
                } else {
                    ranges.add(formatRange(start, end));
                    start = nums[i];
                    end = nums[i];
                }
            }

            ranges.add(formatRange(start, end));

            result.append(String.join(",", ranges));

            return result.toString();
        }

        private static String formatRange(int start, int end) {
            if (start == end) {
                return String.valueOf(start);
            } else {
                return start + "-" + end;
            }
        }

        public static void main(String[] args) {
            int[] nums = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
            String result = formRanges(nums);
            System.out.println(result);
        }
    }

