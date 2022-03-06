/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.dvdcollection;

import mthree.com.dvdcollection.controller.DVDCollectionController;
import mthree.com.dvdcollection.dao.DVDCollectionDao;
import mthree.com.dvdcollection.dao.DVDCollectionDaoImpl;
import mthree.com.dvdcollection.view.UserIOConsoleImpl;
import mthree.com.dvdcollection.view.DVDCollectionView;
import mthree.com.dvdcollection.view.UserIO;

/**
 *
 * @author ta
 */
public class App {
    public static void main(String[] args) {
        UserIO io = new UserIOConsoleImpl();
        DVDCollectionView view=new DVDCollectionView();
        DVDCollectionDao dao= new DVDCollectionDaoImpl();
        DVDCollectionController controller= new DVDCollectionController(view, dao);
        controller.run();
    }
    
}
