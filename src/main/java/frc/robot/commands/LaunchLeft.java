package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PneumaticSubsystem;

public class LaunchLeft extends Command {
    
    private PneumaticSubsystem pneumaticSubsystem;

    public LaunchLeft(PneumaticSubsystem pneumaticSub) {
        pneumaticSubsystem = pneumaticSub;
        addRequirements(pneumaticSubsystem);
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        pneumaticSubsystem.activateSolenoid(1);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Left side launched");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
