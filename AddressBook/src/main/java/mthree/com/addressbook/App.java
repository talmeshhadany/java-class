/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mthree.com.addressbook;

import mthree.com.addressbook.controller.AddressbookController;
import mthree.com.addressbook.dao.AddressBookDao;
import mthree.com.addressbook.dao.AddressBookDaoImpl;
import mthree.com.addressbook.ui.AddressBookView;
import mthree.com.addressbook.ui.UserIO;
import mthree.com.addressbook.ui.UserIOConsoleImpl;

/**
 *
 * @author ta
 */
public class App {
    public static void main(String[] args) {
        UserIO io=new UserIOConsoleImpl();
        AddressBookDao dao= new AddressBookDaoImpl();
        AddressBookView view=new AddressBookView();
        AddressbookController controller= new AddressbookController(view, dao);
        controller.run();
    }
}
