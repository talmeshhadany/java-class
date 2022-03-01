/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.addressbook.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import mthree.com.addressbook.dto.Address;

/**
 *
 * @author ta
 */
public class AddressBookDaoImpl implements AddressBookDao {
    private Map<String, Address> addresses= new HashMap<>();
    
    public static final String ADDRESSBBOK_FILE = "Address book.txt";
    public static final String DELIMETER = "::";
    
    private Address unmarshallAddress(String addressAsText){
        // addressAsText is expecting a line read in from our file.
        // For example, it might look like this:
        // Ada::Lovelace:: 10 Newyork street:: 56438:: NewYork::US
        //
        // We then split that line on our DELIMITER - which we are using as ::
        // Leaving us with an array of Strings, stored in addressTokens.
        // Which should look like this:
        // _________________________________________________
        // |First |Last |Street |           |      |        |
        // |Name  |Name | &Num  |Code Postal|State | Country|
        // |______|_____|_______|___________|______|________|
        // 
        //  [0]     [1]    [2]         [3]    (4)     (5)
    
        String[] addressTokens = addressAsText.split(DELIMETER);
        // Given the pattern above, the student Id is in index 0 of the array.
       // String studentId = studentTokens[0];
        
        // Which we can then use to create a new Address object to satisfy
        // the requirements of the Address constructor.
        Address addressFormFile = new Address();
        
        // However, there are 3 remaining tokens that need to be set into the
        // new student object. Do this manually by using the appropriate setters.
        
        //Index 0- FirstName
        addressFormFile.setFirstName(addressTokens[0]);
        
        //Index 1 - LastName
        addressFormFile.setLastName(addressTokens[1]);
        
        //Index2- Cohort
        addressFormFile.setNumberAndStreet(addressTokens[2]);
        
        //Index3- Cohort
        addressFormFile.setCodePostal(addressTokens[3]);
        
        //Index4- Cohort
        addressFormFile.setState(addressTokens[4]);
        
        //Index5- Cohort
        addressFormFile.setCountry(addressTokens[5]);
        
        // We have now created a student! Return it!
        return addressFormFile;
    }
    
    private void loadAddressBook() throws AddressBookDaoException{
    
        Scanner scanner;
        
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(ADDRESSBBOK_FILE)));
        } catch (FileNotFoundException e) {
        
            throw new AddressBookDaoException("-_- Could not load roster data into memory.", e);
        }
        // currentLine holds the most recent line read from the file
        String currentLine;
        // currentStudent holds the most recent student unmarshalled
        Address currentAddress;
        // Go through ROSTER_FILE line by line, decoding each line into a 
        // Student object by calling the unmarshallStudent method.
        // Process while we have more lines in the file
        while(scanner.hasNext()){
            // get the next line in the file
            currentLine = scanner.nextLine();
            // unmarshall the line into a Student
            currentAddress=unmarshallAddress(currentLine);
            // We are going to use the student id as the map key for our student object.
            // Put currentStudent into the map using student id as the key
            
            addresses.put(currentAddress.getLastName(),currentAddress);
            
        }
        // close scanner
        scanner.close();
    }
    
    public String marshallAddress(Address address){
        // We need to turn a Student object into a line of text for our file.
        // For example, we need an in memory object to end up like this:
        // 4321::Charles::Babbage::Java-September1842

        // It's not a complicated process. Just get out each property,
        // and concatenate with our DELIMITER as a kind of spacer. 

        // Start with the student id, since that's supposed to be first.
        
    //    String studentAsText =aStudent.getStudentId() + DELIMETER;
        String addressAsText = address.getFirstName()+ DELIMETER;
        addressAsText +=address.getLastName()+DELIMETER;
        addressAsText +=address.getNumberAndStreet()+DELIMETER;
        addressAsText +=address.getCodePostal()+DELIMETER;
        addressAsText +=address.getState()+DELIMETER;
        addressAsText +=address.getCountry();
        // We have now turned a student to text! Return it!
        return addressAsText;
    }
    /**
 * Writes all students in the roster out to a ROSTER_FILE.  See loadRoster
 * for file format.
 * 
 * @throws StudentQuizGradesDaoException if an error occurs writing to the file
 */
    private void writeAddressBook() throws AddressBookDaoException{
        // NOTE FOR APPRENTICES: We are not handling the IOException - but
        // we are translating it to an application specific exception and 
        // then simple throwing it (i.e. 'reporting' it) to the code that
        // called us.  It is the responsibility of the calling code to 
        // handle any errors that occur.
    
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(ADDRESSBBOK_FILE));
        } catch (IOException e) {
            throw new AddressBookDaoException("Could not save student data.", e);
        }
        // Write out the Student objects to the roster file.
        // NOTE TO THE APPRENTICES: We could just grab the student map,
        // get the Collection of Students and iterate over them but we've
        // already created a method that gets a List of Students so
        // we'll reuse it.
        String addressAsText;
        List<Address> addressList = this.getListOfAddresses();
        for (Address currentAddress : addressList) {
            // turn a Student int a String
            addressAsText = marshallAddress(currentAddress);
            
            // write the Student object to the file
            out.println(addressAsText);
            //force PrintWriter to write Line to the file
            out.flush();
        }
        // clean up
        out.close();
    }
    
    
    @Override
    public Address addAddress(String lName, Address address) throws AddressBookDaoException{
        loadAddressBook();
        Address newAddress=addresses.put(lName, address);
        writeAddressBook();
        return newAddress;
    }

    @Override
    public Address deleteAddress(String lName) throws AddressBookDaoException{
        loadAddressBook();
        Address removedAddress=addresses.remove(lName);
        writeAddressBook();
        return removedAddress;
    } 
    
    @Override
    public int getNumberOfAddresses() throws AddressBookDaoException{
        loadAddressBook();
        return addresses.size();
    }

    @Override
    public List<Address> getListOfAddresses()throws AddressBookDaoException {
        loadAddressBook();
        return new ArrayList<>(addresses.values());
    }

    @Override
    public Address getAddress(String lName) throws AddressBookDaoException{
        loadAddressBook();
        return addresses.get(lName);
    }
    
}
