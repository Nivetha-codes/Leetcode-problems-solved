class Solution {

    static class HeapNode{
            int key;
            int[] value;

            public HeapNode(int key, int[] value){
                this.key = key;
                this.value = value;
            }

        }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<HeapNode> heap = new PriorityQueue<>(
            (a,b) -> Integer.compare(a.key, b.key) // swap for max-heap
        );


        for(int[] i : points){
            int key = (i[0] * i[0] ) + (i[1] * i[1]);
            //min-heap 
            heap.add(new HeapNode(key, new int[]{i[0],i[1]}));
            //add check for max-heap - this was max stays on top and we keep removing max elements making the heap contains only last min distances - this reduces insertion time to - O(k log n) 
            // if(heap.size() > k){
            //     heap.poll();
            // }

        }

        int[][] res = new int[k][2];
        for(int i = 0; i< k ; i++){
            HeapNode node = heap.poll();
            res[i] = node.value;
        }

        return res;
        
    }
}