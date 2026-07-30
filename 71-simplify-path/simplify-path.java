class Solution {
    public String simplifyPath(String path) {

        String[] arr = path.split("/");
        Deque<String> stk = new ArrayDeque<>();

        for (String s : arr) {

            if (s != "") {
                if (s.equals("..")) {
                    if (!stk.isEmpty()) {
                        stk.pop();
                    }
                } else if (!s.equals(".")) {
                    stk.push(s);
                }
            }
        }

        if (stk.isEmpty()) {
            return "/";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("/");
        while (!stk.isEmpty()) {
            sb.append(stk.removeLast());
            sb.append("/");
        }

        sb.deleteCharAt(sb.length()-1);

        return sb.toString();

    }
}