import models.Car;
import models.Motor;
import models.Transmision;
import models.Chasis;
import models.Neumatico;
import models.sistemaElectrico;
import models.sistemaFrenos;
import models.registroVehicular;
import models.Mantenimiento;
import models.Sensor;


public class App {
       public static void main(String[] args) throws Exception {
            Car miCar = new Car("Toyota", "Corolla", 2020);
            Car friendsCar = new Car("Honda", "Civic", 2021);
            Motor miMotor = new Motor("V6", "Gasolina", "300hp");
            Motor friendsMotor = new Motor("V6", "Diesel", "500hp");
            Transmision miTransmision = new Transmision("Manual", "Automatico", "Secuencial");
            Transmision friendsTransmision = new Transmision("Manual", "Automatico", "Secuencial");
            Chasis miChasis = new Chasis("Monocasco", "4.5m x 1.8m x 1.4m", "1500kg");
            Chasis friendsChasis = new Chasis("Monocasco", "4.5m x 1.8m x 1.4m", "1500kg");
            Neumatico miNeumatico = new Neumatico("Michelin", "All Terrain", "205/55R16");
            Neumatico friendsNeumatico = new Neumatico("Bridgestone", "Higway Terrain", "205/55R16");
            sistemaElectrico miSistemaElectrico = new sistemaElectrico("12V, plomo-ácido", "LED", "Fusibles");
            sistemaElectrico friendsSistemaElectrico = new sistemaElectrico("12V, plomo-ácido", "LED", "Fusibles");
            sistemaFrenos miSistemaFrenos = new sistemaFrenos("Discos ventilados", "anti-lock braking system", "Pastillas delanteras: duración promedio 30,000–50,000 km");
            sistemaFrenos friendsSistemaFrenos = new sistemaFrenos("Discos ventilados", "estandar", "Pastillas delanteras: 30,000–60,000 km");
            registroVehicular miRegistroVehicular = new registroVehicular("ABC123", "Josua Bolivar", "2023-10-01");
            registroVehicular friendsRegistroVehicular = new registroVehicular("XYZ789", "David Londoño", "2023-10-02");
            Mantenimiento miMantenimiento = new Mantenimiento("2024-09-01", "2025-09-01", "Cambio de aceite");
            Mantenimiento friendsMantenimiento = new Mantenimiento("2024-10-01", "2025-08-01", "alineacion y balanceo");
            Sensor miSensor = new Sensor("120 km/h", "90 °C", "30 psi");
            Sensor friendsSensor = new Sensor("130 km/h", "85 °C", "32 psi");
            
            
           

           
            System.out.println("Hello, World!");
            miCar.displayInfo();
            friendsCar.displayInfo();
            miMotor.displayInfo();
            friendsMotor.displayInfo();
            miTransmision.displayInfo();
            friendsTransmision.displayInfo();
            miChasis.displayInfo();
            friendsChasis.displayInfo();
            miNeumatico.displayInfo();
            friendsNeumatico.displayInfo();  
            miSistemaElectrico.displayInfo();
            friendsSistemaElectrico.displayInfo();
            miSistemaFrenos.displayInfo();
            friendsSistemaFrenos.displayInfo();
            miRegistroVehicular.displayInfo();
            friendsRegistroVehicular.displayInfo();
            miMantenimiento.displayInfo();
            friendsMantenimiento.displayInfo();
            miSensor.displayInfo();
            friendsSensor.displayInfo();
           
           
    }
}

