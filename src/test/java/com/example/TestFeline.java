package com.example;

import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFeline {

    @Test
    public void felineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void felineGetFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";

        assertEquals(expected, actual);
    }
}