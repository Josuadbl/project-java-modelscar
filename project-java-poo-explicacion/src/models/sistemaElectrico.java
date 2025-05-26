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

    public String getBateria() {
        return bateria;
    }
    public String getLuces() {
        return luces;
    }
    public String getSensores() {
        return sensores;
    }
    public void setBateria(String bateria) {
        this.bateria = bateria;
    }
    public void setLuces(String luces) {
        this.luces = luces;
    }
    public void setSensores(String sensores) {
        this.sensores = sensores;
    }

    
    public void displayInfo() {
        System.out.println("Sistema Electrico Information:");
        System.out.println("Bateria: " + bateria);
        System.out.println("luces: " + luces);
        System.out.println("sensores: " + sensores);
    }

}
