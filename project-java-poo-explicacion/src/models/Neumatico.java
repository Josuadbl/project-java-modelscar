package models;

public class Neumatico {
    private String marca;
    private String modelo;
    private String medida;

    public Neumatico() {}

    public Neumatico(String marca, String modelo, String medida) {
        this.marca = marca;
        this.modelo = modelo;
        this.medida = medida;
    }

    
    public void displayInfo() {
        System.out.println("Neumatico Information:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Medida: " + medida);
    }

}
