/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.myapp.employeemanager.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String string) {
        super(string);
    }

}
