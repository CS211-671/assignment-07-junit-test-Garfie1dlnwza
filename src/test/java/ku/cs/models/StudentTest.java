package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1 ;
    @BeforeEach
    void init(){
        s1 = new Student("6610450366","Field");
    }


    @Test
    void testAddscore(){
        s1.addScore(20);
        assertEquals(20,s1.getScore());
        s1.addScore(10);
        assertEquals(30,s1.getScore());

    }

    @Test
    void testCalculateGrade(){
        s1.addScore(50);
        assertEquals("D",s1.grade());
    }

    @Test
    void testChangeName(){
        s1.changeName("Garfield");
        assertEquals("Garfield",s1.getName());
    }

    @Test
    void testIsId(){
        assertEquals("6610450366",s1.getId());
    }


}