package com.codurance.dip;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FileQuoteListTest {

    @Test
    void getQuoteList() {
        FileQuoteList fileQuoteList = new FileQuoteList();
        assertThat(fileQuoteList.getQuoteList()).hasSize(6);
        assertThat(fileQuoteList.getQuoteList()).contains("I think therefore I am");
    }
}