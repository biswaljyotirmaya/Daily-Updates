package express;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		if (nums.length == 0)
			return list;

		int start = 0;

		for (int i = 1; i <= nums.length; i++) {
			if (i == nums.length || nums[i] != nums[i - 1] + 1) {
				if (start == i - 1) {
					list.add(String.valueOf(nums[start]));
				} else {
					list.add(nums[start] + "->" + nums[i - 1]);
				}
				start = i;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().summaryRanges(new int[] {-57545, 0, 2, 3, 4, 6, 8, 9 }));
	}
}