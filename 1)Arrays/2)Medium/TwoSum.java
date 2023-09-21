//Brute Force
//There are two varieties in this code 
//variety 1 return yes or no
//variety 2 return indexes of the values

//we can solve two varieties with this
import java.util.*;

public class Main {

    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int target = 14;
        int[] arr = { 2, 6, 5, 8, 11 };
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));

    }
}


//Better Solution 

import java.util.*;

public class Main {

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if (hashMap.containsKey(complement)) {
                return new int[] { i, hashMap.get(complement) };
                // return new int[] { hashMap.get(complement), i};
            } else {
                hashMap.put(arr[i], i);
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int target = 14;
        int[] arr = { 2, 6, 5, 8, 11 };
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));

    }
}
//Two pointers approach 

import java.util.*;

public class Main {

    public static String twoSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return "NO";

    }

    public static void main(String[] args) {
        int target = 15;
        int[] arr = { 2, 6, 5, 8, 11 };
        String result = twoSum(arr, target);
        System.out.println(result);

    }
}


