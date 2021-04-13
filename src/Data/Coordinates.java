package Data;

public class Coordinates {
    private float  x;
    private double y;
    public Coordinates(float x, double y){
        this.x=x;
        this.y=y;

    }

    @Override
    public String toString() {
        String info = "Here are the Coordinates\n";

        info += ("Coordinates: \n");
        info += ("             x: " + x + '\n');
        info += ("             y: " + y + '\n');
        return info;

    }

    public float getX() {
        return x;
    }
    public double getY(){
        return y;
    }
}
