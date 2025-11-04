package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
    
    public Drive () {}

    //ports are placeholders actual ports will be found out tomorrow
    private static Spark driveLeftMotor1 = new Spark(0);
    private static Spark driveLeftMotor2 = new Spark(1);
    private static Spark driveRightMotor1 = new Spark(2);
    private static Spark driveRightMotor2 = new Spark(3);

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    //sets the motors (mind blowing ik)
    public void setMotors(double leftSpeed, double rightSpeed) {
        driveLeftMotor1.set(leftSpeed);
        driveLeftMotor2.set(leftSpeed);
        driveRightMotor1.set(-rightSpeed);
        driveRightMotor2.set(-rightSpeed);
    }

}
