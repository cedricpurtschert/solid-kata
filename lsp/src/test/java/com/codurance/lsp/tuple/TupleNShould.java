package com.codurance.lsp.tuple;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TupleNShould {

    @Test
    public void test_add_all_tuples() {
        Tuple tuple = new Tuple0();
        tuple = tuple.add("Hello");
        tuple = tuple.add("World");
        tuple = tuple.add("!");
        tuple = tuple.map(input -> input + " ");
        assertThat(tuple.get(0)).isEqualTo("Hello ");
        assertThat(tuple.get(1)).isEqualTo("World ");
        assertThat(tuple.get(2)).isEqualTo("! ");
    }

}