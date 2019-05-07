package LeetCode.other;

import Array.Array;

import java.util.*;

/**
 * @auther: Li jx
 * @date: 2019/4/7 19:52
 * @description:
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if (c == ')' && top != '(') {
                        return false;
                    }
                    if (c == '}' && top != '{') {
                        return false;
                    }
                    if (c == ']' && top != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }

    public int calPoints(String[] ops) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < ops.length; i++) {
            String s = ops[i];
            if (s.equals("+")) {
                int i1 = Integer.valueOf(stack.get(stack.size() - 1));
                int i2 = Integer.valueOf(stack.get(stack.size() - 2));
                stack.push(String.valueOf(i1 + i2));
            } else if (s.equals("D")) {
                int i1 = Integer.valueOf(stack.get(stack.size() - 1));
                stack.push(String.valueOf(i1 * 2));
            } else if (s.equals("C")) {
                stack.pop();
            } else {
                stack.push(s);
            }

        }
        int sum = 0;
        for (String s : stack) {
            sum = sum + Integer.valueOf(s);
        }
        return sum;
    }

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (c.equals('#')) {
                if (stack1.isEmpty()) {
                    continue;
                } else {

                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }
        for (int i = 0; i < T.length(); i++) {
            Character c = T.charAt(i);
            if (c.equals('#')) {
                if (stack2.isEmpty()) {
                    continue;
                } else {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }
        return stack1.containsAll(stack2) && stack1.size() == stack2.size();

    }

    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (c.equals('(')) {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && !stack.peek().equals(c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.size();
    }

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public int removeDuplicates(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = 0;
        int[] ints = new int[nums.length];
        for (Integer i : nums) {
            if (a == i) {
                continue;
            }
            a = i;
            ints[b++] = a;

        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ints[i];
        }
        return b;
    }

    public int removeElement(int[] nums, int val) {

        int b = 0;
        int[] ints = new int[nums.length];
        for (Integer i : nums) {
            if (val == i) {
                continue;
            }
            ints[b++] = i;

        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ints[i];
        }
        return b;
    }

    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) {
                continue;
            }
            if (target <= nums[i]) {
                return i;
            }

        }
        return nums.length;
    }

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int big = nums[0];
        for (Integer i : nums) {
            if (sum > 0) {
                sum += i;
            } else {
                sum = i;
            }
            big = Math.max(sum, big);
        }
        return big;
    }

    public static int[] plusOne(int[] digits) {
        int[] ints = new int[digits.length + 1];
        for (int i = digits.length - 1; i != -1; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                continue;
            }
            digits[i]++;
            break;
        }
        if (digits[0] == 0) {
            for (int i = 0; i < digits.length; i++) {
                ints[i + 1] = digits[i];
            }
            ints[0] = 1;
            return ints;
        }
        return digits;
    }

    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() != nums.length;
    }

    public int climbStairs(int n) {
        int[] ints = new int[n + 1];
        ints[0] = 1;
        ints[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[n];
    }


    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int more = 0;
        int most = 0;

        for (Integer i : prices) {
            if (min > i) {
                min = i;
            } else {
                more = i - min;
            }
            most = Math.max(more, most);

        }
        return most;
    }

    public static String longestPalindrome(String s) {
        int center = 0;
        int rightSide = 0;
        int index = 0;
        int radius = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@");
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            stringBuilder.append("@");
        }
        String newString = stringBuilder.toString();
        int[] ints = new int[newString.length()];
        for (int i = 0; i < ints.length; i++) {
            if (rightSide > i) {
                int left = 2 * center - i;
                ints[i] = ints[left];
                if (ints[left] + i < rightSide) {
                    ints[i] = ints[left];
                    continue;
                } else {
                    ints[i] = rightSide - i;
                }
            }
            while (i - ints[i] - 1 >= 0 && i + ints[i] + 1 < ints.length) {
                if (newString.charAt(i - ints[i] - 1) == newString.charAt(i + ints[i] + 1)) {
                    ints[i]++;
                } else {
                    break;
                }
            }
            rightSide = i + ints[i];
            center = i;

            if (radius < ints[i]) {
                radius = ints[i];
                index = i;
            }

        }
        StringBuffer sb = new StringBuffer();
        for (int i = index - radius + 1; i <= index + radius; i += 2) {
            sb.append(newString.charAt(i));
        }
        return sb.toString();
    }

    public static int[] sortArrayByParity(int[] A) {
        int[] ou = new int[A.length];
        int ouSize = 0;
        int[] ji = new int[A.length];
        int jiSize = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                ou[ouSize++] = A[i];
            } else {
                ji[jiSize++] = A[i];
            }
        }
        while (jiSize != 0) {
            ou[ouSize++] = ji[--jiSize];
        }
        return ou;
    }

    public static int totalFruit(int[] tree) {
        int big = 0;
        int sum = 0;
        int a = -1;
        int b = -1;
        for (int i = 0; i < tree.length; i++) {
            if (a == -1) {
                a = tree[i];
                sum++;
                big = Math.max(big, sum);
                continue;
            }
            if (a == tree[i] || b == tree[i]) {
                sum++;
            }
            if (a != tree[i] && b == -1) {
                b = tree[i];
                sum++;
                big = Math.max(big, sum);
                continue;
            }
            if (a != tree[i] && b != tree[i]) {
                sum = 2;
                a = tree[i - 1];
                b = tree[i];
                int h = 1;
                while (tree[i - 1 - h] == a || tree[i - 1 - h] == b) {
                    sum++;
                    h++;
                }
            }
            big = Math.max(big, sum);
        }
        return big;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s = n + m - 1;
        m--;
        n--;
        while (s != -1) {
            if (n == -1) {
                break;
            } else if (m == -1) {
                while (s != -1) {
                    nums1[s] = nums2[n];
                    s--;
                    n--;
                }
            } else if (nums1[m] < nums2[n]) {
                nums1[s] = nums2[n];
                n--;
                s--;
            } else if (nums1[m] > nums2[n]) {
                nums1[s] = nums1[m];
                m--;
                s--;
            } else if (nums1[m] == nums2[n]) {
                nums1[s] = nums1[m];
                nums1[s - 1] = nums2[n];
                m--;
                n--;
                s -= 2;
            }
        }
    }

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (min != nums[i]) {
                sum += nums[i] - min;
            }
        }
        return sum;
    }

    public static List<Integer> majorityElement(int[] nums) {
        int a = 0, b = 0;
        int aCount = -1, bCount = -1;
        List list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (a == nums[i]) {
                aCount++;
            } else if (b == nums[i]) {
                bCount++;
            } else if (aCount == 0) {
                a = nums[i];
                aCount++;
            } else if (bCount == 0) {
                b = nums[i];
                bCount++;
            } else {
                bCount--;
                aCount--;
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (a == nums[i]) {
                count++;
            }
        }
        if (count > nums.length / 3) {
            list.add(a);
        }

        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (b == nums[i]) {
                count++;
            }
        }
        if (count > nums.length / 3) {
            list.add(b);
        }
        return list;
    }

    public static int reverse(int x) {
        double reverseX = 0.0;
        while (x != 0) {
            reverseX = reverseX * 10 + x % 10;
            x = x / 10;
        }

        if (Math.pow(-2, 31) == (int) reverseX || (int) reverseX == Math.pow(2, 31) - 1) {
            return 0;
        }

        return (int) reverseX;
    }

    public static int romanToInt(String s) {
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
        int[] ints = new int[s.length()];
        for (int i = 0; i < ints.length; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    ints[i] = 1;
                    break;
                case 'V':
                    ints[i] = 5;
                    break;
                case 'X':
                    ints[i] = 10;
                    break;
                case 'L':
                    ints[i] = 50;
                    break;
                case 'C':
                    ints[i] = 100;
                    break;
                case 'D':
                    ints[i] = 500;
                    break;
                case 'M':
                    ints[i] = 1000;
                    break;

            }
        }
        for (int i = 0; i < s.length(); i++) {
            int a = ints[i];
            if (!s1.isEmpty() && s1.peek() < a) {
                s2.push(s1.pop());
            }
            s1.push(a);
        }
        int sum = 0;
        while (s1.size() != 0) {
            sum += s1.pop();
        }
        while (s2.size() != 0) {
            sum -= s2.pop();
        }
        return sum;

        }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int  maxProfit2(int[] prices) {
        // [7,1,5,3,6,4]
        int small = -1;
        int cur = 0;
        int allSum = 0;
        int sum = 0;
        for (int i : prices) {
            if (small == -1) {
                small = i;
            }
            if (i - small> sum) {
                cur = i - small;
            } else if (i -small< sum) {
                allSum += sum;
                sum = 0;
                small = i;
            }

            sum = Math.max(sum, cur);
            cur = 0;
        }
        allSum += sum;
        return allSum;
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] ints = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            ints[j]=nums[(nums.length - k + j) % nums.length] ;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ints[i];
        }
    }

    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() <= nums.length / 2 ? true : false;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int a = 0;
        int[] ints = new int[nums1.length<nums2.length?nums2.length:nums1.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                ints[a++] = nums1[i];
                i++;
                j++;

            }
        }
        int[] ints1 = new int[a];
        for (int k = 0; k < a; k++) {
            ints1[k] = ints[k];
        }
        return ints1;
    }

    public void moveZeroes(int[] nums) {
        int zeroNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroNum++;
            } else {
                nums[i - zeroNum] = nums[i];
            }
        }
        for (int i = 0; i < zeroNum; i++) {
            nums[nums.length - 1 - i] = 0;
        }

    }

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }

    }

    public int firstUniqChar(String s) {
        int[] ints = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            ints[chars[i] - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (ints[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    public boolean isAnagram(String s, String t) {
        int[] ints = new int[26];
        int[] ints1 = new int[26];
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            ints[chars[i] - 'a']++;
            ints1[chars1[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (ints[chars[i]]!=ints1[chars[i]]) {
                return false;
            }
        }
        return true;
    }
    public int myAtoi(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') {
                continue;
            } else if (c == '-') {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c);
            } else if (c >= '0' && c <= '9') {
                stringBuilder.append(c);
            } else {
                break;
            }
            if ("-".equalsIgnoreCase(stringBuilder.toString())) {
                return 0;
            }
        }
        return  (int)Double.valueOf(stringBuilder.toString().length()==0?"0":stringBuilder.toString()).doubleValue();
    }

    public int numJewelsInStones(String J, String S) {
        int[] ints = new int[52];
        for (int i = 0; i < S.length(); i++) {
            ints[S.charAt(i) - 'A']++;
        }
        int sum = 0;
        for (int i = 0; i < J.length(); i++) {
            sum += ints[J.charAt(i) - 'A'];
        }
        return sum;
    }

    public boolean isPowerOfThree(int n) {
        int sum = 0;
        if (n == 0) {
            return false;
        }
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum % 9 == 0;
    }

    public int lengthOfLongestSubstring(String s) {
        int sum = 0;
        int i = 0;
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap();
        for (int j = 0; j < s.length(); j++) {
            char c = chars[j];
            if (hashMap.containsKey(c)) {
                i = Math.max(i, hashMap.get(c)+1);
            }
            hashMap.put(c, j);
            sum = Math.max(sum, j - i+1);
        }
        return sum;

    }



    public static void main(String[] args) {
//        for (int d : sortArrayByParity(a)) {
//            System.out.println(d);
//        }
//        System.out.println(majorityElement(a));
//        String s = "IV";
//
        int[] ints = new int[]{2,1,2,0,1};
        String s ="ss";
        new Solution().firstUniqChar(s);
    }
}