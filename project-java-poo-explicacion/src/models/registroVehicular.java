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

    
    public void displayInfo() {
        System.out.println("Registro Vehicular Information:");
        System.out.println("matricula: " + matricula);
        System.out.println("propietario: " + propietario);
        System.out.println("fecha: " + fecha);
        
    }

}
