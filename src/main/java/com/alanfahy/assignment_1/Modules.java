/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanfahy.assignment_1;

import java.util.ArrayList;

/**
 *
 * @author alanfahy87
 */
public class Modules {
    private String ModuleName;
    private ArrayList<Student> Students;
    
    public Modules(String ModuleName,ArrayList<Student> Students){
        this.ModuleName = ModuleName;
        this.Students = Students;
        
    }

    

    /**
     * @return the ModuleName
     */
    public String getModuleName() {
        return ModuleName;
    }

    /**
     * @param ModuleName the ModuleName to set
     */
    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }

    /**
     * @return the Students
     */
    public ArrayList<Student> getStudents() {
        return Students;
    }

    /**
     * @param Students the Students to set
     */
    public void setStudents(ArrayList<Student> Students) {
        this.Students = Students;
    }
    
    
}
