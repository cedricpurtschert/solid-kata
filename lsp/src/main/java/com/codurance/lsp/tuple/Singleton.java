package com.codurance.lsp.tuple;

import java.util.function.Function;

public class Singleton<A> implements Tuple<A> {

    private final A object;

    Singleton(A object) {
        assert object != null;
        this.object = object;
    }

    @Override
    public int length() {
        return 1;
    }

    @Override
    public A get(int index) {
        if (index > 0) {
            throw new IndexOutOfBoundsException();
        }
        return object;
    }

    @Override
    public boolean contains(A object) {
        assert object != null;
        return object.equals(this.object);
    }

    @Override
    public Pair<A> add(A object) {
        assert object != null;
        return new Pair<>(this.object, object);
    }

    @Override
    public Singleton<A> map(Function<A, A> function) {
        assert function != null;
        return new Singleton<>(function.apply(object));
    }
}
