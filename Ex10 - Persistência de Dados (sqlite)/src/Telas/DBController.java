/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telas;

import java.io.File;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public class DBController {
    private String dbName;
    Connection dbConn;
    private JTable tblDados;

    public DBController(String dbName, JTable tblDados) {
        this.dbName = dbName;
        this.tblDados = tblDados;
    }

    public void conectar() throws Exception {
        File f = new File(this.dbName);

        if (!f.exists()) {
            throw new Exception("Arquivo de banco de dados não existe!");
        }
        Class.forName("org.sqlite.JDBC");
        this.dbConn = DriverManager.getConnection("jdbc:sqlite:" + this.dbName);
    }

    public void desconectar() throws SQLException {
        this.dbConn.close();
    }

    public void salvarPalavra(String palavra, String sinonimo) throws Exception {
        String ins = "INSERT INTO dicionario (palavra, sinonimo) VALUES (?, ?)";

        PreparedStatement stmt;

        try {
            stmt = this.dbConn.prepareStatement(ins);
            stmt.setString(1, palavra);
            stmt.setString(2, sinonimo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Erro ao inserir palavra: " + e.getMessage());
        }
    }

    public ResultSet carregarPalavras() throws Exception {
        String sel = "SELECT palavra, sinonimo FROM dicionario";
        ResultSet rset = null;

        try {
            Statement stmt = this.dbConn.createStatement();
            rset = stmt.executeQuery(sel);
        } catch (SQLException e) {
            throw new Exception("Erro ao buscar palavra: " + e.getMessage());
        }
        return rset;
    }

    public void carregaDados(JTable tblDados) {
        DBController db = new DBController("dic.db", tblDados);

        try {
            db.conectar();
            ResultSet rset = db.carregarPalavras();
            DefaultTableModel model = new DefaultTableModel(new String[] { "Palavra", "Sinonimo" }, 0);

            while (rset.next()) {
                model.addRow(new Object[] { rset.getString("palavra"), rset.getString("sinonimo") });

            }
            tblDados.setModel(model);
            db.desconectar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
