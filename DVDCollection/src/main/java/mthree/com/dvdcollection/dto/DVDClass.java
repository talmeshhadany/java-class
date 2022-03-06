/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.dvdcollection.dto;

/**
 *
 * @author ta
 */
public class DVDClass {
    private String title;
    private String releaseDate;
    private String mpaaRating;
    private String directorName;
    private String studio;
    private String userRating;
    
    public String getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public String getReleaseDate(){
        return this.releaseDate;
    }
    
    public void setReleaseDate(String releaseDate){
        this.releaseDate=releaseDate;
    }
    public String getMpaaRating(){
        return this.mpaaRating;
    }
    
    public void setMpaaRating(String mpaaRating){
        this.mpaaRating=mpaaRating;
    }
    
    public String getDirectorName(){
        return this.directorName;
    }
    
    public void setDirectorName(String directorName){
        this.directorName=directorName;
    }
    
    public String getStudio(){
        return this.studio;
    }
    
    public void setStudio(String studio){
        this.studio=studio;
    }
    
    public String getUserRating(){
        return this.userRating;
    }
    
    public void setUserRating(String userRating){
        this.userRating=userRating;
    }
    
    
}
