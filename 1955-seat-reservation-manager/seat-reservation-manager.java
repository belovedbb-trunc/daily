class SeatManager {

    boolean[] seats;
    int cur = 0;

    public SeatManager(int n) {
        seats = new boolean[n];
    }
    
    public int reserve() {
        seats[cur] = true;
        int res = cur + 1;
        boolean seen = false;
        for(int i = cur + 1; i < seats.length; i++) {
            if(!seats[i]) {
                seen = true;
                cur = i;break;
            }
        }
        if(!seen) cur = Integer.MAX_VALUE;
        return res;
    }
    
    public void unreserve(int seatNumber) {
        seats[seatNumber - 1] = false;
        cur = Math.min(cur, (seatNumber - 1) );
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */