class Solution {
    public String defangIPaddr(String address) {
        StringBuilder m = new StringBuilder();
        for(int i = 0; i < address.length(); i++) {
            char v = address.charAt(i);
            if(v == '.') m.append("[.]");
            else m.append(v);
        }
        return m.toString();
    }
}