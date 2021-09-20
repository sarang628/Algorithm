package ch3.fixed_capacity_stack_of_strings;

public abstract class FixedCapacityStackOfStrings {

    public FixedCapacityStackOfStrings(int size) {

    }

    abstract void push(String item);

    abstract String pop();

    abstract boolean isEmpty();

    abstract int size();
}