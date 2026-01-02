package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Cannon extends SubsystemBase {
    
    public Cannon() {}
    
    private final DoubleSolenoid solenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.CannonConstants.doubleSolenoidPort1, Constants.CannonConstants.doubleSolenoidPort2);

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    public void activateSolenoid(int channel) {
        if (channel == 0) {
            solenoid.set(DoubleSolenoid.Value.kForward);
        } else if (channel == 1) {
            solenoid.set(DoubleSolenoid.Value.kReverse);
        }
    }

    public void disableSolenoid() {
        solenoid.set(DoubleSolenoid.Value.kOff);
    }
}
