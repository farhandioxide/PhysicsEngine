

void main() {

    //Test Field -------------------- >

    //Object Creation
    Vector2 position = new Vector2(6,7);
    Vector2 position2 = new Vector2(3,4);

    //print object log
    System.out.println(position + "\n" + position2);

    //Test______________________________________>

    double x = position.magnitude();
    System.out.println(x);
    double y = position.magnitude(position2); //override
    System.out.println(y);




}