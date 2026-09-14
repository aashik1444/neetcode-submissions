class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) {
            return Character.toString((char)258);
        }
        String separate = Character.toString((char)257);
        StringBuilder sb = new StringBuilder(); //to make string mutable
        for (String s:strs) {
            sb.append(s);
            sb.append(separate);
        }//[cat#dog#mouse#]
        sb.deleteCharAt(sb.length()-1); //[cat#dog#mouse]
        return sb.toString(); //converts string builder to normal string
    }
    public List<String> decode(String str) {
        if (str.equals(Character.toString((char)258))) return new ArrayList();
        String separate = Character.toString((char)257);
        return Arrays.asList(str.split(separate, -1)); //separator and -1 as much as possible
    }
}
