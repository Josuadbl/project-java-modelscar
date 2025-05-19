package models;

public class sistemaElectrico {
    private String bateria;
    private String luces;
    private String sensores;

    public sistemaElectrico() {}
    public sistemaElectrico(String bateria, String luces, String sensores) {
        this.bateria = bateria;
        this.luces = luces;
        this.sensores = sensores;
    }

    
    public void displayInfo() {
        System.out.println("Sistema Electrico Information:");
        System.out.println("Bateria: " + bateria);
        System.out.println("luces: " + luces);
        System.out.println("sensores: " + sensores);
    }

}
