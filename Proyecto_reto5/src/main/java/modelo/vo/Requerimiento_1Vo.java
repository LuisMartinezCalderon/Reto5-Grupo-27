package modelo.vo;

public class Requerimiento_1Vo {
    private int ID_Lider;
    private String Salario;
    private String Ciudad_Residencia;
    public int getID_Lider() {
        return ID_Lider;
    }
    public void setID_Lider(int iD_Lider) {
        ID_Lider = iD_Lider;
    }
    public String getSalario() {
        return Salario;
    }
    public void setSalario(String salario) {
        Salario = salario;
    }
    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }
    public void setCiudad_Residencia(String ciudad_Residencia) {
        Ciudad_Residencia = ciudad_Residencia;
    }

    public String toString() {
        return ID_Lider + " " + Salario + " " + Ciudad_Residencia + "";
    }
}
 

    
    


