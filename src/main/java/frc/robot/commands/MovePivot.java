package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PivotSubsystem;

public class MovePivot extends Command {
    
    private final PivotSubsystem pivotSubsystem;
    private final Supplier<Double> pivotFunction;

    public MovePivot(PivotSubsystem pivotSub, Supplier<Double> pivotFunc) {
        pivotSubsystem = pivotSub;
        pivotFunction = pivotFunc;
        addRequirements(pivotSubsystem);
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        final double pivotAngle = pivotFunction.get();

        pivotSubsystem.movePivot(pivotAngle);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Moving Pivot command finished");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
