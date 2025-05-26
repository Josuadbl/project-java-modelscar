import models.*;

public class App {
       public static void main(String[] args) throws Exception {
            Car miCar = new Car("Toyota", "Corolla", 2020);
            miCar.setMake("toyota");
            miCar.setModel("Corolla");
            miCar.setYear(2020);


            System.out.println("Make :" + miCar.getMake());
            System.out.println("model :" + miCar.getModel());
            System.out.println("year :" + miCar.getModel());


            Car friendCar = new Car();
            
            friendCar.setMake("toyota");
            friendCar.setModel("Corolla");
            friendCar.setYear(2020);

            System.out.println("make :" + friendCar.getMake());
            System.out.println("model :"+ friendCar.getModel());
            System.out.println("year :" +friendCar.getYear());

            Car miCar2 = new Car();

            miCar2.setMake("toyota");
            miCar2.setModel("model");
            miCar2.setYear(2020);

            System.out.println("make:" + miCar2.getMake());
            System.out.println("model:" + miCar2.getModel());
            System.out.println("year:" + miCar2.getYear());


            Car friendCar2 = new Car ();

            friendCar2.setMake("toyota");
            friendCar2.setModel("corolla");
            friendCar2.setYear(2020);

            System.out.println("make:" + friendCar2.getMake());
            System.out.println("model:" + friendCar2.getModel());
            System.out.println("year:" + friendCar2.getYear());



            Chasis miChasis = new Chasis();

            miChasis.settipo("monocasco");
            miChasis.setdimensiones("4.5m x 1.8m x 1.4m");
            miChasis.setpeso("1500kg");

            System.out.println("tipo:" + miChasis.gettipo());
            System.out.println("dimensiones:" + miChasis.getdimensiones());
            System.out.println("peso:" + miChasis.getpeso());


            Chasis friendChasis = new Chasis();

            friendChasis.settipo("monocasco");
            friendChasis.setdimensiones("4.5m x 1.8m x 1.4m");
            friendChasis.setpeso("1500kg");

            System.out.println("tipo:" + friendChasis.gettipo());
            System.out.println("dimensiones:" + friendChasis.getdimensiones());
            System.out.println("peso:" + friendChasis.getpeso());

            Chasis miChasis2 = new Chasis();

            miChasis2.settipo("monocasco");
            miChasis2.setdimensiones("4.5m x 1.8m x 1.4m");
            miChasis2.setpeso("1500kg");

            System.out.println("tipo:" + miChasis2.gettipo());
            System.out.println("dimensiones:" + miChasis2.getdimensiones());
            System.out.println("peso:" + miChasis2.getpeso());


            Chasis friendChasis2 = new Chasis();

            friendChasis2.settipo("monocasco");
            friendChasis2.setdimensiones("4.5m x 1.8m x 1.4m");
            friendChasis2.setpeso("1500kg");

            System.out.println("tipo:" + friendChasis2.gettipo());
            System.out.println("dimensiones:" + friendChasis2.getdimensiones());
            System.out.println("peso:" + friendChasis2.getpeso());



            Mantenimiento miMantenimiento = new Mantenimiento();

            miMantenimiento.setUltimoMantenimiento("28-04-2024");
            miMantenimiento.setProximoMantenimiento("19-07-2025");
            miMantenimiento.setTiposervicio("cambio de aceite");

            System.out.println("UltimoMantenimiento:" + miMantenimiento.getUltimoMantenimiento());
            System.out.println("proximoMantenimiento" + miMantenimiento.getProximoMantenimiento());
            System.out.println("Tiposervicio" + miMantenimiento.getTipoServicio());


            Mantenimiento friendsMantenimiento = new Mantenimiento();

            friendsMantenimiento.setUltimoMantenimiento("28-04-2024");
            friendsMantenimiento.setProximoMantenimiento("19-07-2025");
            friendsMantenimiento.setTiposervicio("cambio de aceite");

            System.out.println("UltimoMantenimiento:" + friendsMantenimiento.getUltimoMantenimiento());
            System.out.println("proximoMantenimiento" + friendsMantenimiento.getProximoMantenimiento());
            System.out.println("Tiposervicio" + friendsMantenimiento.getTipoServicio());


            Mantenimiento miMantenimiento2 = new Mantenimiento();

            
            miMantenimiento2.setUltimoMantenimiento("28-04-2024");
            miMantenimiento2.setProximoMantenimiento("19-07-2025");
            miMantenimiento2.setTiposervicio("cambio de aceite");

            System.out.println("UltimoMantenimiento:" + miMantenimiento2.getUltimoMantenimiento());
            System.out.println("proximoMantenimiento" + miMantenimiento2.getProximoMantenimiento());
            System.out.println("Tiposervicio" + miMantenimiento2.getTipoServicio());


            Mantenimiento friendsMantenimiento2 = new Mantenimiento();

            friendsMantenimiento2.setUltimoMantenimiento("28-04-2024");
            friendsMantenimiento2.setProximoMantenimiento("19-07-2025");
            friendsMantenimiento2.setTiposervicio("cambio de aceite");

            System.out.println("UltimoMantenimiento:" + friendsMantenimiento2.getUltimoMantenimiento());
            System.out.println("proximoMantenimiento" + friendsMantenimiento2.getProximoMantenimiento());
            System.out.println("Tiposervicio" + friendsMantenimiento2.getTipoServicio());


            Motor miMotor = new Motor();

            miMotor.setMotor("V6");
            miMotor.setCombustible("gasolina");
            miMotor.setPotencia("300hp");

            System.out.println("motor:" + miMotor.getMotor());
            System.out.println("combustible" + miMotor.getCombustible());
            System.out.println("potencia" + miMotor.getPotencia());


            Motor miMotor2 = new Motor();

            miMotor2.setMotor("V6");
            miMotor2.setCombustible("gasolina");
            miMotor2.setPotencia("300hp");

            System.out.println("motor:" + miMotor2.getMotor());
            System.out.println("combustible" + miMotor2.getCombustible());
            System.out.println("potencia" + miMotor2.getPotencia());


            Motor friendMotor = new Motor();

            friendMotor.setMotor("V6");
            friendMotor.setCombustible("gasolina");
            friendMotor.setPotencia("300hp");

            System.out.println("motor:" + friendMotor.getMotor());
            System.out.println("combustible" + friendMotor.getCombustible());
            System.out.println("potencia" + friendMotor.getPotencia());


            Motor friendMotor2 = new Motor();

            friendMotor2.setMotor("V6");
            friendMotor2.setCombustible("gasolina");
            friendMotor2.setPotencia("300hp");

            System.out.println("motor:" + friendMotor2.getMotor());
            System.out.println("combustible" + friendMotor2.getCombustible());
            System.out.println("potencia" + friendMotor2.getPotencia());



            Neumatico miNeumatico = new Neumatico();

            miNeumatico.setMarca("Bridgestone");
            miNeumatico.setModelo("all terrain");
            miNeumatico.setMedida("205/55R16");

            System.out.println("marca:" + miNeumatico.getMarca());
            System.out.println("modelo" + miNeumatico.getModelo());
            System.out.println("medida" + miNeumatico.getMedida());


            Neumatico miNeumatico2 = new Neumatico();

            miNeumatico2.setMarca("Bridgestone");
            miNeumatico2.setModelo("all terrain");
            miNeumatico2.setMedida("205/55R16");

            System.out.println("marca:" + miNeumatico2.getMarca());
            System.out.println("modelo" + miNeumatico2.getModelo());
            System.out.println("medida" + miNeumatico2.getMedida());


            Neumatico friendNeumatico = new Neumatico();

            friendNeumatico.setMarca("Bridgestone");
            friendNeumatico.setModelo("all terrain");
            friendNeumatico.setMedida("205/55R16");

            System.out.println("marca:" + friendNeumatico.getMarca());
            System.out.println("modelo" + friendNeumatico.getModelo());
            System.out.println("medida" + friendNeumatico.getMedida());


            Neumatico friendNeumatico2 = new Neumatico();

            friendNeumatico2.setMarca("Bridgestone");
            friendNeumatico2.setModelo("all terrain");
            friendNeumatico2.setMedida("205/55R16");

            System.out.println("marca:" + friendNeumatico2.getMarca());
            System.out.println("modelo" + friendNeumatico2.getModelo());
            System.out.println("medida" + friendNeumatico2.getMedida());



            registroVehicular miregistroVehicular = new registroVehicular();

            miregistroVehicular.setMatricula("ABC123");
            miregistroVehicular.setPropietario("Josua Bolivar");
            miregistroVehicular.setFecha("2023-10-01");

            System.out.println("matricula:" + miregistroVehicular.getMatricula());
            System.out.println("propietario" + miregistroVehicular.getPropietario());
            System.out.println("fecha" + miregistroVehicular.getFecha());


            registroVehicular miregistroVehicular2 = new registroVehicular();

            miregistroVehicular2.setMatricula("ABC123");
            miregistroVehicular2.setPropietario("Josua Bolivar");
            miregistroVehicular2.setFecha("2023-10-01");

            System.out.println("matricula:" + miregistroVehicular2.getMatricula());
            System.out.println("propietario" + miregistroVehicular2.getPropietario());
            System.out.println("fecha" + miregistroVehicular2.getFecha());


            registroVehicular friendregistroVehicular = new registroVehicular();

            friendregistroVehicular.setMatricula("ABC123");
            friendregistroVehicular.setPropietario("Josua Bolivar");
            friendregistroVehicular.setFecha("2023-10-01");

            System.out.println("matricula:" + friendregistroVehicular.getMatricula());
            System.out.println("propietario" + friendregistroVehicular.getPropietario());
            System.out.println("fecha" + friendregistroVehicular.getFecha());


            registroVehicular friendregistroVehicular2 = new registroVehicular();

            friendregistroVehicular2.setMatricula("ABC123");
            friendregistroVehicular2.setPropietario("Josua Bolivar");
            friendregistroVehicular2.setFecha("2023-10-01");

            System.out.println("matricula:" + friendregistroVehicular2.getMatricula());
            System.out.println("propietario" + friendregistroVehicular2.getPropietario());
            System.out.println("fecha" + friendregistroVehicular2.getFecha());



            Sensor miSensor = new Sensor();

            miSensor.setVelocidad("120Km/h");
            miSensor.setTemperatura("90 °C");
            miSensor.setPresion("32 psi");

            System.out.println("matricula:" + miSensor.getVelocidad());
            System.out.println("propietario" + miSensor.getTemperatura());
            System.out.println("fecha" + miSensor.getPresion());


            Sensor misecondSensor = new Sensor();

            misecondSensor.setVelocidad("120Km/h");
            misecondSensor.setTemperatura("90 °C");
            misecondSensor.setPresion("32 psi");

            System.out.println("matricula:" + misecondSensor.getVelocidad());
            System.out.println("propietario" + misecondSensor.getTemperatura());
            System.out.println("fecha" + misecondSensor.getPresion());


            Sensor  friendSensor = new Sensor();

            friendSensor.setVelocidad("120Km/h");
            friendSensor.setTemperatura("90 °C");
            friendSensor.setPresion("32 psi");

            System.out.println("matricula:" + friendSensor.getVelocidad());
            System.out.println("propietario" + friendSensor.getTemperatura());
            System.out.println("fecha" +  friendSensor.getPresion());


            Sensor  friendSensor2 = new Sensor();

            friendSensor2.setVelocidad("120Km/h");
            friendSensor2.setTemperatura("90 °C");
            friendSensor2.setPresion("32 psi");

            System.out.println("matricula:" + friendSensor2.getVelocidad());
            System.out.println("propietario" + friendSensor2.getTemperatura());
            System.out.println("fecha" +  friendSensor2.getPresion());


            sistemaElectrico misistemaElectrico = new sistemaElectrico();

            misistemaElectrico.setBateria("12V");
            misistemaElectrico.setLuces("LED");
            misistemaElectrico.setSensores("fusibles");

            System.out.println("bateria:" + misistemaElectrico.getBateria());
            System.out.println("luces" + misistemaElectrico.getLuces());
            System.out.println("sensores" + misistemaElectrico.getSensores());


            sistemaElectrico misecondsistemaElectrico = new sistemaElectrico();

            misecondsistemaElectrico.setBateria("12V");
            misecondsistemaElectrico.setLuces("LED");
            misecondsistemaElectrico.setSensores("fusibles");

            System.out.println("bateria:" + misecondsistemaElectrico.getBateria());
            System.out.println("luces" + misecondsistemaElectrico.getLuces());
            System.out.println("sensores" + misecondsistemaElectrico.getSensores());


            sistemaElectrico friendsistemaElectrico = new sistemaElectrico();

            friendsistemaElectrico.setBateria("12V");
            friendsistemaElectrico.setLuces("LED");
            friendsistemaElectrico.setSensores("fusibles");

            System.out.println("bateria:" + friendsistemaElectrico.getBateria());
            System.out.println("luces" + friendsistemaElectrico.getLuces());
            System.out.println("sensores" + friendsistemaElectrico.getSensores());


            sistemaElectrico friendsistemaElectrico2 = new sistemaElectrico();

            friendsistemaElectrico2.setBateria("12V");
            friendsistemaElectrico2.setLuces("LED");
            friendsistemaElectrico2.setSensores("fusibles");

            System.out.println("bateria:" + friendsistemaElectrico2.getBateria());
            System.out.println("luces" + friendsistemaElectrico2.getLuces());
            System.out.println("sensores" + friendsistemaElectrico2.getSensores());



            sistemaFrenos misistemaFrenos = new sistemaFrenos();

            misistemaFrenos.setdiscos("ventilados");
            misistemaFrenos.setabs("Estandar");
            misistemaFrenos.setestado("pastillas: 30,000-60,000 Km");

            System.out.println("discos:" + misistemaFrenos.getdiscos());
            System.out.println("abs" + misistemaFrenos.getabs());
            System.out.println("estados" + misistemaFrenos.getestado());


            sistemaFrenos misistemaFrenos2 = new sistemaFrenos();

            misistemaFrenos2.setdiscos("ventilados");
            misistemaFrenos2.setabs("Estandar");
            misistemaFrenos2.setestado("pastillas: 30,000-60,000 Km");

            System.out.println("discos:" + misistemaFrenos2.getdiscos());
            System.out.println("abs" + misistemaFrenos2.getabs());
            System.out.println("estados" + misistemaFrenos2.getestado());


            sistemaFrenos friendsistemaFrenos = new sistemaFrenos();

            friendsistemaFrenos.setdiscos("ventilados");
            friendsistemaFrenos.setabs("Estandar");
            friendsistemaFrenos.setestado("pastillas: 30,000-60,000 Km");

            System.out.println("discos:" + friendsistemaFrenos.getdiscos());
            System.out.println("abs" + friendsistemaFrenos.getabs());
            System.out.println("estados" + friendsistemaFrenos.getestado());

            sistemaFrenos friendsistemaFrenos2 = new sistemaFrenos();

            friendsistemaFrenos2.setdiscos("ventilados");
            friendsistemaFrenos2.setabs("Estandar");
            friendsistemaFrenos2.setestado("pastillas: 30,000-60,000 Km");

            System.out.println("discos:" + friendsistemaFrenos2.getdiscos());
            System.out.println("abs" + friendsistemaFrenos2.getabs());
            System.out.println("estados" + friendsistemaFrenos2.getestado());


            Transmision miTransmision = new Transmision();

            miTransmision.setManual("manual");
            miTransmision.setAutomatico("automatico");
            miTransmision.setSecuencial("secuencial");

            System.out.println("manual:" + miTransmision.getManual());
            System.out.println("automatico" + miTransmision.getAutomatico());
            System.out.println("secuencial" + miTransmision.getSecuencial());



             
        }



}

