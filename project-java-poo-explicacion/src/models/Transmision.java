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
        public String getManual() {
            return manual;
    }
        public String getAutomatico() {
            return automatico;
    }
        public String getSecuencial() {
            return secuencial;
    }
        public void setManual(String manual) {
            this.manual = manual;
    }
        public void setAutomatico(String automatico) {
            this.automatico = automatico;
    }
        public void setSecuencial(String secuencial) {
            this.secuencial = secuencial;
    }

    public void displayInfo(){
        System.out.println("Transmision Information:");
        System.out.println("manual:" + manual);
        System.out.println("automatico:"+ automatico);
        System.out.println("secuencial:" + secuencial);
       

        
    }



}
