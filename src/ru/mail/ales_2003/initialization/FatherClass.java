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
public class FatherClass extends ForefatherClass {
    static{
    FatherClassField staticBlockFatherClass = new FatherClassField("Static Block");
    }
    
    {
    FatherClassField notStaticBlockFatherClass = new FatherClassField("Not Static Block");
    }
    
    public static FatherClassField staticFatherClassField = new FatherClassField("Static Field");
    public FatherClassField notStaticFatherClassField = new FatherClassField("Not Static Field");
    
    
    public FatherClass() {
    System.out.println("Constructor of FatherClass");
    }
    
}
