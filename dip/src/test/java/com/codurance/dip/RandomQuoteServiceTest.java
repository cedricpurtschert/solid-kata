package com.codurance.dip;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class RandomQuoteServiceTest {

    @Mock
    private IQuoteList quoteList;
    private RandomQuoteService randomQuoteService;

    @Before
    public void setUp() {
        randomQuoteService = new RandomQuoteService(quoteList);
        given(quoteList.getQuoteList()).willReturn(List.of("This is my quote!"));
    }

    @Test
    public void getRandomQuote() {
        assertThat(randomQuoteService.getRandomQuote()).isEqualTo("This is my quote!");
    }
}