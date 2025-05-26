package models;

public class Sensor {
    private String velocidad;
    private String temperatura;
    private String presion;

    public Sensor() {}

    public Sensor(String velocidad, String temperatura, String presion) {
        this.velocidad = velocidad;
        this.temperatura = temperatura;
        this.presion = presion;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public String getTemperatura () {
        return temperatura;
    }

    public String getPresion () {
        return presion;
    }

    public void setVelocidad (String velocidad) {
        this.velocidad = velocidad;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public void setPresion (String presion){
        this.presion = presion;
    }

    
    public void displayInfo() {
        System.out.println("Sensor Information:");
        System.out.println("velocidad: " + velocidad);
        System.out.println("temperatura: " + temperatura);
        System.out.println("presion: " + presion);
    }

}
