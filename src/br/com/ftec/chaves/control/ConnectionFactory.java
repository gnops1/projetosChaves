/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author massirer
 */
public class ConnectionFactory {
    
    private static String USERNAME = "root";
    private static String PASSWORD = "";
    private static String DATABASE_URL = "jbc:mysql://localhost:3306/ProjetoChaves";

public static Connection createConnectioToMySQL() 
        throws ClassNotFoundException, SQLException{

    Class.forName("com.mysql.jdbc.Driver");
    Connection connection = DriverManager.getConnection(DATABASE_URL, PASSWORD, USERNAME);
    return connection;
    
    }
}