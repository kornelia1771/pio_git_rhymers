package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TAB_SIZE = 12;
    public static final int MAX_INDEX = TAB_SIZE - 1;
    public static final int DEFAULT_VALUE = -1;
    public static final int EMPTY_RHYMER_INDEX = -1;
    private final int[] NUMBERS = new int[TAB_SIZE];

    public int total = EMPTY_RHYMER_INDEX;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return NUMBERS[total--];
    }

}
