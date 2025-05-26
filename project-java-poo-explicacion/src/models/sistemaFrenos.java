package models;

public class sistemaFrenos {
   
    private String discos;
    private String abs;
    private String estado;

    public sistemaFrenos() {}
    public sistemaFrenos( String discos, String abs, String estado) {
        
        this.discos = discos;
        this.abs = abs;
        this.estado = estado;
    }

    public String getdiscos() {
        return discos;
    }
    public String getabs (){
        return abs;
    }
    public String getestado() {
        return estado;
    }

    public void setdiscos(String discos) {
        this.discos = discos;
    }
    public void setabs(String abs) {
        this.abs = abs;
    }
    public void setestado(String estado) {
        this.estado = estado;
    }
   
    

    
    public void displayInfo() {
        System.out.println("Sistema de Frenos Information:");
        System.out.println("discos: " + discos);
        System.out.println("abs: " + abs);
        System.out.println("estado: " + estado);
    }



}
