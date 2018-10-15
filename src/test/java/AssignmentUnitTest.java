/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.alanfahy.assignment_1.Course;
import com.alanfahy.assignment_1.Modules;
import com.alanfahy.assignment_1.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author alanfahy87
 */
public class AssignmentUnitTest {
    
    public AssignmentUnitTest() {
    }
    
    

    @Test
    public void studentTest() {
        Student student;
        student = new Student("John Doe", "qwerty", 23, "21/10/1997", "BCT", "SoftEng");
        assertEquals(23, student.getAge());
        assertEquals("John Doe23", student.getUsername());
    };
    @Test
    public void ModuleTests(){
        Modules modules;
        ArrayList<Student> students = new ArrayList<Student>();
        Student students1 = new Student("John Doe", "qwerty", 23, "21/10/1997", "BCT", "SoftEng");
        Student students2 = new Student("Jane Doe", "qwerty", 24, "21/10/1996", "BCT", "SoftEng");
        students.add(students1);
        students.add(students2);
        modules = new Modules("CT123",students);
       assertEquals("CT123",modules.getModuleName());
       assertEquals("John Doe",modules.getStudents().get(0).getName());
       
    }
    @Test
    public void CourseTest(){
        Course course;
        Modules modules;
        ArrayList<Student> students = new ArrayList<Student>();
        Student students1 = new Student("John Doe", "qwerty", 23, "21/10/1997", "BCT", "SoftEng");
        Student students2 = new Student("Jane Doe", "qwerty", 24, "21/10/1996", "BCT", "SoftEng");
        students.add(students1);
        students.add(students2);
        ArrayList<Modules> module = new ArrayList<Modules>();
        modules = new Modules("CT123",students);
        module.add(modules);
        DateTime startDate = new DateTime(2004, 12, 25, 12, 0, 0, 0);
        DateTime endDate = new DateTime(2011, 12, 25, 12, 0, 0, 0);
        course = new Course("CS&IT",module,startDate,endDate);
        assertEquals("CS&IT",course.getCourseName());
        assertEquals(2004, course.getStartDate().getYear());
        assertEquals(2011, course.getEndDate().getYear());
        assertEquals("John Doe23",course.getModules().get(0).getStudents().get(0).getUsername());
        assertEquals("Jane Doe24",course.getModules().get(0).getStudents().get(1).getUsername());
    }
   
}
