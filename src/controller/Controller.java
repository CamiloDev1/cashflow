package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import modelo.Categoria;
import modelo.conexion;


import java.sql.SQLException;

public class Controller {

    @FXML
    private AnchorPane idLogin;



    @FXML
    private PasswordField idpassword;


    @FXML
    private AnchorPane idlistaCategoria;

    @FXML
    private ComboBox<?> comboclasificacion;



    @FXML
    private TableView<Categoria> tablalistacategoria;

    @FXML
    private TableColumn<Categoria, Integer> idID;

    @FXML
    private TableColumn<Categoria, String> idClasificacion;

    @FXML
    private TableColumn<Categoria, String> idCategoria;

    @FXML
    private TableColumn<Categoria, String> idSubcategoria;

    @FXML
    private AnchorPane idflujoEfectivo;

    @FXML
    private AnchorPane idMenu;
    public conexion conexionBd;

    @FXML
    public void mySql() throws SQLException, ClassNotFoundException {
        idMenu.setVisible(true);
        conexion conexion1 = new conexion();
        conexion1.obtenerCategoria();
    }

    @FXML
    public void OnMouseClikedCategoria() throws SQLException, ClassNotFoundException {
        conexion conexion2 = new conexion();
        tablalistacategoria.setItems(conexion2.obtenerCategoria());
        idID.setCellValueFactory(new PropertyValueFactory("idcategoria"));
        idCategoria.setCellValueFactory(new PropertyValueFactory("nomCategoria"));
        idClasificacion.setCellValueFactory(new PropertyValueFactory("clasificacion"));
        idSubcategoria.setCellValueFactory(new PropertyValueFactory("subCategoria"));
        idlistaCategoria.setVisible(true);
        idMenu.setVisible(false);
    }

}
