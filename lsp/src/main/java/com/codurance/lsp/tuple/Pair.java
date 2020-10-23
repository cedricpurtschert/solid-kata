package com.codurance.lsp.tuple;

import java.util.function.Function;

public class Pair<A> implements Tuple<A> {

    private final A t1;
    private final A t2;

    public Pair(A t1, A t2) {
        assert t1 != null;
        assert t2 != null;
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public int length() {
        return 2;
    }

    @Override
    public A get(int index) {
        switch (index) {
            case 0:
                return t1;
            case 1:
                return t2;
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean contains(A object) {
        assert object != null;
        return false;
    }

    @Override
    public TupleN<A> add(A object) {
        assert object != null;
        return new TupleN<>(t1, t2, object);
    }

    @Override
    public Pair<A> map(Function<A, A> function) {
        assert function != null;
        return new Pair<>(function.apply(t1), function.apply(t2));
    }

}
