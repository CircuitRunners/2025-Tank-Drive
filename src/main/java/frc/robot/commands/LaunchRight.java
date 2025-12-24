package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PneumaticSubsystem;

public class LaunchRight extends Command {
    
    private PneumaticSubsystem pneumaticSubsystem;

    public LaunchRight(PneumaticSubsystem pneumaticSub) {
        pneumaticSubsystem = pneumaticSub;
        addRequirements(pneumaticSubsystem);
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        pneumaticSubsystem.activateSolenoid(2);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Right Side launched");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
