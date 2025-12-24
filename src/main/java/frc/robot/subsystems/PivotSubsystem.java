package frc.robot.subsystems;


import com.revrobotics.spark.SparkAbsoluteEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PivotSubsystem extends SubsystemBase {

    private final SparkMax motor1 = new SparkMax(Constants.PivotSubConstants.motor1Port, MotorType.kBrushless);
    // private final SparkMax motor2 = new SparkMax(Constants.PivotSubConstants.motor2Port, MotorType.kBrushless);

    private final SparkAbsoluteEncoder encoder = motor1.getAbsoluteEncoder();
    private SparkMaxConfig motorConfig = new SparkMaxConfig();
    
    public PivotSubsystem() {
        motorConfig.absoluteEncoder.positionConversionFactor(360); // automatically converts rotations to degrees when calling getPosition
        motor1.configure(motorConfig, null, null); // set config to motor
    }

    public double getPos() {
        return encoder.getPosition();
    }

    public void movePivot(double spd) {
        if ((getPos() > Constants.PivotSubConstants.lowerLimit) && (getPos() < Constants.PivotSubConstants.upperLimit)) {
            motor1.set(spd);
        }
    }

}
