class Solution {
    public int lengthOfLongestSubstring(String s) {
         if (s == null || "".equals(s)) {
              return 0;
          }
          char[] array = s.toCharArray();
          int maxLength = 0;
          for (int i = 0; i < array.length; i++) {
              int[] temp = new int[128];
              int sum = 0;
              for (int j = i; j < array.length; j++) {
                  temp[array[j]]++;
                  if (temp[array[j]] < 2) {
                      sum++;
                  } else {
                      break;
                  }
              }
              maxLength = sum > maxLength ? sum : maxLength;
          }
          return maxLength;
      }
  }