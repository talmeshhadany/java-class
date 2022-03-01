/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.addressbook.dao;

/**
 *
 * @author ta
 */
public class AddressBookDaoException extends Exception {
    public AddressBookDaoException(String message){
        super(message);
    }
    
    public AddressBookDaoException(String message, Throwable cause){
        super(message, cause);
    }
}
