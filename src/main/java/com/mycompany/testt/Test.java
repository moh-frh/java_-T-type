/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testt;

/**
 *
 * @author ferhi.mohamedfouaz
 */
public class Test {

    public static void main(String[] args) {
        System.err.println("getValue "+getValue(String.class));  ;
    }

public static <T extends Object> T getValue(Class<T> classs)
{
if(classs.equals(String.class))
{
return (T)"azul";
}


if(classs.equals(Integer.class))
{
return (T)Integer.valueOf(999);
}

return null;
}
    
}
