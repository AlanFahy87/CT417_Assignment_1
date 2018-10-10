/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanfahy.assignment_1;

/**
 *
 * @author alanfahy87
 */
public class Student {
    
    private String Name;
    private String Id;
    private int Age;
    private String DOB;
    private String Course;
    private String Modules;

    public Student(String Name, String Id, int Age, String DOB, String Course, String Modules) {
        this.Name = Name;
        this.Id = Id;
        this.Age = Age;
        this.DOB = DOB;
        this.Course = Course;
        this.Modules = Modules;

    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the Course
     */
    public String getCourse() {
        return Course;
    }

    /**
     * @param Course the Course to set
     */
    public void setCourse(String Course) {
        this.Course = Course;
    }

    /**
     * @return the Modules
     */
    public String getModules() {
        return Modules;
    }

    /**
     * @param Modules the Modules to set
     */
    public void setModules(String Modules) {
        this.Modules = Modules;
    }

    public String getUsername() {
        return getName() + getAge();
    }

}
