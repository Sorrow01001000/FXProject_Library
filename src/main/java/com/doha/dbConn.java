/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doha;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author wessa
 */
public class dbConn {
         public static Connection DBConnection() {
        
         Connection conn = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            conn = DriverManager.getConnection("jdbc:oracle:thin:Project_fx/123@localhost:1521/XE");

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
     
        return conn;
    
}
}
