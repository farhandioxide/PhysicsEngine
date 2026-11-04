

void main() {

    //Test Field -------------------- >

    //Object Creation

    Scanner input = new Scanner(System.in);
    Vector2[] forces = new Vector2[5];

    Vector2 p = new Vector2(6,7);
    Vector2 p1 = new Vector2(3,4);

    Body b = new Body(p, 2, false);
    b.applyForce(p1);


    //print object log
    System.out.println(p + " and " + p1);

    //Test______________________________________> 01

//    double x = p1.magnitude();
//    System.out.println(x);
//    double y = p.distance(p1); //override
//    System.out.println(y);
//
//    Vector2 z = p.add(p1);
//    System.out.println(z);
//
//    Vector2 a = p1.subtract(p);
//    System.out.println(a);
//
//    Vector2 b = p1.scalarMulti(7);
//    System.out.println(b);
//
//    Vector2 c = p.normalize();
//    Vector2 d = p.negate();
//    double e = p.dot(p1);
//
//    System.out.println(c);
//    System.out.println(d);
//    System.out.println(e);


    //Test______________________________________> 02

//    System.out.println(" ");
//
//    System.out.println();
//    System.out.println();
//    System.out.println();
//
//    for(int i=0; i<forces.length; i++){
//        System.out.println("Enter Vector no. "+(i+1)+": ");
//        System.out.print("Enter x: ");
//        double x = input.nextDouble();
//        System.out.print("Enter y: ");
//        double y = input.nextDouble();
//
//        forces[i] = new Vector2(x,y);
//    }
//
//    for (int i=0; i<forces.length; i++){
//        System.out.println(forces[i]);
//    }
//    Body B = new Body();
//    for (int i=0; i<forces.length; i++){
//
//        B.applyForce(forces[i]);
//    }
//    System.out.println("Total force: "+B.getForce());
//
//




    //Test______________________________________> 03

    Body C = new Body(new Vector2(1,2), 2, false);

    C.applyForce(new Vector2(3,5));
    System.out.print(C.getForce());
    Integrator I = new Integrator(10);
    I.integrate(C);
    System.out.print(C.getForce());
    System.out.print(C.getPosition());
    System.out.print(C.getVelocity());




    //Test______________________________________> 04

}