package models;

public class registroVehicular {
    private String matricula;
    private String propietario;
    private String fecha;
    

    public registroVehicular() {}

    public registroVehicular(String matricula, String propietario, String fecha) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fecha = fecha;
        
    }
    
    public String getMatricula (){
        return matricula;
    }

    public String getPropietario (){
        return propietario;
    }
    
    public String getFecha (){
        return fecha;
    }

    public void  setMatricula (String matricula){
        this.matricula = matricula;
    }

    public void setPropietario (String propietario){
        this.propietario = propietario;
    }

    public void setFecha (String fecha) {
        this.fecha = fecha;
    }



    
    public void displayInfo() {
        System.out.println("Registro Vehicular Information:");
        System.out.println("matricula: " + matricula);
        System.out.println("propietario: " + propietario);
        System.out.println("fecha: " + fecha);
        
    }

}
