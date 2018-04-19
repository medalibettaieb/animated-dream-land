/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.testproject.entities;

/**
 *
 * @author Karray
 */
public class Student {

    private static Student instance;
    
    private Student() {
    }
    
    public static Student getInstance(){
        if(instance == null){
            instance = new Student();
        }
        return instance;
    } 
    
    
    public void marcher(){
        
    }
}
