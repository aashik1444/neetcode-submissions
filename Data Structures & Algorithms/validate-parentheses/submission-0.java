class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> matching = new HashMap();
        matching.put(')', '(');
        matching.put('}', '{');
        matching.put(']', '[');

        for (char c : s.toCharArray()) {
            if (matching.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == matching.get(c)) {
                    stack.pop();
                } else return false;
            } else stack.push(c);
        }
        return stack.isEmpty();
    }
}
