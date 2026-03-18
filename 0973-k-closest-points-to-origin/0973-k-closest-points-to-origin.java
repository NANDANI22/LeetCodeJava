class Solution {
    class pair implements Comparable<pair>{
        int x;
        int y;

        public pair (int x , int y){
            this.x = x;
            this.y = y;
        }
        public int distance(){
            return (x*x) + (y*y);
        }
        public int compareTo(pair that){
            return that.distance() - this.distance();
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(int[] arr : points){
            pq.offer(new pair(arr[0] , arr[1]));
            if(pq.size()>k) pq.poll();
        }
        int ans[][]= new int[pq.size()][2];
        for(int i=0; i<k; i++){
            pair temp = pq.poll();
            ans[i][0]=temp.x;
            ans[i][1]=temp.y;
        }
        return ans;
    }
}