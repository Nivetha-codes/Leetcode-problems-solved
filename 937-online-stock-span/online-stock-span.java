class StockSpanner {

    record Pair<I, T>(I price, T span) {
    };

    Deque<Pair<Integer, Integer>> dq;

    public StockSpanner() {
        dq = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 1;

        while (!dq.isEmpty() && price >= dq.peek().price) {
            span += dq.pop().span;
        }
        dq.push(new Pair<>(price, span));

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */