package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test

    public void test() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test

    public void test1() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");

        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");


        String[] expected = {"Film 1", "Film 2", "Film 4", "Film 5", "Film 6", "Film 7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test2() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test3() {
        PosterManager manager = new PosterManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test

    public void FindLast() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Film 8");


        String[] expected = {"Film 8"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void FindLast10() {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");


        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast12() {
        PosterManager manager = new PosterManager(4);
        manager.addFilm("Film 4");
        manager.addFilm("Film 3");
        manager.addFilm("Film 2");
        manager.addFilm("Film 1");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast17() {
        PosterManager manager = new PosterManager(0);

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast18() {
        PosterManager manager = new PosterManager(1);
        manager.addFilm("Film 1");


        String[] expected = {"Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test

    public void testLast13() {
        PosterManager manager = new PosterManager(12);
        manager.addFilm("Film 12");
        manager.addFilm("Film 11");
        manager.addFilm("Film 10");
        manager.addFilm("Film 9");
        manager.addFilm("Film 8");
        manager.addFilm("Film 7");
        manager.addFilm("Film 6");
        manager.addFilm("Film 5");
        manager.addFilm("Film 4");
        manager.addFilm("Film 3");
        manager.addFilm("Film 2");
        manager.addFilm("Film 1");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10", "Film 11", "Film 12"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast20() {
        PosterManager manager = new PosterManager(20);
        manager.addFilm("Film 13");
        manager.addFilm("Film 12");
        manager.addFilm("Film 11");
        manager.addFilm("Film 10");
        manager.addFilm("Film 9");
        manager.addFilm("Film 8");
        manager.addFilm("Film 7");
        manager.addFilm("Film 6");
        manager.addFilm("Film 5");
        manager.addFilm("Film 4");
        manager.addFilm("Film 3");
        manager.addFilm("Film 2");
        manager.addFilm("Film 1");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10", "Film 11", "Film 12", "Film 13"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast14() {
        PosterManager manager = new PosterManager(10);

        manager.addFilm("Film 10");
        manager.addFilm("Film 9");
        manager.addFilm("Film 8");
        manager.addFilm("Film 7");
        manager.addFilm("Film 6");
        manager.addFilm("Film 5");
        manager.addFilm("Film 4");
        manager.addFilm("Film 3");
        manager.addFilm("Film 2");
        manager.addFilm("Film 1");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast15() {
        PosterManager manager = new PosterManager(10);

        manager.addFilm("Film 14");
        manager.addFilm("Film 13");
        manager.addFilm("Film 12");
        manager.addFilm("Film 11");
        manager.addFilm("Film 10");
        manager.addFilm("Film 9");
        manager.addFilm("Film 8");
        manager.addFilm("Film 7");
        manager.addFilm("Film 6");
        manager.addFilm("Film 5");
        manager.addFilm("Film 4");
        manager.addFilm("Film 3");
        manager.addFilm("Film 2");
        manager.addFilm("Film 1");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast19() {
        PosterManager manager = new PosterManager(10);

        manager.addFilm("Film 14");
        manager.addFilm("Film 13");
        manager.addFilm("Film 12");
        manager.addFilm("Film 11");
        manager.addFilm("Film 10");
        manager.addFilm("Film 9");
        manager.addFilm("Film 8");
        manager.addFilm("Film 7");
        manager.addFilm("Film 6");
        manager.addFilm("Film 5");
        manager.addFilm("Film 4");
        manager.addFilm("Film 3");
        manager.addFilm("Film 2");
        manager.addFilm("Film 1");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastNull() {
        PosterManager manager = new PosterManager();


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLast1() {
        PosterManager manager = new PosterManager();

        manager.addFilm("Film 7");


        String[] expected = {"Film 7"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
