package com.codurance.lsp.tuple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TupleN<A> implements Tuple<A> {

    private final List<A> objects;

    public TupleN(A... objects) {
        this(Arrays.asList(objects));
    }

    TupleN(List<A> list) {
        assert list != null;
        this.objects = list;
    }

    @Override
    public int length() {
        return objects.size();
    }

    @Override
    public A get(int index) {
        return objects.get(index);
    }

    @Override
    public boolean contains(A object) {
        assert object != null;
        return objects.contains(object);
    }

    @Override
    public TupleN<A> add(A object) {
        assert object != null;
        List<A> newList = new ArrayList<>(objects);
        newList.add(object);
        return new TupleN<>(newList);
    }

    @Override
    public TupleN<A> map(Function<A, A> function) {
        assert function != null;
        return new TupleN<>(objects.stream().map(function).collect(Collectors.toList()));
    }
}
