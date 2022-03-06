/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.dvdcollection.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mthree.com.dvdcollection.dao.DVDCollectionDao;
import mthree.com.dvdcollection.dao.DVDCollectionDaoException;
import mthree.com.dvdcollection.dto.DVDClass;
import mthree.com.dvdcollection.view.DVDCollectionView;

/**
 *
 * @author ta
 */
public class DVDCollectionController {
    
    DVDCollectionView view;
    DVDCollectionDao dao;

    public DVDCollectionController(DVDCollectionView view, DVDCollectionDao dao) {
        this.view=view;
        this.dao=dao;
    }
    public void run(){
        boolean keepgoing=true;
        int menuSelection=0;
        
        try{
            loadDVDLibrary();
            while (keepgoing) {
                menuSelection=view.printMenuAndGetSelection();
                switch (menuSelection) {
                    case 1:
                        addDVD();
                        break;
                    case 2:
                        deleteDVD();
                        break;
                    case 3:
                        editDVD();
                        break;
                    case 4:
                        listAllDVD();
                        break;
                    case 5:
                        displayDVDInfo();
                        break;
                    case 6:
                        findDVD();
                        break;
                    case 7:
                        loadDVDLibrary();
                        break;
                    case 8:
                        saveDVDLibrary();
                        break;
                    case 9:
                        updateManyDVDInOneSHot();
                        break;
                    case 10:
                        keepgoing=false;
                        break;
                    
                    default:
                        unknownCommand();
                }
                view.displayHitEnterBanner();    
                
            }
            exitProgram();
            
        }catch(DVDCollectionDaoException e) {
        view.displayErrorMessage(e.getMessage());
        }
    }
    
    public void addDVD()throws DVDCollectionDaoException{
        view.displayAddDVDBanner();
        DVDClass dvdClass=view.addDVD();
        dao.addDVD(dvdClass.getTitle(), dvdClass);
        view.displayAddDVDSuccessBanner();
    }
    
    public void deleteDVD()throws DVDCollectionDaoException{
        view.displayDeleteDVDBanner();
        String title=view.getDVDChoice();
        DVDClass dvdClass=dao.deleteDVD(title);
        view.displayDeleteDVDSuccessBanner(dvdClass);
    }
    
    public void editDVD()throws DVDCollectionDaoException{
        view.displayEditDVDBanner();
        
        //Editing the new information
        DVDClass newDVDClass = view.editDVD();
        //upditing the information in the storafe file
        dao.editDVD(newDVDClass);
        // displaying the new information
        view.displayDVDAfterEditingBanner();
        view.displayDVDInformation(newDVDClass);
    }
    
    
    public void listAllDVD()throws DVDCollectionDaoException{
        view.displayAllDVDBanner();
        List<DVDClass> listDVDClasses=dao.listAllDVD();
        view.DisplayListAllDVD(listDVDClasses);
    }
    public void displayDVDInfo()throws DVDCollectionDaoException{
        String title = view.getDVDChoice();
        DVDClass dvdClass=dao.getDVDClass(title);
        view.displayDVDInformation(dvdClass);
    }
    public void findDVD()throws DVDCollectionDaoException{
        String title= view.getDVDChoice();
        DVDClass dvdClass=dao.findDVD(title);
        view.displayDVDInformation(dvdClass);
    }
    public void loadDVDLibrary()throws DVDCollectionDaoException{
        view.displayLoadLibraryBanner();
        Map<String, DVDClass> hashmapDVDCollection= dao.loadDVDLibrary();
        view.displayLoadSuccessBanner(hashmapDVDCollection);
        
    }
    public void saveDVDLibrary()throws DVDCollectionDaoException{
        view.displaySaveLibraryBanner();
        Map<String, DVDClass> hashmapDVDCollection= dao.saveDVDLibrary();
        view.displaySaveSuccessBanner(hashmapDVDCollection);
    }
    public void updateManyDVDInOneSHot()throws DVDCollectionDaoException{
        view.displayUpdatingManyDVDBanner();
        int choice=view.getOpType();
        switch (choice) {
                case 1:
                    dao.addManyDVD(view.addManyDVD());
                    break;           
                case 2:
                    dao.deleteManyDVD(view.deleteManyDVD());
                    break;
                case 3:
                    dao.editManyDVD(view.editManyDVD());
                    break;
            }    
        view.updateManyDVDInOneSHotSuccessBanner();   
    }
    
    public void exitProgram()throws DVDCollectionDaoException{
        saveDVDLibrary();
        view.displayExitMessage();
    }
    public void unknownCommand()throws DVDCollectionDaoException{
        view.displayUnknownCommand();
    }
    
}
