package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.Pivot;

public class PivotCustomAngleCmd extends Command {

    private final Pivot pivot;
    private final PIDController pid = new PIDController(Constants.PivotConstants.kP, Constants.PivotConstants.kI, Constants.PivotConstants.kD);

    public PivotCustomAngleCmd(Pivot pivot) {
        this.pivot = pivot;
        //makes sure pivot is not double scheduled
        addRequirements(pivot);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        pivot.setMotor(pid.calculate(pivot.getDegrees(), Constants.PivotConstants.customSetpointAngle));
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Pivot0DegreeCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
    
}
