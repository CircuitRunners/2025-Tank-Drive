package main.java.frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PivotSubsystem;

public class MovePivot extends Command {

    private final PivotSubsystem pivotSubsystem;
    private final Supplier<Double> angleSupplier;

    public MovePivot(PivotSubsystem pivotSubsystem, Supplier<Double> angleSupplier){
        this.angleSupplier = angleSupplier;
        this.pivotSubsystem = pivotSubsystem;
    }

    

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
    
}
