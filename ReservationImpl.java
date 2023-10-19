import java.util.Random;
interface Reservation {
    String getReservationCode();
    String getDay();
}

public class ReservationImpl implements Reservation {
    private String code;
    private String day;
    private static final String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    public ReservationImpl() {
        generateReservationCode();
        assignRandomDay();
    }

    private void generateReservationCode() {
        StringBuilder codeBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int charType = random.nextInt(3); // 0: szám, 1: nagybetű
            switch (charType) {
                case 0:
                    codeBuilder.append(random.nextInt(10)); // Véletlenszerű szám hozzáadása
                    break;
                case 1:
                    char randomChar = (char) (random.nextInt(26) + 'A'); // Véletlenszerű nagybetű hozzáadása
                    codeBuilder.append(randomChar);
                    break;
            }
        }

        code = codeBuilder.toString();
    }

    private void assignRandomDay() {
        Random random = new Random();
        int index = random.nextInt(DOW.length);
        day = DOW[index];
    }

    public String getReservationCode() {
        return code;
    }

    public String getDay() {
        return day;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Reservation reservation = new ReservationImpl();
            System.out.println("Booking# " + reservation.getReservationCode() + " for " + reservation.getDay());
        }
    }
}
