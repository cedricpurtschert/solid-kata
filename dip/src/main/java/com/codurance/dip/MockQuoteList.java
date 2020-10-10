package com.codurance.dip;

import java.util.List;

public class MockQuoteList implements IQuoteList {
    @Override
    public List<String> getQuoteList() {
        return List.of("This is my quote!");
    }
}
