package modelo.vo;

public class Requerimiento_2Vo {
 private int ID_Proyecto;
 private String Nombre_Material;
 private String Importado;
public int getID_Proyecto() {
    return ID_Proyecto;
}
public void setID_Proyecto(int iD_Proyecto) {
    ID_Proyecto = iD_Proyecto;
}
public String getNombre_Material() {
    return Nombre_Material;
}
public void setNombre_Material(String nombre_Material) {
    Nombre_Material = nombre_Material;
}
public String getImportado() {
    return Importado;
}
public void setImportado(String importado) {
    Importado = importado;
}

public String toString() {
    return ID_Proyecto + " " + Nombre_Material + " " + Importado + "";
}


 


 
}
