package models;

public class Mantenimiento {
    private String ultimoMantenimiento;
    private String proximoMantenimiento;
    private String tipoServicio;
    

    public Mantenimiento() {}

    public Mantenimiento(String ultimoMantenimiento, String proximoMantenimiento, String tipoServicio) {
        this.ultimoMantenimiento = ultimoMantenimiento;
        this.proximoMantenimiento = proximoMantenimiento;
        this.tipoServicio = tipoServicio;
        
    }

    
    public void displayInfo() {
        System.out.println("Mantenimiento Information:");
        System.out.println("ultimoMantenimiento: " + ultimoMantenimiento);
        System.out.println("proximoMantenimiento: " + proximoMantenimiento);
        System.out.println("tipoServicio: " + tipoServicio);
        
    }

}
