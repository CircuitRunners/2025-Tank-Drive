package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.AimPivot;
import frc.robot.commands.ArcadeDriveCmd;
import frc.robot.subsystems.Cannon;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Pivot;

public class RobotContainer {
    private final Drive drive = new Drive();
    private final Pivot pivot = new Pivot();
    private final Cannon cannon = new Cannon();

    private final XboxController driverJoy = new XboxController(Constants.controllerPort);

    public RobotContainer() {
        //runs arcade drive command when no other command is running on the drive subsystem
        drive.setDefaultCommand(new ArcadeDriveCmd(drive, () -> -driverJoy.getRawAxis(Constants.DriveConstants.speedAxis), () -> driverJoy.getRawAxis(Constants.DriveConstants.turnAxis)));
        pivot.setDefaultCommand(new AimPivot(pivot, () -> driverJoy.getRawAxis(Constants.PivotConstants.pivotAxis)));

        configureBindings();
    }

    public void configureBindings() {
        
    }

    public Command getAutonomousCommand() {
        return null;
    }
}
