


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

    //get length

    public double magnitude(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public double magnitude(Vector2 vec){
        double dx = this.x - vec.x;
        double dy = this.y - vec.y;

        return Math.sqrt(dx*dx + dy*dy);

    }

//    Addition |	Combine vectors for velocity changes

//    Subtraction |	del

//    Scalar | multiplication	to Scale a vector by a number

//    Normalization | to make a unit vector in the same direction

//    Dot | product	Calculate alignment and help with collision calculations

//    Distance	| Calculate the distance between two points (vector distace)

//    Negation	| Reverse a vector's direction



}
