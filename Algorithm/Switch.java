public class Switch {
    public static void main(String[] args) {

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday  - Chest,tricep,shoulder");
                break;

            case 2:
                System.out.println("Tuesday - Back,bicep");
                break;

            case 3:
                System.out.println("Wednesday - Leg,core");
                break;

            case 4:
                System.out.println("Thursday - forearm,traps,rear delts");
                break;

            case 5:
                System.out.println("Friday - chest,back");
                break;

            case 6:
                System.out.println("Saturday - GIN day");
                break;

            case 7:
                System.out.println("Sunday - GIN day");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}