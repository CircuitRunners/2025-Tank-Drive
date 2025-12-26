package frc.robot;


import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.ArcadeDriveCmd;
import frc.robot.commands.DeactivateSolenoid;
import frc.robot.commands.LaunchShooter;
import frc.robot.commands.MovePivot;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.PivotSubsystem;
import frc.robot.subsystems.PneumaticSubsystem;

public class RobotContainer {

    private final DriveSubsystem driveSubsystem = new DriveSubsystem();
    private final PivotSubsystem pivotSubsystem = new PivotSubsystem();
    private final PneumaticSubsystem pneumaticSubsystem = new PneumaticSubsystem();

    private final CommandXboxController xboxController = new CommandXboxController(Constants.GlobalConstants.controllerPort);

    public RobotContainer() {

        driveSubsystem.setDefaultCommand(new ArcadeDriveCmd(driveSubsystem, () -> -xboxController.getLeftY(), () -> xboxController.getLeftX()));
        pivotSubsystem.setDefaultCommand(new MovePivot(pivotSubsystem, () -> xboxController.getRightY()));

        configureBindings();
    }

    public void configureBindings() {
        // Mapping commands to buttons on controller
         xboxController.leftBumper().onTrue(new LaunchShooter(pneumaticSubsystem,1));
         xboxController.rightBumper().onTrue(new LaunchShooter(pneumaticSubsystem,2));
         xboxController.y().onTrue(new DeactivateSolenoid(pneumaticSubsystem));
    }

    public Command getAutonomousCommand() {
        return null;
    }
    
}
