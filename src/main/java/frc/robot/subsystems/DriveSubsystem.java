package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {

    private VictorSPX leftMotor1 = new VictorSPX(Constants.DriveSubConstants.leftMotor1Port);
    private VictorSPX leftMotor2 = new VictorSPX(Constants.DriveSubConstants.leftMotor2Port);
    private VictorSPX rightMotor1 = new VictorSPX(Constants.DriveSubConstants.rightMotor1Port);
    private VictorSPX rightMotor2 = new VictorSPX(Constants.DriveSubConstants.rightMotor2Port);

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

