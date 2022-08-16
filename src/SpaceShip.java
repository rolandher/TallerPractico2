public abstract class SpaceShip {

    public int speed;
    public int doors;
    public int id;


    public SpaceShip(int doors){
        this.doors = doors;
        this.id = 0;
        this.speed = 0;

    }
    public abstract void acceleration();

    public void movement(){
        this.speed = 0;
    }

}
