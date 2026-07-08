/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
public class Connectionprovider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bms", // ✅ your DB name
                "Nirbhay",     // ✅ your MySQL username
                "223102"    // ✅ your MySQL password
            );
            return con;
        } catch (Exception e) {
            System.out.println("Connection Error: " + e);
            return null;
        }
    }
}