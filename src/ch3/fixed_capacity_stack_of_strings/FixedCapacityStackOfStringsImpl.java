package ch3.fixed_capacity_stack_of_strings;

public class FixedCapacityStackOfStringsImpl extends FixedCapacityStackOfStrings {

    private String[] a; // 스택 항복
    private int N; // 크기

    public FixedCapacityStackOfStringsImpl(int size) {
        super(size);
        a = new String[size];
    }

    @Override
    public void push(String item) {
        a[N++] = item;
    }

    @Override
    public String pop() {
        return a[--N];
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }
}
