public class Integrator {
    //Advances body motion over time

    private double dt;

    public Integrator(double dt){
        if (!Double.isFinite(dt) || dt <= 0) {
            throw new IllegalArgumentException("Time step must be positive and finite");
        }

        this.dt = dt;
    }

    public void integrate(Body body){
        if (body == null) {
            throw new IllegalArgumentException("Body cannot be null");
        }

        body.calculateAcceleration();
        body.updateVelocity(dt);
        body.updatePosition(dt);
        body.clearForces();
    }

}
