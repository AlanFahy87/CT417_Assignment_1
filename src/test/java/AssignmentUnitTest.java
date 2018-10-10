/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.alanfahy.assignment_1.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    }
   
}
