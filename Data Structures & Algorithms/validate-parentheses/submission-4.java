class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');
        for (char c : s.toCharArray()) {
            if(hm.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == hm.get(c)) {
                    stack.pop();
                } else return false;
            } else stack.push(c);
        }
        return stack.isEmpty();
    }
}
