
package main.java.frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkAbsoluteEncoder;

public class PivotSubsystem extends SubsystemBase{
    public PivotSubsystem()
    {
        
    }

    private static final SparkMax pivotMotor = new SparkMax(Constants.PivotConstants.pivotMotorPorts, MotorType.kBrushless);
    private static final SparkAbsoluteEncoder pivotEncoder = pivotMotor.getAbsoluteEncoder();

    public void periodic()
    {

    }

    public double getDegrees()
    {
        double degrees = pivotEncoder.getPostion() * 360;
        return degrees;
    }

    public void setMotorSpeed(double speed)
    {
        // if(getDegrees() < )
    }

}
