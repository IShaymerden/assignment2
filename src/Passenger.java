public class Passenger {
    private String name;
    private String passportNumber;

    public Passenger(String name, String passportNumber){
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
        //hhh
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public void displayInfo() {
        System.out.println("Passenger: " + name +
                ", Passport: " + passportNumber);
    }
}
