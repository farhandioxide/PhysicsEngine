


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
        return "Vector2D(" + x + ", " + y + ")";
    }

    //get length

    public double magnitude(){
        return Math.sqrt((x*x) + (y*y));
    } //potential error fix: Try except - if the object created in vector suggest to create in double
    public double distance(Vector2 vec){
        double dx = this.x - vec.x;
        double dy = this.y - vec.y;

        return Math.sqrt(dx*dx + dy*dy);
    }

//    Addition |	Combine vectors for velocity changes

    public Vector2 add(Vector2 V){ //[potential error fix: Try except - if the object created in double suggest to create in vector (E1)]
        double a = this.x + V.x;
        double b = this.y + V.y;

        return new Vector2(a,b);
    }

//    public Vector2 addN(Vector2 V, int N){  //after creating array of vectors (V1)
//        for(int i =0; i<N; i++){
//            double a = this.x +
//        }
//    }


//    Subtraction |	del

    public Vector2 subtract(Vector2 V){  //(E1)
        double a = this.x - V.x;
        double b = this.y - V.y;

        return new Vector2(a,b);
    }

//    Scalar | multiplication	to Scale a vector by a number

    public Vector2 scalarMult(double X){ //(E1)
        double a = this.x * X;
        double b = this.y * X;

        return new Vector2(a,b);
    }

//    Normalization | to make a unit vector in the same direction
    public Vector2 normalize(){ //(E1)
        double a = this.x;
        double b = this.y;

        double ln = this.magnitude();

        if(ln!=0){
            double m = a/ln;
            double n = b/ln;
            return new Vector2(m,n);
        }else{
            return new Vector2(a,b);
        }


    }

//    Dot | product	Calculate alignment and help with collision calculations

    public double dot(Vector2 V){ //(E1)
        double a = this.x * V.x;
        double b = this.y * V.y;
        return a+b;
    }


//    Negation	| Reverse a vector's direction
    public Vector2 negate(){ //(E1)
        double a = this.x;
        double b = this.y;

        return new Vector2(-a,-b);
    }

    // Array of vectors. (V1)



}
