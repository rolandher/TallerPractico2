
public class ShuttleVehicle extends SpaceShip {
    private boolean itsNotMoving;
    private boolean itIsMoving;

    public ShuttleVehicle(int doors) {
        super(doors);
        this.id = 1990;
        this.itsNotMoving = false;
    }

    public void acceleration() {
        this.speed = speed + 100;
    }

    @Override
    public void movement() {
        speed = 0;
        this.itIsMoving = true;

    }

    public boolean itsNotMoving() {
        return itsNotMoving;
    }
}
