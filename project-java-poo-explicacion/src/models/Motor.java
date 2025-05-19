package models;

public class Motor {
    private String motor;
    private String combustible;
    private String potencia;
    

    public Motor() {}
    public Motor(String motor, String combustible, String potencia) {
        this.motor = motor;
        this.combustible = combustible;
        this.potencia = potencia;
    }
    
    public void displayInfo() {
        System.out.println("Motor Information:");
        System.out.println("Motor: " + motor);
        System.out.println("Combustible: " + combustible);
        System.out.println("Potencia: " + potencia);
    }



}
