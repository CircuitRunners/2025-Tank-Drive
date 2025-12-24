package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PneumaticSubsystem;

public class DeactivateSolenoid extends Command {
    
    private PneumaticSubsystem pneumaticSubsystem;

    public DeactivateSolenoid(PneumaticSubsystem pneumaticSub) {
        pneumaticSubsystem = pneumaticSub;
        addRequirements(pneumaticSubsystem);
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        pneumaticSubsystem.disableSolenoid();
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Solenoid deactivated");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
