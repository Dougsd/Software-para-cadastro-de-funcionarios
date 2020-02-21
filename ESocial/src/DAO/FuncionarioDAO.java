
package DAO;

import Connection.ConnectionFactory;
import Listas.Lista_Fun;
import esocial.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;



public class FuncionarioDAO {
    public FuncionarioDAO(){}

    public void db_save(Funcionario fun) throws SQLException{
        Connection con = new ConnectionFactory().getConnection();
        
        String sql = "insert into funcionários" +
                    " (idFuncionários,Nome,CPF,Sexo,Cor,Escolaridade,Nascimento,Salário,NumNIS,NumCT,Admissão,Telefone,Email)" +
                    " values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
        PreparedStatement stmt = con.prepareStatement(sql);
        String s= Float.toString(fun.getSalario());
        String id= Integer.toString(fun.getID());
            stmt.setString(1, id);
            stmt.setString(2,fun.getNome());
            stmt.setString(3,fun.getCpf());
            stmt.setString(4,fun.getSexo());
            stmt.setString(5,fun.getCor());
            stmt.setString(6,fun.getEscolaridade());
            stmt.setString(7,fun.getDataNascimento());
            stmt.setString(8,s);
            stmt.setString(9,fun.getNumNis());
            stmt.setString(10,fun.getNumCT());
            stmt.setString(11,fun.getDataAdmissão());
            stmt.setString(12,fun.getTelefone());
            stmt.setString(13,fun.getEmail());
            stmt.execute();
            stmt.close();
            con.close(); 
        
}

    public void bd_update(Funcionario fun) throws SQLException{
        
        Connection con = new ConnectionFactory().getConnection();
        
        String sql2 = "UPDATE `dbfuncionarios`.`funcionários` SET `idFuncionários` = ?, `"
                + "Nome` = ?, `"
                + "CPF` = ?, `"
                + "Sexo` = ?, "
                + "`Cor` = ?, "
                + "`Escolaridade` = ?, `"
                + "Nascimento` = ?, `"
                + "Salário` = ?, `"
                + "NumNIS` = ?, `"
                + "NumCT` = ?, `"
                + "Admissão` = ?, `"
                + "Telefone` = ?, `"
                + "Email` = ? "
                + "WHERE (`idFuncionários` = ?);";
     @SuppressWarnings("UnusedAssignment")
                PreparedStatement stmt2 = null;
                stmt2 = con.prepareStatement(sql2);
                stmt2.setString(1,Integer.toString(fun.getID()));
                stmt2.setString(2,fun.getNome());
                stmt2.setString(3,fun.getCpf());
                stmt2.setString(4,fun.getSexo());
                stmt2.setString(5,fun.getCor());
                stmt2.setString(6,fun.getEscolaridade());
                stmt2.setString(7,fun.getDataNascimento());
                stmt2.setString(8,Float.toString(fun.getSalario()));
                stmt2.setString(9,fun.getNumNis());
                stmt2.setString(10,fun.getNumCT());
                stmt2.setString(11,fun.getDataAdmissão());
                stmt2.setString(12,fun.getTelefone());
                stmt2.setString(13,fun.getEmail());
                stmt2.setString(14,Integer.toString(fun.getID()));
                stmt2.execute();
                stmt2.close();
                con.close();


    }

    public void bd_deleta(Funcionario fun) throws SQLException{
        Connection con = new ConnectionFactory().getConnection();
        
        
        String sql2 = "DELETE FROM `dbfuncionarios`.`funcionários` WHERE (`idFuncionários` = ?);";
        PreparedStatement stmt = con.prepareStatement(sql2);
        
        stmt.setString(1,Integer.toString(fun.getID()));
        stmt.execute();
        stmt.close();
        con.close();
    }
 
    public Lista_Fun bd_lista() throws SQLException{
        Connection con = new ConnectionFactory().getConnection();
        String sql = "SELECT * FROM funcionários";
        
     @SuppressWarnings("UnusedAssignment")
        PreparedStatement stmt = null;
        ResultSet rs = null;
        stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        Lista_Fun lista =new Lista_Fun();
        while(rs.next()){
                    Funcionario fun = new Funcionario(
                    Integer.parseInt(rs.getString("idFuncionários")),
                    Float.parseFloat(rs.getString("Salário")),
                    rs.getString("Nome"),
                    rs.getString("CPF"),
                    rs.getString("Email"),
                    rs.getString("Telefone"),
                    rs.getString("Admissão"),
                    rs.getString("Nascimento"),
                    rs.getString("Cor"),
                    rs.getString("Escolaridade"),
                    rs.getString("Sexo"),
                    rs.getString("NumNIS"),
                    rs.getString("NumCT")
              
            );
            lista.add(fun);
            
        }


        return lista;
    }
}
