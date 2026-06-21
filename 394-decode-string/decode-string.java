class Solution {

    int pointer;

    public String decodeString(String s) {

        pointer = 0;
        return helper(s);
    }

    private String helper(String s) {

        StringBuilder result = new StringBuilder();
        int num = 0;

        while (pointer < s.length() &&
                s.charAt(pointer) != ']') {

            char c = s.charAt(pointer);

            if (Character.isDigit(c)) {

                num = num * 10 + (c - '0');
                pointer++;

            } else if (c == '[') {

                pointer++;

                String decoded = helper(s);

                result.append(decoded.repeat(num));

                num = 0;
            } else {

                result.append(c);
                pointer++;
            }
        }

        pointer++;

        return result.toString();
    }
}