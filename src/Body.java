

public class Body {

    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;
    private Vector2 force;
    private double mass;
    private boolean isStatic;


     public Body(){
         this.position = new Vector2();
         this.velocity = new Vector2();
         this.acceleration = new Vector2();
         this.force = new Vector2();
         this.mass = 1.0;
         this.isStatic = false;
     }
     public Body(Vector2 position, double mass, boolean isStatic){

         if (position == null) {
             throw new IllegalArgumentException("Position cannot be null");
         }

         if (!isStatic && (!Double.isFinite(mass) || mass <= 0)) {
             throw new IllegalArgumentException("Dynamic body must have positive finite mass");
         }

         this.position = position;
         this.velocity = new Vector2();
         this.acceleration = new Vector2();
         this.force = new Vector2();

         this.isStatic = isStatic;
         this.mass = isStatic ? 0.0 : mass;
     }


     public double inverseMass(){
         if(isStatic){
             return 0.0;
         }else{
             return 1.0/mass;
         }
     }

     public void applyForce(Vector2 force){

         if (force == null) {
             throw new IllegalArgumentException("Force cannot be null");
         }

         if(isStatic){
             return;
         }
         this.force = this.force.add(force);
     }
     public void applyAcceleration(double time){ //move to intefrator

         if (isStatic) {
             return;
         }

         this.velocity = this.velocity.add(this.acceleration.scalarMult(time));
     }

     public void calculateAcceleration(){
         if(isStatic){
             return;
         }

         this.acceleration = this.force.scalarMult(this.inverseMass());
     }
    public void updatePosition(double time){
         if(isStatic){
             return;
         }

         this.position = this.position.add(this.velocity.scalarMult(time));
    }
    public void clearForces(){
        this.force = new Vector2();
    }


}
