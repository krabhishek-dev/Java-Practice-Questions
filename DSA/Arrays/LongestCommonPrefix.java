import java.util.Arrays;

class LongestCommonPrefix {

  // Approach 1 — Vertical Scanning O(n × m)-Time O(1)-Space
  //   public String longestCommonPrefix(String[] strs) {
  //     for (int i = 0; i < strs[0].length(); i++) {
  //       char current = strs[0].charAt(i);

  //       for (int j = 1; j < strs.length; j++) {
  //         if (i >= strs[j].length() || strs[j].charAt(i) != current) {
  //           return strs[0].substring(0, i);
  //         }
  //       }
  //     }

  //     return strs[0];
  //   }


  // Approach 2 — Horizontal Scanning roughly O(n × m)-Time O(m)-Space
//   public String longestCommonPrefix(String[] strs) {
//     String prefix = strs[0];

//     for (int i = 1; i < strs.length; i++) {
//       while (!strs[i].startsWith(prefix)) {
//         prefix = prefix.substring(0, prefix.length() - 1);

//         if (prefix.isEmpty()) {
//           return "";
//         }
//       }
//     }

//     return prefix;
//   }
  
//   Approach 3 — Sorting O(n log n × m)-Time Sorting-dependent- Space
public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;

        while (i < first.length() &&
               i < last.length() &&
               first.charAt(i) == last.charAt(i)) {

            i++;
        }

        return first.substring(0, i);
    }
}
