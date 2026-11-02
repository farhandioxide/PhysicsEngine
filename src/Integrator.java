public class Integrator {
    //Advances body motion over time

    private double dt;

    public Integrator(double dt){
        if (!Double.isFinite(dt) || dt <= 0) {
            throw new IllegalArgumentException("Time step must be positive and finite");
        }

        this.dt = dt;
    }

//    public void applyAcceleration(double time){
//
//        if (isStatic) {
//            return;
//        }
//
//        this.velocity = this.velocity.add(this.acceleration.scalarMulti(time));
//    }

    public void integrate(Body body){
        body.calculateAcceleration();
        //  Update velocity
        body.updatePosition(dt);
        body.clearForces();
    }



}
