package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

public class Drive extends SubsystemBase {
    
    public Drive () {}

    //ports are placeholders actual ports will be found out tomorrow (aka never)
    private static SparkMax driveLeftMotor1 = new SparkMax(Constants.DriveConstants.leftMotor1Port, MotorType.kBrushed);
    private static SparkMax driveLeftMotor2 = new SparkMax(Constants.DriveConstants.leftMotor2Port, MotorType.kBrushed);
    private static SparkMax driveRightMotor1 = new SparkMax(Constants.DriveConstants.rightMotor1Port, MotorType.kBrushed);
    private static SparkMax driveRightMotor2 = new SparkMax(Constants.DriveConstants.rightMotor2Port, MotorType.kBrushed);

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
