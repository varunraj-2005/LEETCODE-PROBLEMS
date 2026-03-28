class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> l = new ArrayList<>();

        for (int num : nums) {
            int left = 0, right = l.size() - 1;

            // binary search
            while (left <= right) {
                int mid = (left + right) / 2;
                if (l.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            // insert or replace
            if (left == l.size()) {
                l.add(num);
            } else {
                l.set(left, num);
            }
        }

        return l.size();
    }
}
