/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.addressbook.dto;

/**
 *
 * @author ta
 */
public class Address {
    private String firstName;
    private String lastName;
    private String numberAndStreet;
    private String codePostal;
    private String state;
    private String country;

    public Address()  {
    }
    
    
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getNumberAndStreet(){
        return this.numberAndStreet;
    }
    public void setNumberAndStreet(String numberAndStreet){
        this.numberAndStreet=numberAndStreet;
    }
    
    public String getCodePostal(){
        return this.codePostal;
    }
    
    public void setCodePostal(String codePostal){
        this.codePostal=codePostal;
    }
    public String getState(){
        return this.state;
    }
    
    public void setState(String state){
        this.state=state;
    }
    
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country=country;
    }  
}
