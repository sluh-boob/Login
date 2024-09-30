/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programmingpoepart1;

import java.util.Scanner;

/**
 *
 * @author slule
 */
public class ProgrammingPoePart1 {

    public static void main(String[] args) {
        createAccount();
        
    }

    public static void createAccount() {
        
        String firstName;
        String lastName;
        String userName;
        String password;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first name: ");
        firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        lastName = input.nextLine();
        System.out.println("Create your username: ");
        userName = input.nextLine();
        System.out.println("Create your password");
        password = input.nextLine();
        
        System.out.print(com.mycompany.programmingpoepart1.Login.registerUser(userName, password));
        
        Login(userName, password, firstName, lastName);
    }

    public static void Login(String userName, String password, String firstName, String lastName) {
        String loginUser;
        String loginPass;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Login");
        System.out.println("Enter Username");
        loginUser = input.nextLine();
        System.out.println("Enter password");
        loginPass = input.nextLine();
        
        System.out.println(com.mycompany.programmingpoepart1.Login.returnLoginStatus(loginUser, loginPass, userName, password, firstName, lastName));
    }
}
