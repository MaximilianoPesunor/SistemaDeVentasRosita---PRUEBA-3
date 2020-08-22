/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GoldenLion
 */
public class ProcedimientoSQL {
    
    Connection conexion = null;
    String Url = "jdbc:sqlserver://192.168.50.190;databaseName=Msoto_SBD;user=Msoto_SQL;password=Blaxor4201979;";
    
     public static Connection getConexion(){
        Connection cin =null;
        try { 
                  
                   
                    String connectionUrl = "jdbc:sqlserver://192.168.50.190;databaseName=Msoto_SBD;user=Msoto_SQL;password=Blaxor4201979;";
                    cin= DriverManager.getConnection(connectionUrl);
                    
                    
               
                    
                    
                    }catch (Exception ex){
                        System.out.println("Error."+ ex.getMessage());
                    } 
        return cin;
    }
    
    
    
    
    
    public void conectar(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(Url);
            
        
    }catch(Exception ex){
     System.out.println("Error."+ ex.getMessage()); 
     JOptionPane.showMessageDialog(null,"error al conectar " + ex.getMessage(),ex.getMessage(),JOptionPane.ERROR_MESSAGE);
     
    }}
    
    public int InicioSesion(String nombre,String contraseña){
        int resultado = 0;
        try{
            
            Statement ejecutor = conexion.createStatement();
            ResultSet rs = ejecutor.executeQuery("Select * from Usuario Where Nombre_usuario = '"+nombre+"' and Contraseña = '"+contraseña+"'");
            
            
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "BIENVENIDO A EMPRESAS ROSITA ");
                resultado = 1;
            } else {
                JOptionPane.showMessageDialog(null, "RUT O CONTRASEÑA INCORRECTA");
                resultado = 0;
                
            }
            
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"RUT O CONTRASEÑA INCORRECTA " );
        }
        
        
       return resultado; 
    }
    
   

    
    
}
