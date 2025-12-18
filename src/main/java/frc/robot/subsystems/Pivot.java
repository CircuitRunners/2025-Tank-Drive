package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkAbsoluteEncoder;

public class Pivot extends SubsystemBase {
    
    public Pivot() {}

    //ports are placeholders actual ports will be found out tomorrow (aka never)
    private static final SparkMax pivotMotor = new SparkMax(Constants.PivotConstants.pivotMotorPort, MotorType.kBrushless);
    private static final SparkAbsoluteEncoder pivotEncoder = pivotMotor.getAbsoluteEncoder();

    @Override
    public void periodic() {}

    public double getDegrees() {
        return pivotEncoder.getPosition() * Constants.PivotConstants.degreesPerRotation;
    }

    public void setMotor(double speed) {
        if (getDegrees() > Constants.PivotConstants.pivotMinAngle && getDegrees() < Constants.PivotConstants.pivotMaxAngle) {
            pivotMotor.set(speed);
        }
    }
}
