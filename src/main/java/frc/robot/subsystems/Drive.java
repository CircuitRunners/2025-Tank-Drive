package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Drive extends SubsystemBase {
    
    public Drive () {}

    //ports are placeholders actual ports will be found out tomorrow (aka never)
    private static VictorSPX driveLeftMotor1 = new VictorSPX(Constants.DriveConstants.leftMotor1Port);
    private static TalonSRX driveLeftMotor2 = new TalonSRX(Constants.DriveConstants.leftMotor2Port);
    private static VictorSPX driveRightMotor1 = new VictorSPX(Constants.DriveConstants.rightMotor1Port);
    private static TalonSRX driveRightMotor2 = new TalonSRX(Constants.DriveConstants.rightMotor2Port);

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    //sets the motors (mind blowing ik)
    public void setMotors(double leftSpeed, double rightSpeed) {
        driveLeftMotor1.set(ControlMode.PercentOutput, leftSpeed);
        driveLeftMotor2.set(ControlMode.PercentOutput, leftSpeed);
        driveRightMotor1.set(ControlMode.PercentOutput, -rightSpeed);
        driveRightMotor2.set(ControlMode.PercentOutput, -rightSpeed);
    }

}
