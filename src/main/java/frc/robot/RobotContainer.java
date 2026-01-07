package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.AimPivot;
import frc.robot.commands.ArcadeDriveCmd;
import frc.robot.commands.DeactivateSolenoidCmd;
import frc.robot.commands.FireCannonCmd;
import frc.robot.subsystems.Cannon;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Pivot;

public class RobotContainer {
    private final CommandXboxController driverJoy = new CommandXboxController(Constants.driverControllerPort);

    private final Drive drive = new Drive();
    private final Pivot pivot = new Pivot();
    private final Cannon cannon = new Cannon();

    public RobotContainer() {
        //runs arcade drive command when no other command is running on the drive subsystem
        drive.setDefaultCommand(new ArcadeDriveCmd(drive, () -> -driverJoy.getLeftY(), () -> driverJoy.getLeftX()));
        pivot.setDefaultCommand(new AimPivot(pivot, () -> driverJoy.getRightY()));

        configureBindings();
    }

    public void configureBindings() {
        driverJoy.leftBumper().onTrue(new FireCannonCmd(cannon, 0));
        driverJoy.rightBumper().onTrue(new FireCannonCmd(cannon, 1));
        driverJoy.y().onTrue(new DeactivateSolenoidCmd(cannon));
    }

    public Command getAutonomousCommand() {
        return null;
    }
}
