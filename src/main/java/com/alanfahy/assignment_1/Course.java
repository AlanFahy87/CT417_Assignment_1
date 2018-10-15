/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanfahy.assignment_1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author alanfahy87
 */
public class Course {
    private String CourseName;
    private ArrayList<Modules> Modules;
    private DateTime StartDate;
    private DateTime EndDate;
    
    

    public Course(String CourseName, ArrayList<Modules> Modules, DateTime StartDate, DateTime EndDate) {
        this.CourseName = CourseName;
        this.Modules = Modules;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    /**
     * @return the CourseName
     */
    public String getCourseName() {
        return CourseName;
    }

    /**
     * @param CourseName the CourseName to set
     */
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    /**
     * @return the Modules
     */
    public ArrayList<Modules> getModules() {
        return Modules;
    }

    /**
     * @param Modules the Modules to set
     */
    public void setModules(ArrayList<Modules> Modules) {
        this.Modules = Modules;
    }

    /**
     * @return the StartDate
     */
    public DateTime getStartDate() {
        return StartDate;
    }

    /**
     * @param StartDate the StartDate to set
     */
    public void setStartDate(DateTime StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * @return the EndDate
     */
    public DateTime getEndDate() {
        return EndDate;
    }

    /**
     * @param EndDate the EndDate to set
     */
    public void setEndDate(DateTime EndDate) {
        this.EndDate = EndDate;
    }
    
}
