package main.java.frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CannonConstants;


public class CannonSubsystem extends SubsystemBase{
    public CannonSubsystem()
    {

    }

    public void periodic() {

    }

    private final DoubleSolenoid solenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, CannonConstants.doubleSolenoidPort1, CannonConstants.doubleSolenoidPort2);

    public void activateSolenoid(int channel) {
        if (channel == 0) {
            solenoid.set(DoubleSolenoid.Value.kReverse);
        } else if (channel == 1) {
            solenoid.set(DoubleSolenoid.Value.kForward);
        }

    }

    public void deactivateSolenoid() {
        solenoid.set(DoubleSolenoid.Value.kOff);

    }


}
