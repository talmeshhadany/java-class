/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.classmodeling;

/**
 *
 * @author ta
 */
public class AirPlaneTrafficControl {
    private String company;
    private int ID;
    private String srcAirport;
    private String destAirport;
    public AirPlaneTrafficControl(){}
    public AirPlaneTrafficControl(String company, int id, String srcAirport, 
            String DestAirport){}
    public String getCompany(){
        return company;
    }
    public void setCompany(String companyObj){
        this.company=companyObj;
    }
    public int getID(){
        return ID;
    }
    public void setID(int idObj){
        this.ID=idObj;
    }
    public String getSrcAirport(){
        return srcAirport;
    }
    public void setSrcAirport(String srcAirportObj){
        this.srcAirport=srcAirportObj;
    }
    public String getDestAirport(){
        return company;
    }
    public void setDestAirport(String destAirportObj){
        this.destAirport=destAirportObj;
    }
    
}
