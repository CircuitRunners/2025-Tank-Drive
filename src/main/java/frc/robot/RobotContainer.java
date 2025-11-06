package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.ArcadeDriveCmd;
import frc.robot.subsystems.Drive;

public class RobotContainer {
    private final Drive drive = new Drive();

    private final Joystick driverJoy = new Joystick(0);

    public RobotContainer() {
        //runs arcade drive command when no other command is running on the drive subsystem
        drive.setDefaultCommand(new ArcadeDriveCmd(drive, () -> -driverJoy.getRawAxis(1), () -> driverJoy.getRawAxis(3)));

        configureBindings();
    }

    public void configureBindings() {
        
    }

    public Command getAutonomousCommand() {
        return null;
    }
}
