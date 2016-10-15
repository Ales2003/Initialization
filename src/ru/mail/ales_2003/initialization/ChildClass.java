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
public class ChildClass extends FatherClass {
    public static ChildClassField staticChildClassField = new ChildClassField("Static");
    public ChildClassField notStaticChildClassField = new ChildClassField("Not Static");

    public ChildClass() {
    System.out.println("Constructor of ChildClass");
    }
    
    
}
