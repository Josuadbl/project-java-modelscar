package models;

public class Transmision {
    private String manual ;
    private String automatico;
    private String secuencial;

    public Transmision() {}
    public Transmision(String manual, String automatico, String secuencial) {
        this.manual = manual;
        this.automatico = automatico;
        this.secuencial = secuencial;
    } 

    public void displayInfo(){
        System.out.println("Transmision Information:");
        System.out.println("manual:" + manual);
        System.out.println("automatico:"+ automatico);
        System.out.println("secuencial:" + secuencial);
       

        
    }



}
