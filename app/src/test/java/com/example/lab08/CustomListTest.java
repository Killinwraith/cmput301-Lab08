package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import android.view.ScaleGestureDetector;

public class CustomListTest {

    @Test
    public void testHasCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));

    }

    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("edmonton", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);

        assertTrue(list.hasCity(calgary));
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));

    }

    @Test
    public void testGetCityCount(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("edmonton", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);

        assertTrue(list.hasCity(calgary));
        assertEquals(2, list.getCityCount());
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
        assertEquals(1, list.getCityCount());

        assertTrue(list.hasCity(edmonton));
        assertEquals(1, list.getCityCount());
        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
        assertEquals(0, list.getCityCount());

    }





}
