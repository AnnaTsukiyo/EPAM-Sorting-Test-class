package com.epam.rd.autotasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortingTest {

        Sorting sorting = new Sorting();

        @Test(expected = IllegalArgumentException.class)
        public void testNullCase() {

            int[] array = null;
            sorting.sort(array);
        }

        @Test
        public void testEmptyCase() {

            int[] array = new int[]{};

            sorting.sort(array);

            assertEquals(0, array.length);
        }

        @Test
        public void testSingleElementArrayCase() {

            int[] array = new int[]{432};

            sorting.sort(array);

            assertEquals(1, array.length);
            assertEquals(432, array[0]);
        }

        @Test()
        public void testSortedArraysCase() {

            int[] array = new int[]{1, 2, 3, 4};

            sorting.sort(array);
            assertEquals(1, array[0]);
            assertEquals(2, array[1]);
            assertEquals(3, array[2]);
            assertEquals(4, array[3]);
        }

        @Test
        public void testOtherCases() {

            int[] array = new int[]{4, 3, 2, 1};

            sorting.sort(array);
            assertEquals(1, array[0]);
            assertEquals(2, array[1]);
            assertEquals(3, array[2]);
            assertEquals(4, array[3]);
        }
    }