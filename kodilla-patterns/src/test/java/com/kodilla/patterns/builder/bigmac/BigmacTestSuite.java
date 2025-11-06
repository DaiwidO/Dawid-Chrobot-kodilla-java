package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testNewBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame bun")
                .burgers(3)
                .sauce("barbecue")
                .ingredient("shredded iceberg lettuce")
                .ingredient("pickle slices")
                .ingredient("diced onions")
                .build();
        //When
        int numberOfIngredients = bigmac.getIngredients().size();
        System.out.println(bigmac);

        //Then
        assertEquals(3, numberOfIngredients);
    }
}
