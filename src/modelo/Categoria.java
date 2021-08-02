package modelo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Categoria {

    private int idcategoria;
    private StringProperty nomCategoria = new SimpleStringProperty();
    private StringProperty clasificacion = new SimpleStringProperty();
    private StringProperty subCategoria = new SimpleStringProperty();

    public Categoria(int idcategoria, String nomCategoria, String clasificacion, String subCategoria){
        this.idcategoria = idcategoria;
        this.nomCategoria.set(nomCategoria) ;
        this.clasificacion.set(clasificacion);
        this.subCategoria.set(subCategoria);
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNomCategoria() {
        return nomCategoria.get();
    }

    public StringProperty nomCategoriaProperty() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria.set(nomCategoria);
    }

    public String getClasificacion() {
        return clasificacion.get();
    }

    public StringProperty clasificacionProperty() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion.set(clasificacion);
    }

    public String getSubCategoria() {
        return subCategoria.get();
    }

    public StringProperty subCategoriaProperty() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria.set(subCategoria);
    }
}
