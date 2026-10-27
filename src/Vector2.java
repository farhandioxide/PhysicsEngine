


public class Vector2 {

    double x;
    double y;
//  double z;

    public Vector2(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Vector2(){
        this.x=0;
        this.y=0;
    }

    @Override
    public String toString(){
        return "vec2(" + x + ", " + y + ")";
    }

    public double length(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public double length(Vector2 vec){
        double dx = this.x - vec.x;
        double dy = this.y - vec.y;

        return Math.sqrt(dx*dx + dy*dy);

    }



}
