package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drive;

public class ArcadeDriveCmd extends Command {
    private final Drive drive;
    private final Supplier<Double> speedFunction, turnFunction;

    public ArcadeDriveCmd(Drive drive, Supplier<Double> speedFunction, Supplier<Double> turnFunction) {
        this.speedFunction = speedFunction;
        this.turnFunction = turnFunction;
        this.drive = drive;
        //makes sure drive is not double scheduled
        addRequirements(drive);
    }

    @Override
    public void initialize() {}

    @Override
    //turns controller inputs into motor outputs using speed functions that get a new value every scheduler run
    public void execute() {
        double realTimeSpeed = speedFunction.get();
        double realTimeTurn = turnFunction.get();

        double left = realTimeSpeed + realTimeTurn;
        double right = realTimeSpeed - realTimeTurn;
        drive.setMotors(left, right);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("ArcadeDriveCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
