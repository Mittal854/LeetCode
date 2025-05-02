public class Solution {
    public String pushDominoes(String dominoes) {
        char[] arr = ("L" + dominoes + "R").toCharArray();
        int n = arr.length;
        StringBuilder result = new StringBuilder();

        int i = 0; // previous fixed domino
        for (int j = 1; j < n; j++) {
            if (arr[j] == '.') continue;

            int middle = j - i - 1;

            if (i > 0) result.append(arr[i]); // ignore sentinel at 0

            if (arr[i] == arr[j]) {
                // L...L or R...R
                for (int k = 0; k < middle; k++) result.append(arr[i]);
            } else if (arr[i] == 'R' && arr[j] == 'L') {
                // R...L: balance from both sides
                int half = middle / 2;
                for (int k = 0; k < half; k++) result.append('R');
                if (middle % 2 == 1) result.append('.');
                for (int k = 0; k < half; k++) result.append('L');
            } else {
                // L...R → all remain '.'
                for (int k = 0; k < middle; k++) result.append('.');
            }

            i = j;
        }

        return result.toString();
    }
}
