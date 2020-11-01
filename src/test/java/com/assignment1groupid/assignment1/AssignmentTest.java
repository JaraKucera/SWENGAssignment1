package com.assignment1groupid.assignment1;

import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AssignmentTest {
    
    @Test
    public void testStudentUsername(){
        Student s = new Student("John",18, "01/02/2002", 989784);
        assertEquals("John18", s.getUsername());
    }
    
    @Test
    public void testCourseInStudent(){
        Student s = new Student("John",18, "01/02/2002", 989784);
        Course c = new Course("CT404", new DateTime("2020-08-01"), new DateTime("2020-12-20"));
        s.addCourse(c);
        Course c1 = new Course("CT404", new DateTime("2020-08-01"), new DateTime("2020-12-20"));
        assertTrue(s.studiesCourse(c1));
        Course c2 = new Course("CT511", new DateTime("2021-08-01"), new DateTime("2021-12-20"));
        assertFalse(s.studiesCourse(c2));
        s.removeCourse(c1);
        assertFalse(s.studiesCourse(c));
    }
    
    @Test
    public void testModuleInStudent(){
        Student s = new Student("John",18, "01/02/2002", 989784);
        Module m = new Module("Systems", 11256);
        s.addModule(m);
        Module m1 = new Module("Systems", 11256);
        assertTrue(s.studiesModule(m1));
        Module m2 = new Module("Electronics", 221285);
        assertFalse(s.studiesModule(m2));
        s.removeModule(m1.getModuleID());
        assertFalse(s.studiesModule(m));
    }
    
    @Test
    public void testCourse(){
        Student s = new Student("John",18, "01/02/2002", 989784);
        Course c = new Course("CT404", new DateTime("2020-08-01"), new DateTime("2020-12-20"));
        c.addStudent(s);
        Module m = new Module("Systems", 11256);
        c.addModule(m);
        
        Student s1 = new Student("John",18, "01/02/2002", 989784);
        Module m1 = new Module("Systems", 11256);
        assertTrue(c.containsModule(m1));
        assertTrue(c.studyingStudents(s1));
    }
    
    @Test
    public void testModule(){
        Student s = new Student("John",18, "01/02/2002", 989784);
        Course c = new Course("CT404", new DateTime("2020-08-01"), new DateTime("2020-12-20"));
        Module m = new Module("Systems", 11256);
        
        m.addCourse(c);
        m.addStudent(s);
        Course c1 = new Course("CT404", new DateTime("2020-08-01"), new DateTime("2020-12-20"));
        Student s1 = new Student("John",18, "01/02/2002", 989784);
        
        assertTrue(m.includedInCourse(c1));
        assertTrue(m.studyingStudents(s1));
    }
}
