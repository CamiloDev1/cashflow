package modelo;

public class Categoria {

    private int idcategoria;
    private String nomCategoria;
    private String clasificacion;
    private String subCategoria;

    public Categoria(int idcategoria, String nomCategoria, String clasificacion, String subCategoria){
        this.idcategoria = idcategoria;
        this.nomCategoria = nomCategoria;
        this.clasificacion = clasificacion;
        this.subCategoria = subCategoria;
    }

    public int getIdcategoria() { return idcategoria;}

    public void setIdcategoria(int idcategoria) {this.idcategoria = idcategoria;}

    public String getCategoria() {
        return nomCategoria;
    }

    public void setCategoria(String categoria) {
        this.nomCategoria = categoria;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }



}
