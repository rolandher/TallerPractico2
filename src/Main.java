public class Main {

    public static void main(String[] args) {

        SpaceShip spaceShip = null;
        boolean shuttleVehicle = true;

        if (shuttleVehicle) {
            spaceShip = new ShuttleVehicle(8);
        } else if (spaceShip != null) {
            spaceShip = new UnMannedShips(4);
        }
        else {
            spaceShip = new MannedShips(7);
        }

        spaceShip.acceleration();
        spaceShip.movement();
    }
}

