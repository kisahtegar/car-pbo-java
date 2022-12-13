abstract class Vehicle {
    int MaxSpeed = 350;
    int MinSpeed = 40;

    abstract void StarterOn();
    abstract void StarterOff();
    abstract void MaxVolSpeed();
    abstract void MinVolSpeed();
    abstract void MoveForward();
    abstract void MoveBackward();
    abstract void TurnLeft();
    abstract void TurnRight();
}
