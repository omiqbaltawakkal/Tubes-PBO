/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Controller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class driver {

    public static void main(String[] args) {

        try {
            Controller c = new Controller();
        } catch (SQLException ex) {
            Logger.getLogger(driver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
