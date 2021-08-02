package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexion {

    private static Connection cnx = null;
    private int idcategoria;
    private  String nomCategoria;
    private  String clasificacion;
    private  String subCategoria;

    public static Connection obtener() throws SQLException,  ClassNotFoundException {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cashflow", "root", "root");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }

    public ObservableList<Categoria> obtenerCategoria() throws SQLException, ClassNotFoundException {

        ObservableList<Categoria> list = FXCollections.observableArrayList();
        String consulta="SELECT * FROM categoria";
        obtener();

        try {
            Statement sentencia= (Statement) obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                idcategoria = resultado.getInt("idcategoria");
                clasificacion = resultado.getString("clasificacion");
                nomCategoria = resultado.getString("nomCategoria");
                subCategoria = resultado.getString("subCategoria");
                Categoria categoria = new Categoria(idcategoria,nomCategoria,clasificacion,subCategoria);
                list.add(categoria);
                System.out.println (resultado.getString("clasificacion"));
            }

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }
        return  list;
    }



}
