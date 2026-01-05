package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;



import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {

    private static SparkMax leftMotor1 = new SparkMax(Constants.DriveSubConstants.leftMotor1Port, MotorType.kBrushed);
    private static SparkMax leftMotor2 = new SparkMax(Constants.DriveSubConstants.leftMotor2Port, MotorType.kBrushed);
    private static SparkMax rightMotor1 = new SparkMax(Constants.DriveSubConstants.rightMotor1Port, MotorType.kBrushed);
    private static SparkMax rightMotor2 = new SparkMax(Constants.DriveSubConstants.rightMotor2Port, MotorType.kBrushed);

    public DriveSubsystem() {

    }

    @Override
    public void periodic() {

    }

    public void setMotors(double leftSpd, double rightSpd) {
        leftMotor1.set(ControlMode.PercentOutput, leftSpd);
        leftMotor2.set(ControlMode.PercentOutput, leftSpd);
        rightMotor1.set(ControlMode.PercentOutput, -rightSpd);
        rightMotor2.set(ControlMode.PercentOutput, -rightSpd);
    }
    
}

