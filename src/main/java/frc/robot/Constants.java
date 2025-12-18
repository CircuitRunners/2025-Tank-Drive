package frc.robot;

public final class Constants {

    public static final int controllerPort = 0;

    public static final class DriveConstants {
        
        //Ports (currently placeholders)
        public static final int leftMotor1Port = 0;
        public static final int leftMotor2Port = 1;
        public static final int rightMotor1Port = 2; 
        public static final int rightMotor2Port = 3;

        //Controller axis (placeholders)
        public static final int speedAxis = 1;
        public static final int turnAxis = 3;
    }

    public static final class PivotConstants {

        //Ports (currently placeholders)
        public static final int pivotMotorPort = 4;

        //Angle limit placeholders (in degrees)
        public static final double pivotMinAngle = 0.0;
        public static final double pivotMaxAngle = 120.0;

        //Conversion factor from encoder rotations to degrees (cuz one rotation is 360 degrees)
        public static final double degreesPerRotation = 360;

        //Controller axis (placeholders)
        public static final int pivotAxis = 5;
    }

    public static final class CannonConstants {}
}
