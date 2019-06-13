package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClassroomTest {
    Student Angie;
    Student Stephanie;
    Student Kevin;
    Student Emilio;
    Student frank;
    Student ted;
    Student added;

    Student null1;
    Student null2;

    Classroom classroom1;

    ArrayList<Student> expectedA = new ArrayList<>();
    ArrayList<Student> expectedB = new ArrayList<>();
    ArrayList<Student> expectedC = new ArrayList<>();
    ArrayList<Student> expectedD = new ArrayList<>();
    ArrayList<Student> expectedF = new ArrayList<>();


    @Before
    public void setUp() {

        Double[] oneExamScores = {10.0, 10.0, 20.0, 20.0, 10.0};
        Angie = new Student("Angie", "Santos", oneExamScores);

        Double[] twoExamScores = {20.0, 10.0, 30.0, 40.0, 40.0};
        Stephanie = new Student("Stephanie", "Morel", twoExamScores);

        Double[] threeExamScores = {20.0, 30.0, 40.0, 12.0, 30.0};
        Kevin = new Student("Kevin", "Morel", threeExamScores);

        Double[] fourExamScores = {40.0, 100.0, 100.0, 50.0, 100.0};
        Emilio = new Student("Emilio", "Morel", fourExamScores);

        Double[] fiveExamScores = {40.0, 100.0, 100.0, 50.0, 100.0};
        frank = new Student("Frank", "Santos", fiveExamScores);

        Double[] sixExamScores = {0.0, 0.0, 0.0, 0.0, 0.0};
        ted = new Student("Ted", "Santos", sixExamScores);

        Double[] addedExamScores = {20.0, 25.5, 45.0, 70.5, 10.0};
        added = new Student("Added", "ToList", addedExamScores);


        Student[] classStudents = {Angie, Stephanie, Kevin, Emilio, frank, ted};
        classroom1 = new Classroom(classStudents);

    }


    @Test
    public void getStudents() {
        Student[] expected = {Angie, Stephanie, Kevin, Emilio, frank, ted};
        Student[] actual = classroom1.getStudents();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getAverageExamScore() {
        Double expected = 37.4;
        Double actual = classroom1.getAverageExamScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStudent() {
        Student[] expected = {Angie, Stephanie, Kevin, Emilio, frank, ted, added};
        classroom1.addStudent(added);

        Student[] actual = classroom1.getStudents();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeStudent() {
        Student[] expected = {Angie, Stephanie, Kevin, Emilio, frank, ted};
        classroom1.removeStudent("George", "Washington");
        Student[] actual = classroom1.getStudents();

        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void getStudentsByScore() {
        Student[] expected = {Angie, Stephanie, Kevin, Emilio, frank, ted};
        classroom1.getStudents();
        Student[] actual = classroom1.getStudents();

        Assert.assertArrayEquals(expected, actual);

    }
}

