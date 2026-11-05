class Solution {
    public String restoreString(String s, int[] indices) {

        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }
}

// class Solution {
//     public String restoreString(String s, int[] indices) {
//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < s.length(); i++) {
//             sb.append(" ");
//         }

//         for (int i = 0; i < s.length(); i++) {
//             sb.setCharAt(indices[i], s.charAt(i));
//         }

//         return sb.toString();
//     }
// }