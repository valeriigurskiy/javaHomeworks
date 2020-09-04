package homework2.Request;

public class Request {
    int number;
    int year;
    enum selectDays{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }
    String day;
    Client client;

    public Request() {
    }

    @Override
    public String toString() {
        return "homework2.Request{" +
                "number=" + number +
                ", year=" + year +
                ", day='" + day + '\'' +
                ", client=" + client +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDays() {
        return day;
    }

    public void setDays(String day) {
        this.day = day;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Request(int number, int year, String day, Client client) {
        this.number = number;
        this.year = year;
        this.day = day;
        this.client = client;
    }
}
