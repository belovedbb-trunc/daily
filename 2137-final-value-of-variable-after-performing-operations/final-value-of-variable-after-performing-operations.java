class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int init = 0;
        for(String operation: operations) {
            if(operation.contains("-")) init--;
            else init++;
        }
        return init;
    }
}