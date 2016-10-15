/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mail.ales_2003.initialization;

/**
 *
 * @author admin
 */
public class ForefatherClass {
        
    public static ForefatherClassField staticForefatherClassField = new ForefatherClassField("Static Field");
    public ForefatherClassField notStaticForefatherClassField = new ForefatherClassField("Not Static Field");
      
    
    public ForefatherClass() {
    System.out.println("Constructor of ForefatherClass");
    }
    
    static{
    ForefatherClassField staticBlockForefatherClass = new ForefatherClassField("Static Block");
    }
    
    {
    ForefatherClassField notStaticBlockForefatherClass = new ForefatherClassField("Not Static Block");
    }
    
}
