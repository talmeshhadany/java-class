/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mthree.com.dvdcollection.dao;

import java.util.List;
import java.util.Map;
import mthree.com.dvdcollection.dto.DVDClass;

/**
 *
 * @author ta
 */
public interface DVDCollectionDao {
    public void addDVD(String title, DVDClass dvdClass)throws DVDCollectionDaoException;
    public void addManyDVD(Map<String, DVDClass>  hashMapAddedDVD)throws DVDCollectionDaoException;
    public DVDClass deleteDVD(String title)throws DVDCollectionDaoException;
    public void deleteManyDVD(List<String> titlesToBeDelted) throws DVDCollectionDaoException;
    public DVDClass getDVDClass(String title) throws DVDCollectionDaoException;
    public void editDVD(DVDClass newDVDClass)throws DVDCollectionDaoException;
    public void editManyDVD(List<DVDClass> dvdClassesToBeEdited) throws DVDCollectionDaoException;
    public List<DVDClass> listAllDVD()throws DVDCollectionDaoException;
    public DVDClass findDVD(String title)throws DVDCollectionDaoException;
    public Map<String, DVDClass> loadDVDLibrary()throws DVDCollectionDaoException;
    public Map<String, DVDClass> saveDVDLibrary()throws DVDCollectionDaoException;
    
}
