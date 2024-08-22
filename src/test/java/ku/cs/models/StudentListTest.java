package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init(){
        studentList = new StudentList();

    }

    @Test
    void testAddNewStudent(){
        studentList.addNewStudent("111","F");
        Student s1 = studentList.findStudentById("111");
        assertEquals("111",s1.getId());
        assertEquals("F",s1.getName());
    }
    @Test
    void testGiveScoreToId(){
        studentList.addNewStudent("111","F");
        Student s1 = studentList.findStudentById("111");
        s1.addScore(50);
        assertEquals(50,s1.getScore());
    }

    @Test
    void testFindStudenById(){
        studentList.addNewStudent("111","F");
        studentList.addNewStudent("112","A");
        studentList.addNewStudent("113","B");

        Student s1 = studentList.findStudentById("111");
        Student s2 = studentList.findStudentById("112");
        Student s3 = studentList.findStudentById("113");

        assertEquals("112",s2.getId());
        assertEquals("A",s2.getName());
    }
    @Test
    void testViewGradeOfID(){
        studentList.addNewStudent("131","Fsa",80);
        studentList.addNewStudent("112","Abc",20);

        String grade = studentList.viewGradeOfId("131");
        assertEquals("A",grade);
    }
}
