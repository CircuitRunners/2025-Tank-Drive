package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public final class Constants {

    //Controller ports (currently placeholders)
    public static final int driverControllerPort = 0;

    public static final class DriveConstants {
        
        //Ports (currently placeholders)
        public static final int leftMotor1Port = 0;
        public static final int leftMotor2Port = 1;
        public static final int rightMotor1Port = 2; 
        public static final int rightMotor2Port = 3;
    }

    public static final class PivotConstants {

        //Ports (currently placeholders)
        public static final int pivotMotorPort = 4;

        //Angle limit placeholders (in degrees)
        public static final double pivotMinAngle = 0.0;
        public static final double pivotMaxAngle = 120.0;

        //Conversion factor from encoder rotations to degrees (cuz one rotation is 360 degrees)
        public static final double degreesPerRotation = 360;
    }

    public static final class CannonConstants {}
}
