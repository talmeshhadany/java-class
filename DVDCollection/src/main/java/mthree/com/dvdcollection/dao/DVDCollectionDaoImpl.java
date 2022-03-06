/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.dvdcollection.dao;

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
import mthree.com.dvdcollection.dto.DVDClass;

/**
 *
 * @author ta
 */
public class DVDCollectionDaoImpl implements DVDCollectionDao {
    Map<String, DVDClass> dvdCollectionMap=new HashMap<>();
    public static final String DVDCOLLECTION_FILE="dvdCollection.txt";
    public static final String DELIMETER="##";
    
    private DVDClass unmarshal(String currentLine){
        // DVDInfoAsText is expecting a line read in from our file.
        // For example, it might look like this:
        // Ada::Lovelace:: 10 Newyork street:: 56438:: NewYork::US
        //
        // We then split that line on our DELIMITER - which we are using as ::
        // Leaving us with an array of Strings, stored in addressTokens.
        // Which should look like this:
        // __________________________________________
        // |     |     |     |Directore|      | User|
        // |Title|Date | MPAA|Name     |Studio| RAte|
        // |_____|_____|_____|_________|______|_____|
        // 
        //  [0]    [1]    [2]     [3]     (4)    (5)
    
        String[] dvdInfoToken=currentLine.split(DELIMETER);
        DVDClass currentDVDClass= new DVDClass();
        
        currentDVDClass.setTitle(dvdInfoToken[0]);
        currentDVDClass.setReleaseDate(dvdInfoToken[1]);
        currentDVDClass.setMpaaRating(dvdInfoToken[2]);
        currentDVDClass.setDirectorName(dvdInfoToken[3]);
        currentDVDClass.setStudio(dvdInfoToken[4]);
        currentDVDClass.setUserRating(dvdInfoToken[5]);
        
        return currentDVDClass;
    }
    private void loadCollection()throws DVDCollectionDaoException{
        Scanner scanner;
        try {
            scanner=new Scanner(new BufferedReader(new FileReader(DVDCOLLECTION_FILE))); 
            
        } catch (FileNotFoundException e) {
            throw new DVDCollectionDaoException("Could not load DVD Collection file", e);
        }
        String currentLine;
        while (scanner.hasNext()) {
                currentLine =scanner.nextLine();
                DVDClass dvdClass=unmarshal(currentLine);
                dvdCollectionMap.put(dvdClass.getTitle(), dvdClass);
        }
        scanner.close();
    }
    
    private String marchall(DVDClass dvdClass){
            return  dvdClass.getTitle()+DELIMETER+
                    dvdClass.getReleaseDate()+DELIMETER+
                    dvdClass.getMpaaRating()+DELIMETER+
                    dvdClass.getDirectorName()+DELIMETER+
                    dvdClass.getStudio()+DELIMETER+
                    dvdClass.getUserRating();
    
    }
    private void writeDVDCollection()throws DVDCollectionDaoException{
        PrintWriter out;
        try {
             out=new PrintWriter(new FileWriter(DVDCOLLECTION_FILE));
        } catch (IOException e) {
            throw new DVDCollectionDaoException("file could not find", e);
        }
        
        
        List<DVDClass> listDVDClass=this.getListOfDVDs();
        String dvdInfoAsTExt;
        for (DVDClass dvdClass : listDVDClass) {
            dvdInfoAsTExt=marchall(dvdClass);
            out.println(dvdInfoAsTExt);
            out.flush();
        }
        out.close();
    
    }
    
    public List<DVDClass> getListOfDVDs()throws DVDCollectionDaoException{
        return new ArrayList<DVDClass>(dvdCollectionMap.values());
    }
    @Override
    public DVDClass getDVDClass(String title) throws DVDCollectionDaoException {
    //    loadCollection();
        return  dvdCollectionMap.get(title);
    }
    
    @Override
    public void addDVD(String title, DVDClass dvdClass) throws DVDCollectionDaoException {
    //    loadCollection();
        DVDClass currentDVDClass=dvdCollectionMap.put(title, dvdClass);
    //    writeDVDCollection();
    }
    @Override
    public void addManyDVD(Map<String, DVDClass>  hashMapAddedDVD) throws DVDCollectionDaoException {
    //    loadCollection();
        for (Map.Entry<String, DVDClass> entry : hashMapAddedDVD.entrySet()) {
            addDVD(entry.getKey(), entry.getValue());
        }
        
    //    writeDVDCollection();
    }
    

    @Override
    public DVDClass deleteDVD(String title) throws DVDCollectionDaoException {
    //    loadCollection();
        DVDClass dvdClass=dvdCollectionMap.remove(title);
    //    writeDVDCollection();
        return dvdClass;
    }
    @Override
    public void deleteManyDVD(List<String> titlesToBeDelted) throws DVDCollectionDaoException {
    //    loadCollection();
        for (String title : titlesToBeDelted) {
            DVDClass dvdClass=dvdCollectionMap.remove(title);
            
        }
    }
    
    @Override
    public void editDVD(DVDClass newDVDClass) throws DVDCollectionDaoException {
    //    loadCollection();
    //    DVDClass dvdClass=getDVDClass(title);
        dvdCollectionMap.put(newDVDClass.getTitle(), newDVDClass);
    //    writeDVDCollection();
    }    
     @Override
    public void editManyDVD(List<DVDClass> dvdClassesToBeEdited) throws DVDCollectionDaoException {
    //    loadCollection();
         for (DVDClass dVDClass : dvdClassesToBeEdited) {
             editDVD(dVDClass);
         }
    }
    
    @Override
    public List<DVDClass> listAllDVD() throws DVDCollectionDaoException {
    //    loadCollection();
        return getListOfDVDs();
    }

    @Override
    public DVDClass findDVD(String title) throws DVDCollectionDaoException {
        return getDVDClass(title);   
    }

    @Override
    public Map<String, DVDClass> loadDVDLibrary() throws DVDCollectionDaoException {
        loadCollection();
        return dvdCollectionMap;
        
    }

    @Override
    public Map<String, DVDClass> saveDVDLibrary() throws DVDCollectionDaoException {
        writeDVDCollection();
        return dvdCollectionMap;
    }
    
}
