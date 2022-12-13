public class User {
    public SportCar myvehicle;
    public User(SportCar Car){
        this.myvehicle = Car;
    }

    
     
    public void StarterOnVehicle(){
        System.out.println("The Car is On");
    }
    public void StarterOffVehicle(){
        System.out.println("The Car is Off");
    }
    public void MaxVolSpeed(){
        System.out.println("Max speed: " + myvehicle.engine);
        myvehicle.engine += 10;
    }
    public void MinVolSpeed(){
        System.out.println("Min speed: " + myvehicle.engine);
        myvehicle.engine -= 10;
    }
    public void CarMoveForward(){
        System.out.println("Move Forward");
    }
    public void CarMoveBackward(){
        System.out.println("Move Backward");
    }
    public void CarTurnLeft(){
        System.out.println("Turn Left");
    }
    public void CarTurnRight(){
        System.out.println("Turn Right");
    }
    public void CarEngine(){
        System.out.println("250");
    }
    public void CarColors(){
        System.out.println("Blue");
    }
    public void Menu() {
        System.out.println("*  TEST CAR *");
            System.out.println("[1] - Starter ON");
            System.out.println("[2] - Starter OFF");
            System.out.println("[3] - Max Speed");
            System.out.println("[4] - Min Speed");
            System.out.println("[5] - Move Forward");
            System.out.println("[6] - Move Backward");
            System.out.println("[7] - Turn Left");
            System.out.println("[8] - Turn Right");
            System.out.println("[9] - Colors And Engine");
            System.out.println("[0] - Quit");
            System.out.println("___");
            System.out.println("Choose Number :");
            
    }
}
