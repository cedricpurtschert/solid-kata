package com.codurance.lsp.tuple;

import java.util.function.Function;

public class Tuple0<A> implements Tuple<A> {

    @Override
    public int length() {
        return 0;
    }

    @Override
    public A get(int index) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean contains(A object) {
        assert object != null;
        return false;
    }

    @Override
    public Singleton<A> add(A object) {
        assert object != null;
        return new Singleton<>(object);
    }

    @Override
    public Tuple0<A> map(Function<A, A> function) {
        assert function != null;
        return this;
    }
}
