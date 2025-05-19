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
   
    

    
    public void displayInfo() {
        System.out.println("Sistema de Frenos Information:");
        System.out.println("discos: " + discos);
        System.out.println("abs: " + abs);
        System.out.println("estado: " + estado);
    }



}
