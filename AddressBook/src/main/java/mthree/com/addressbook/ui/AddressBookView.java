/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.addressbook.ui;

import java.util.List;
import javax.swing.text.View;
import mthree.com.addressbook.dao.AddressBookDaoException;
import mthree.com.addressbook.dto.Address;
import mthree.com.addressbook.dto.*;

/**
 *
 * @author ta
 */
public class AddressBookView {
    private UserIO io= new UserIOConsoleImpl();
    
    public void displayAddAddressBanner(){
        io.print("=== New Adderss to be added ===");
    }
    public void displayAddSuccessBanner(){
        io.print(" New Adderss was successfully added. ");
        int i;
        do {            
                i=io.readInt("Press 1 to go to Main Menu.");
        } while (i!=1);
     //   printMenuAndGetSelection();
    }
    
    public void displayDeleteAddressBanner(){
        io.print("=== Adderss will be deleted ===");
    }
    public void displayDeleteSuccessBanner(){
        io.print(" Adderss has been successfully deleted.");
        int i;
        do {            
                i=io.readInt("Press 1 to go to Main Menu.");
        } while (i!=1);
    //    printMenuAndGetSelection();
    }
    
    public void displayCountAddressBanner(){
        io.print("=== The number of Address in the Address book ===");
    }
    
    public void displayListAddressesBanner(){
        io.print("=== The list of addresses ===");
    }
    
    public void displayListAddressesSuccessBanner(){
        io.print(" This is the end of the list. ");
        int i;
        do {            
                i=io.readInt("Press 1 to go to Main Menu.");
        } while (i!=1);
     //   printMenuAndGetSelection();
    }
    
    public void displayAddressesBanner(){
        io.print(" AN Address has been shown successfully. ");
        int i;
        do {            
                i=io.readInt("Press 1 to go to Main Menu.");
        } while (i!=1);
    //    printMenuAndGetSelection();
    }
    
    
    public int printMenuAndGetSelection(){
    io.print("Main Menu");
    io.print("1. Add Address");
    io.print("2. Delete Address");
    io.print("3. Find Address");
    io.print("4. List Address Count");
    io.print("5. List All Addresses");
    io.print("6. Exit");
    
     return io.readInt("Please select one of the above choces ", 1, 6);
    }
    
    public Address addAddress(){
        Address currentAddress=new Address();
        currentAddress.setFirstName(io.readString("Please enter first name: "));
        currentAddress.setLastName(io.readString("Please enter last name: "));
        currentAddress.setNumberAndStreet(io.readString("Please enter the door number and street: "));
        currentAddress.setCodePostal(io.readString("Please enter code postal: "));
        currentAddress.setState(io.readString("Please enter the state: "));
        currentAddress.setCountry(io.readString("Please enter the country: "));
        
        return currentAddress;
    }
    
    public void displayCountAddress(int count){
        io.print("There are " + count + " addresses in the book");
        int i;
        do {            
                i=io.readInt("Press 1 to go to Main Menu.");
        } while (i!=1);
    //    printMenuAndGetSelection();
    }
    
    public void displayListOfAddresses(List<Address> addresses)throws AddressBookDaoException{
        if(!addresses.isEmpty()){
            for (Address addresse : addresses) {
                io.print(addresse.getFirstName() + " " + addresse.getLastName());
                io.print(addresse.getNumberAndStreet());
                io.print(addresse.getCodePostal() + ", " + addresse.getCodePostal());
                io.print(addresse.getCountry());
            }
        }else
        {
            io.print("There is not address");
        }
    }
    
    public String getLastNameChoiceAddress(){
        return io.readString("Please enter last name: ");
        
    }
    
    public void displayAddress(Address address)throws AddressBookDaoException{
        if(address !=null){
            io.print(address.getFirstName() + " " + address.getLastName());
            io.print(address.getNumberAndStreet());
            io.print(address.getCodePostal() + ", " + address.getCodePostal());
            io.print(address.getCountry());
        }else
        {
            io.print("there is not such address");
        }
    
    }
    
    public void listAddressIsEmpty(){
        io.print("The address book is empty");
        int i;
        do {            
                i=io.readInt("Press 1 to go to Main Menu.");
        } while (i!=1);
    }
    
    public void displayExitBanner(){
       io.print("GoodBye !!!");
   }
   public void displayUnknownCommandBanner(){
       io.print("Unknown Command!!!");
   }
   
   public void displayErrorMessage(String errorMsg){
       io.print("=== ERROR ===");
       io.print(errorMsg);
   }
}
