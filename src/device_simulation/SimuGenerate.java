package device_simulation;

public class SimuGenerate {
    public SimuGenerate(Data d0, Data d1, Data d2, Data d3, Data d4, Data d5){
        Simulation.setMag_X(d0.getMag_X(), d1.getMag_X(), d2.getMag_X(), d3.getMag_X(), d4.getMag_X(), d5.getMag_X());
        Simulation.setMag_Y(d0.getMag_Y(), d1.getMag_Y(), d2.getMag_Y(), d3.getMag_Y(), d4.getMag_Y(), d5.getMag_Y());
        Simulation.setMag_Z(d0.getMag_Z(), d1.getMag_Z(), d2.getMag_X(), d3.getMag_X(), d4.getMag_X(), d5.getMag_X());
        Simulation.setGyro_X(d0.getGyro_X(), d1.getGyro_X(), d2.getGyro_X(), d3.getGyro_X(), d4.getGyro_X(), d5.getGyro_X());
        Simulation.setGyro_Y(d0.getGyro_Y(), d1.getGyro_Y(), d2.getGyro_Y(), d3.getGyro_Y(), d4.getGyro_Y(), d5.getGyro_Y());
        Simulation.setGyro_Z(d0.getGyro_Z(), d1.getGyro_Z(), d2.getGyro_Z(), d3.getGyro_Z(), d4.getGyro_Z(), d5.getGyro_Z());
        Simulation.setSpeed(d0.getSpeed(), d1.getSpeed(), d2.getSpeed(), d3.getSpeed(), d4.getSpeed(), d5.getSpeed());

        Simulation.setAcc_X(d0.getAcc_X(), d1.getAcc_X(), d2.getAcc_X(), d3.getAcc_X(), d4.getAcc_X(), d5.getAcc_X());
        Simulation.setAcc_Y(d0.getAcc_Y(), d1.getAcc_Y(), d2.getAcc_Y(), d3.getAcc_Y(), d4.getAcc_Y(), d5.getAcc_Y());
        Simulation.setAcc_Z(d0.getAcc_Z(), d1.getAcc_Z(), d2.getAcc_Z(), d3.getAcc_Z(), d4.getAcc_Z(), d5.getAcc_Z());
        Simulation.setFuel(d0.getFuel(), d1.getFuel(), d2.getFuel(), d3.getFuel(), d4.getFuel(), d5.getFuel());
        Simulation.setBattery(d0.getBattery(), d1.getBattery(), d2.getBattery(), d3.getBattery(), d4.getBattery(), d5.getBattery());
        Simulation.setDateTime(d0.getYear(), d0.getMonth(), d0.getDay(), d0.getHour(), d0.getMinute(), d0.getSecond());
        Simulation.setRotation(d0.getRotation(), d1.getRotation(), d2.getRotation(), d3.getRotation(), d4.getRotation(), d5.getRotation());
        Simulation.setWork(d0.getWorking(), d1.getWorking(), d2.getWorking(), d3.getWorking(), d4.getWorking(), d5.getWorking());
        Simulation.setID(d0.getId());
        Simulation.setLatitude(d0.getLati(), d1.getLati(), d2.getLati(), d3.getLati(), d4.getLati(), d5.getLati());
        Simulation.setLongitude(d0.getLogi(), d1.getLogi(), d2.getLogi(), d3.getLogi(), d4.getLogi(), d5.getLogi());
        Simulation.setDistance(d0.getDistance(), d1.getDistance(), d2.getDistance(), d3.getDistance(), d4.getDistance(), d5.getDistance());
    }
}
