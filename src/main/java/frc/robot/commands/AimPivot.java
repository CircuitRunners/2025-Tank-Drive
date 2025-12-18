package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Pivot;

public class AimPivot extends Command {

    private final Pivot pivot;
    private final Supplier<Double> angleFunction;

    public AimPivot(Pivot pivot, Supplier<Double> angleFunction) {
        this.angleFunction = angleFunction;
        this.pivot = pivot;
        //makes sure pivot is not double scheduled
        addRequirements(pivot);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        double angle = angleFunction.get();
        
        pivot.setMotor(angle);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("AimPivot ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
