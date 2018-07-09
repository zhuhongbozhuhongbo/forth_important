package device_simulation;

public class Data {
    private char Mag_X;
    private char Mag_Y;
    private char Mag_Z;

    public char getMag_X() {
        return Mag_X;
    }

    public void setMag_X(char mag_X) {
        Mag_X = mag_X;
    }

    public char getMag_Y() {
        return Mag_Y;
    }

    public void setMag_Y(char mag_Y) {
        Mag_Y = mag_Y;
    }

    public char getMag_Z() {
        return Mag_Z;
    }

    public void setMag_Z(char mag_Z) {
        Mag_Z = mag_Z;
    }

    public char getGyro_X() {
        return Gyro_X;
    }

    public void setGyro_X(char gyro_X) {
        Gyro_X = gyro_X;
    }

    public char getGyro_Y() {
        return Gyro_Y;
    }

    public void setGyro_Y(char gyro_Y) {
        Gyro_Y = gyro_Y;
    }

    public char getGyro_Z() {
        return Gyro_Z;
    }

    public void setGyro_Z(char gyro_Z) {
        Gyro_Z = gyro_Z;
    }

    public char getSpeed() {
        return Speed;
    }

    public void setSpeed(char speed) {
        Speed = speed;
    }

    public char getAcc_X() {
        return Acc_X;
    }

    public void setAcc_X(char acc_X) {
        Acc_X = acc_X;
    }

    public char getAcc_Y() {
        return Acc_Y;
    }

    public void setAcc_Y(char acc_Y) {
        Acc_Y = acc_Y;
    }

    public char getAcc_Z() {
        return Acc_Z;
    }

    public void setAcc_Z(char acc_Z) {
        Acc_Z = acc_Z;
    }

    public char getFuel() {
        return Fuel;
    }

    public void setFuel(char fuel) {
        Fuel = fuel;
    }

    public char getBattery() {
        return Battery;
    }

    public void setBattery(char battery) {
        Battery = battery;
    }

    public char getYear() {
        return Year;
    }

    public void setYear(char year) {
        Year = year;
    }

    public char getMonth() {
        return Month;
    }

    public void setMonth(char month) {
        Month = month;
    }

    public char getDay() {
        return Day;
    }

    public void setDay(char day) {
        Day = day;
    }

    public char getHour() {
        return Hour;
    }

    public void setHour(char hour) {
        Hour = hour;
    }

    public char getMinute() {
        return Minute;
    }

    public void setMinute(char minute) {
        Minute = minute;
    }

    public char getSecond() {
        return Second;
    }

    public void setSecond(char second) {
        Second = second;
    }

    public char getRotation() {
        return Rotation;
    }

    public void setRotation(char rotation) {
        Rotation = rotation;
    }

    public char getWorking() {
        return working;
    }

    public void setWorking(char working) {
        this.working = working;
    }




    private char Gyro_X;
    private char Gyro_Y;
    private char Gyro_Z;
    private char Speed;
    private char Acc_X;
    private char Acc_Y;
    private char Acc_Z;
    private char Fuel;
    private char Battery;
    private char Year;
    private char Month;
    private char Day;
    private char Hour;
    private char Minute;
    private char Second;
    private char Rotation;
    private char working;//是否在工作

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    private long Id;

    public int getLati() {
        return Lati;
    }

    public void setLati(int lati) {
        Lati = lati;
    }

    public int getLogi() {
        return Logi;
    }

    public void setLogi(int logi) {
        Logi = logi;
    }

    private int Lati;
    
    private int Logi;



    public char getDistance() {
        return Distance;
    }

    public void setDistance(char distance) {
        Distance = distance;
    }

    private char Distance;

}
