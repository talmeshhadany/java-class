package mthree.com.addressbook.controller;

import java.awt.Desktop;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mthree.com.addressbook.dao.AddressBookDao;
import mthree.com.addressbook.dao.AddressBookDaoException;
import mthree.com.addressbook.dto.Address;
import mthree.com.addressbook.ui.AddressBookView;
import mthree.com.addressbook.ui.UserIO;
import mthree.com.addressbook.ui.UserIOConsoleImpl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ta
 */
public class AddressbookController {
   
    private AddressBookView view;
    private AddressBookDao dao;

    public AddressbookController(AddressBookView view, AddressBookDao dao) {
        this.view= view;
        this.dao= dao;
    }
    
    
    
   public void run(){
       boolean keepGoing=true;
       int menuSelection=0;
       try {
            while (keepGoing) {
                menuSelection=view.printMenuAndGetSelection();
                switch (menuSelection) {
                    case 1:
                        addAddress();
                        break;
                     case 2:
                        deleteAddress();
                        break;
                     case 3:
                        getAddress(); 
                        break;
                     case 4:
                        getCountAddresses();
                        break;
                     case 5:
                        listAddresses();
                        break;
                     case 6:
                        keepGoing=false;
                        break;
                    default:
                        unknownCommand();      
                }

            }
            exitMessage();
       } catch (AddressBookDaoException e) {
           view.displayErrorMessage(e.getMessage());
       }
   }
   public void addAddress()throws AddressBookDaoException{
        view.displayAddAddressBanner();
        Address newAddress= view.addAddress();
        dao.addAddress(newAddress.getLastName(), newAddress);
        view.displayAddSuccessBanner();
   }
   public void deleteAddress()throws AddressBookDaoException{
       view.displayDeleteAddressBanner();
       String lastName=view.getLastNameChoiceAddress();
       dao.deleteAddress(lastName);
       view.displayDeleteSuccessBanner();
   
   }
   
   public void getCountAddresses()throws AddressBookDaoException{
       view.displayCountAddressBanner();
       int count=dao.getNumberOfAddresses();
       view.displayCountAddress(count);
   }
   
   public void listAddresses()throws AddressBookDaoException{
       view.displayListAddressesBanner();
       List<Address> listaddress=dao.getListOfAddresses();
       view.displayListOfAddresses(listaddress);
       view.displayListAddressesSuccessBanner();
   }
   
   public void getAddress() throws AddressBookDaoException{
       List<Address> listaddress=dao.getListOfAddresses();
       if (!listaddress.isEmpty()) {
            String lastName=view.getLastNameChoiceAddress();
            Address address=dao.getAddress(lastName);
            view.displayAddress(address);
            view.displayAddressesBanner();   
       }else
       {
           view.listAddressIsEmpty();
       }
       
   }
   private void unknownCommand(){
        view.displayUnknownCommandBanner();
    }
    private void exitMessage(){
        view.displayExitBanner();
    }
}
