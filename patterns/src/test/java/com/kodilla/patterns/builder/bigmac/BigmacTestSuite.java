package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.SESAME)
                .ingredients(Ingredients.CHEESE)
                .burgers(2)
                .sauce(Sauce.STANDARD)
                .ingredients(Ingredients.CHEESE)
                .ingredients(Ingredients.PICKLES)
                .ingredients(Ingredients.PICKLES)
                .build();

        //When
        Bun bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        Sauce sauce = bigmac.getSauce();
        List<Ingredients> ingredients = bigmac.getIngredients();

        //Then
        assertAll(() -> assertEquals(Bun.SESAME, bun),
                () -> assertEquals(2, burgers),
                () -> assertEquals(Sauce.STANDARD, sauce),
                () -> assertEquals(4, ingredients.size()));
    }
}
