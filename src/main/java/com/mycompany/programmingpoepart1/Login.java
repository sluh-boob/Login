/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programmingpoepart1;

/**
 *
 * @author slule
 */
public class Login {
    public static boolean checkUserName(String UserName) {
        if(UserName.length()<=5 && UserName.contains("_")){
            System.out.println(UserName);
            return true;
          
        }
        else {
            return false;
        }
    }
    
    public static boolean checkPasswordComplexity(String Password) {
        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasSpecialCharacter = false;
        
        for (int i = 0;  i < Password.length(); i++) {
            char c = Password.charAt(i);
            
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if ("!@#$%^&*()_+;:{}|[]\\'<>?.,/".indexOf(c) != -1) {
                hasSpecialCharacter = true;
            }
                
           
        }
        return hasDigit && hasUppercase && hasSpecialCharacter && Password.length() >= 8;
        }
        public static String registerUser(String userName, String Password) {
            if (! checkUserName(userName)) {
                return "Invalid username" ;
                
            }
                if (! checkPasswordComplexity(Password)) {
                    return "Invalid password";
                }
                return "Registration successful";
                
        }
        public static boolean loginUser(String LoginUser, String LoginPass, String userName, String Password)
        {
            if (LoginUser.equals(userName) && LoginPass.equals(Password)) {
                return true;
                
            }else{
                return false;
            }
        }
    

    static String returnLoginStatus(String loginUser, String loginPass, String userName, String password, String firstName, String lastName) 
    {
        if (loginUser(loginUser, loginPass, userName, password) == false)
        {
            return "Username or password in not correctly formatted. please try again" ;
        }else{
            return "Welcome" + firstName + ", " + lastName + "It is great to see you again" ;
        }
         }
}

