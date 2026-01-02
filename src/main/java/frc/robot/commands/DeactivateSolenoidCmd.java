package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Cannon;

public class DeactivateSolenoidCmd extends Command {

    private final Cannon cannon;

    public DeactivateSolenoidCmd(Cannon cannon) {
        this.cannon = cannon;
        //makes sure cannon is not double scheduled
        addRequirements(cannon);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        cannon.disableSolenoid();
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("DeactivateSolenoidCmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
