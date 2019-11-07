/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.microx.dal;

import java.sql.*;

/**
 *
 * @author Cesinha
 */
public class ModuloConexao {
    
    //metodo responsavel pela conexao com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // alinha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informaçoes referente ao banco
        String url ="jdbc:mysql://localhost:3306/dbmicrox";
        String user ="root";
        String password = "";
        // Estabelecendo a conexao co o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
                
    }
    
}







