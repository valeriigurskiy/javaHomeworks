package homework2.Request;

public class Passport {
    String passportSeries;
    int passportNumber;
    String whoIssued;

    public Passport() {
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportSeries='" + passportSeries + '\'' +
                ", passportNumber=" + passportNumber +
                ", whoIssued='" + whoIssued + '\'' +
                '}';
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getWhoIssued() {
        return whoIssued;
    }

    public void setWhoIssued(String whoIssued) {
        this.whoIssued = whoIssued;
    }

    public Passport(String passportSeries, int passportNumber, String whoIssued) {
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.whoIssued = whoIssued;
    }
}
