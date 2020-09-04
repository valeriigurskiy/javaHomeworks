package homework2.Request;

public class Main {
    public static void main(String[] args) {
        Request.selectDays selectedDay = Request.selectDays.FRIDAY;

        Request request = new Request(1, 2003, selectedDay.toString(), new Client("Ivanov", "Ivan",123 , new Passport("123", 123, "Petrov")));

        System.out.println(request);

    }
}
