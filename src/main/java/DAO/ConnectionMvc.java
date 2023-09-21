/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NIT0298147
 */
public class ConnectionMvc {
public Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try { 
            conn = DriverManager.getConnection("jbdc:mysql://localhost:3306/academia?useSSL=false", "root","");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}