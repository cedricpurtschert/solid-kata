package com.codurance.lsp.tuple;

import java.util.function.Function;

public interface Tuple<A> {

    int length();

    A get(int index);

    boolean contains(A object);

    Tuple<A> add(A object);

    Tuple<A> map(Function<A, A> function);
}
