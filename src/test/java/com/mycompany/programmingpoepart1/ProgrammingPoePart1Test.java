/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.programmingpoepart1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author slule
 */
public class ProgrammingPoePart1Test {
    
    public ProgrammingPoePart1Test() {
    }

    @Test
    public  void testCheckUserNameCorrectFormat()  {
        assertTrue(Login.checkUserName("kyl_1"));
    }

    @Test
    public void testCheckUserNameIncorrectFormat() {
        assertTrue(Login.checkUserName("kyle!!!!!!!"));
    }

    @Test
    public void testCheckPasswordComplexityCorrectFormat() {
        assertTrue(Login.checkPasswordComplexity("Ch&&sec@ke99"));
    }
    
    @Test
    public void testCheckPasswordComplexityIncorrectFormat() {
        assertTrue(Login.checkPasswordComplexity("password"));
    }
    
    @Test
    public void testLoginUserSuccessful() {
        assertTrue(Login.loginUser("kyl_1", "Ch&&sec@ke99!", "kyl_1", "Ch&&sec@ke99!"));
    }
    
    @Test
    public void testLoginUserFailed() {
        assertFalse(Login.loginUser("kyl_1", "incorrectPassword", "kyl_1", "Ch&&sec@ke99!"));
    }
    
    @Test
    public void testCheckUserNameCorrectFormatReturnsTrue() {
        assertTrue(Login.checkUserName("kyl_1"));
  
    }
    
}
