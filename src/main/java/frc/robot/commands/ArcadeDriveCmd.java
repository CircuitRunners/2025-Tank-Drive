package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

public class ArcadeDriveCmd extends Command {

    private final DriveSubsystem driveSubsystem;
    private final Supplier<Double> speedFunction, turnFunction;

    public ArcadeDriveCmd(DriveSubsystem driveSub, Supplier<Double> spdFunc, Supplier<Double> turnFunc) {
        driveSubsystem = driveSub;
        speedFunction = spdFunc;
        turnFunction = turnFunc;
        addRequirements(driveSubsystem);
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        double realTimeSpd = speedFunction.get();
        double realTimeTurn = turnFunction.get();

        double left = realTimeSpd + realTimeTurn;
        double right = realTimeSpd - realTimeTurn;

        driveSubsystem.setMotors(left, right);
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
    
}
