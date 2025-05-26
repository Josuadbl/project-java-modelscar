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

    public String getUltimoMantenimiento () {
        return ultimoMantenimiento;

    }

    public String getProximoMantenimiento () {
        return proximoMantenimiento;
    }

    public String getTipoServicio () {
        return tipoServicio;
    }

    public void setUltimoMantenimiento (String ultimoMantenimiento) {
        this.ultimoMantenimiento = ultimoMantenimiento;
    }

    public void setProximoMantenimiento (String proximoMantenimiento) {
        this.proximoMantenimiento = proximoMantenimiento;
    }

    public void setTiposervicio (String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    
    public void displayInfo() {
        System.out.println("Mantenimiento Information:");
        System.out.println("ultimoMantenimiento: " + ultimoMantenimiento);
        System.out.println("proximoMantenimiento: " + proximoMantenimiento);
        System.out.println("tipoServicio: " + tipoServicio);
        
    }

}
