

public class Body {

    Vector2 position;
    Vector2 velocity;
    Vector2 acceleration;
    Vector2 force;
    double mass;
    boolean isStatic;


     public Body(){
         this.position = new Vector2();
         this.velocity = new Vector2();
         this.acceleration = new Vector2();
         this.force = new Vector2();
         this.mass = 0;
         this.isStatic = true;
     }
     public Body(Vector2 position, double mass, boolean isStatic){
         this.position = position;
         this.velocity = new Vector2();
         this.acceleration = new Vector2();
         this.force = new Vector2();
         this.mass = mass;
         this.isStatic = isStatic;

         if(!isStatic && Double.isFinite(mass)){
             throw new IllegalArgumentException("Dynamic body must have positive mass");
         }

     }


     public double inverseMass(){
         if(isStatic){
             return 0.0;
         }else{
             return 1.0/mass;
         }
     }



//    position	- Vector2	- Where the object is
//    velocity	- Vector2	 - How fast and in which direction it moves
//    acceleration	- Vector2	- How its velocity changes
//    force -	Vector2 -	The accumulated force acting on it
//    mass	 - double	- Its mass
//    isStatic -	boolean	- Whether it should remain fixed

}
