package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PneumaticSubsystem;

public class LaunchShooter extends Command {
    
    private PneumaticSubsystem pneumaticSubsystem;
    private int channelToLaunch;

    public LaunchShooter(PneumaticSubsystem pneumaticSub, int channel) {
        pneumaticSubsystem = pneumaticSub;
        channelToLaunch = channel;
        addRequirements(pneumaticSubsystem);
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        pneumaticSubsystem.activateSolenoid(channelToLaunch);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Channel " + channelToLaunch + " launched");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
