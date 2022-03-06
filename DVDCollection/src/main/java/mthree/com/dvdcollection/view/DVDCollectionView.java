/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.dvdcollection.view;

import java.io.IOError;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mthree.com.dvdcollection.dto.DVDClass;

/**
 *
 * @author ta
 */
public class DVDCollectionView {
    UserIO io= new UserIOConsoleImpl();
    
    public int printMenuAndGetSelection(){
        io.print("Main Menu");
        io.print("1. Add DVD");
        io.print("2.Delete DVD");
        io.print("3. Update DVD information");
        io.print("4 List All DVDs in the collection");
        io.print("5. Display information of a DVD");
        io.print("6. search DVD by its title");
        io.print("7. load DVD library from a file");
        io.print("8. Save DVD library in a file");
        io.print("9. Add, edit or delete many DVDs ine one shot");
        io.print("10.Exit");
        
        return io.readInt("Please select one of the above choices", 1, 10);
    }
    public String getDVDChoice(){
        return io.readString("Enter the title of DVD: ");
    }
    
    public void displayAddDVDBanner(){
        io.print("== Add DVD to the Collection ===");
    }
    public DVDClass addDVD(){
       DVDClass dvdClass= new DVDClass();
       dvdClass = editDVD();
    return dvdClass;
    }
    public Map<String, DVDClass> addManyDVD(){
        io.print("Adding Many DVD to the collection");
        Map<String, DVDClass> hashmapAddedDVD=new HashMap<>();
        boolean keepGoing=true;
        while (keepGoing) {
            DVDClass dvdClass=addDVD();
            hashmapAddedDVD.put(dvdClass.getTitle(), dvdClass);
            String AnotherDVD=io.readString("Do you want to add another DVD: yes or no? ");
            if(AnotherDVD.equalsIgnoreCase("no")) {
                keepGoing=false;                
            }
        }
        return hashmapAddedDVD;
    }
    public void displayAddDVDSuccessBanner(){
        io.print("=== DVD has been sucessfully added ===");
        io.print(" ");
    }
    
    public void displayDeleteDVDBanner(){
        io.print("== Delete DVD from the Collection ===");
    }
    public List<String> deleteManyDVD(){
        io.print("Deleting Many DVD to the collection");
        List<String> titles=new ArrayList<>();
        
        boolean keepGoing=true;
        while (keepGoing) {
            String title=io.readString("Enter the title of DVD to be deleted: ");
            titles.add(title);
            String AnotherDVD=io.readString("Do you want to delete another DVD: yes or no? ");
            if(AnotherDVD.equalsIgnoreCase("no")) {
                keepGoing=false;                
            }
        }
        return titles;
    
    }
    public void displayDeleteDVDSuccessBanner(DVDClass dvdClass){
        displayDVDInformation(dvdClass);
        io.readString("Enter the title of DVD to be deleted: ");
    }
    
    public void displayHitEnterBanner(){
        io.readString("Press Enter to return to the menu");
    }
   
    public void displayEditDVDBanner(){
        io.print("=== Edit DVD Information");
    }
    public DVDClass editDVD(){
        DVDClass dvdClass=new DVDClass();
        dvdClass.setTitle(io.readString("Enter the title of DVD: "));
        dvdClass.setReleaseDate(io.readString("Enter the release date: "));
        dvdClass.setMpaaRating(io.readString("Enter the MPAA Rating: "));
        dvdClass.setDirectorName(io.readString("Enter the Director's Name: "));
        dvdClass.setStudio(io.readString("Enter Studio Name: "));
        dvdClass.setUserRating(io.readString("ENter the user rating: ")); 
        return dvdClass;
    }
    public List<DVDClass> editManyDVD(){
        io.print("Editing Many DVD to the collection");
        List<DVDClass> listDVDClass=new ArrayList<>();
        
        boolean keepGoing=true;
        while (keepGoing) {
            listDVDClass.add(editDVD());
            String AnotherDVD=io.readString("Do you want to edit another DVD: yes or no? ");
            if(AnotherDVD.equalsIgnoreCase("no")) {
                keepGoing=false;                
            }
        }
        return listDVDClass;
    }
    public void displayDVDAfterEditingBanner(){
        io.print("=== The updated DVD Information");
    }
    
    public void displayAllDVDBanner(){
        io.print("=== List of ALL DVD ===");
    }
    public void DisplayListAllDVD(List<DVDClass> listDVDClasses){
        for (DVDClass dvdClasse : listDVDClasses) {
            displayDVDInformation(dvdClasse);
        }
    }
    
    public void displayDVDInformation(DVDClass dvdClass){
        if (dvdClass != null) {
            io.print("=== DVD Information ===");
            io.print(" ");
            io.print(dvdClass.getTitle());
            io.print(dvdClass.getReleaseDate());
            io.print(dvdClass.getMpaaRating());
            io.print(dvdClass.getDirectorName());
            io.print(dvdClass.getStudio());
            io.print(dvdClass.getUserRating());
            io.print(" ");
        }
        else{
            io.print("there is not such DVD");
        }        
    }
   
    public void displayLoadLibraryBanner(){
        io.print("=== Load DVD Library ===");
    }
    public void displayLoadSuccessBanner(Map<String, DVDClass> hashMapDVDCollection){
        if(!hashMapDVDCollection.isEmpty())
            io.print("=== DVD Library is successfully loaded ===");
        else
            io.print("=== the Library is empty or it is not successfully loaded ===");
    
    }
    
    public void displaySaveLibraryBanner(){
        io.print("=== Save DVD Library ===");
    }
    public void displaySaveSuccessBanner(Map<String, DVDClass> hashMapDVDCollection){
        if(!hashMapDVDCollection.isEmpty())
            io.print("=== DVD Library is successfully saved ===");
        else
            io.print("=== the Library is empty or it is not successfully saved ===");
    
    }

    public int getOpType(){
        io.print(" Which operation you want to do for that DVD? ");
        io.print("1. Add DVD");
        io.print("2. Delete DVD");
        io.print("3. Edit DVD information");
        return io.readInt("Please select one of the above choices", 1, 3);
    }
    
    public void displayUpdatingManyDVDBanner(){
        io.print("=== Updating many DVD ===");
    }
    public void updateManyDVDInOneSHotSuccessBanner(){
        io.print("=== The updating of many DVD is successfully done ===");
    
    }
    
    public void displayErrorMessage(String errormsg){
        io.print("=== ERROR ===");
        io.print(errormsg);
    }
    public void displayExitMessage(){
        io.print("=== GoodBuy  ===");
    }
    public void displayUnknownCommand(){
        io.print("=== There is not such command ===");
 
    }
    
    
    
    
    
    
    
    
}
