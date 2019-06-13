package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    Student Angelica;

    @Before
    public void setUp() {

        Double[] examScores = {90.5, 100.0, 87.3, 120.5, 90.0};
        Angelica = new Student("Angelica", "Santos", examScores);
    }

    @Test
    public void getFirstName() {
        String expected = "Angelica";
        String actual = Angelica.getFirstName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstName() {
        Angelica.setFirstName("Angelica");
        String expected = "Angelica";
        String actual = Angelica.getFirstName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastName() {
        String expected = "Santos";
        String actual = Angelica.getLastName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastName() {
        Angelica.setLastName();
        String expected = "Santos";
        String actual = Angelica.getLastName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScores() {
        String expected = "Exam Scores:\n" +
                "       Exam 1 -> 90\n" +
                "       Exam 2 -> 100\n" +
                "       Exam 3 -> 87\n" +
                "       Exam 4 -> 120\n" +
                "       Exam 5 -> 90";
        String actual = Angelica.getExamScores();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScore() {
        Angelica.addExamScore(101.5);
        String expected = "Exam Scores:\n" +
                "       Exam 1 -> 90\n" +
                "       Exam 2 -> 100\n" +
                "       Exam 3 -> 87\n" +
                "       Exam 4 -> 120\n" +
                "       Exam 5 -> 90\n" +
                "       Exam 6 -> 101";
        String actual = Angelica.getExamScores();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScore() {

        Angelica.setExamScore(2, 50.5);
        String expected = "Exam Scores:\n" +
                "       Exam 1 -> 90\n" +
                "       Exam 2 -> 50\n" +
                "       Exam 3 -> 87\n" +
                "       Exam 4 -> 120\n" +
                "       Exam 5 -> 90";
        String actual = Angelica.getExamScores();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScore() {
        Integer expected = 97;
        Integer actual = Angelica.getAverageExamScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScores() {
        ArrayList<Double> newScores = new ArrayList<>();
        newScores.add(10.5);
        newScores.add(70.0);
        newScores.add(87.3);
        Angelica.setExamScores(newScores);

        String expected = "Exam Scores:\n" +
                "       Exam 1 -> 10\n" +
                "       Exam 2 -> 70\n" +
                "       Exam 3 -> 87";

        String actual = Angelica.getExamScores();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfExamsTaken() {
        Integer expected = 5;
        Integer actual = Angelica.getNumberOfExamsTaken();

        Assert.assertEquals(expected, actual);
    }

}