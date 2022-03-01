/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mthree.com.addressbook.dao;

import java.util.List;
import java.util.Map;
import mthree.com.addressbook.dto.Address;

/**
 *
 * @author ta
 */
public interface AddressBookDao {
    Address addAddress(String lName, Address address)throws AddressBookDaoException;
    Address deleteAddress(String lName)throws AddressBookDaoException;
    int getNumberOfAddresses()throws AddressBookDaoException;
    List<Address> getListOfAddresses()throws AddressBookDaoException;
    Address getAddress(String lName)throws AddressBookDaoException;
    
    
}
