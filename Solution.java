class Solution {
    public String maxValue(String n, int x) {
        // two cases:
        // case 1: n is positive, greedy alg- add before first digit that is smaller then x
        if(n.charAt(0) != '-') {
            for(int i = 0; i < n.length(); i++) {
                if((int) n.charAt(i) < x + 48) {
                    String rtn = n.substring(0, i) + x + n.substring(i);
                    return rtn;
                }

            }
            String rtn = n + x;
            return rtn;   
        }
        // case 2: n is negative, greedy alg- add before first digit larger then x
        for(int i = 1; i < n.length(); i++){
            if((int) n.charAt(i) > x + 48) {
                String rtn = n.substring(0,i) + x + n.substring(i);
                return rtn;
            }
        }
        String rtn = n + x;
        return rtn;
    }
}
