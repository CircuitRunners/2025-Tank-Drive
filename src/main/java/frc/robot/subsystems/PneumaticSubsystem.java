package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PneumaticSubsystem extends SubsystemBase {

    // im 99% sure we use ctre
    private final Compressor compress = new Compressor(PneumaticsModuleType.CTREPCM);
    private final DoubleSolenoid solenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.PneumaticSubConstants.forwardChannel, Constants.PneumaticSubConstants.reverseChannel);

    public PneumaticSubsystem() {
        
    }

    // disable or enable compressor
    public void setCompressorState(boolean desiredState) {
        if (desiredState) {
            compress.enableDigital();
        } else {
            compress.disable();
        }
    }

    // controls which side of the solenoid releases air
    public void activateSolenoid(int channel) {
        if (channel == 1) {
            solenoid.set(DoubleSolenoid.Value.kForward);
        } else if (channel == 2) {
            solenoid.set(DoubleSolenoid.Value.kReverse);
        }
    }

    // method to stop releasing air
    public void disableSolenoid() {
        solenoid.set(DoubleSolenoid.Value.kOff);
    }

    
}
