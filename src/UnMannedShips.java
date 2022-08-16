
public class UnMannedShips extends SpaceShip {

    private boolean itsNotMoving;
    private boolean itIsMoving;

    public UnMannedShips(int doors) {
        super(doors);
        this.id = 1987;
        this.itsNotMoving = false;
    }

    public void acceleration() {
        this.speed = speed + 1000;
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
