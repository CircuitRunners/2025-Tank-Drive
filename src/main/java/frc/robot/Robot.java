// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;

/**
 * The methods in this class are called automatically corresponding to each mode, as described in
 * the TimedRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the Main.java file in the project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  private VictorSPX leftMotor1 = new VictorSPX(0);
  private VictorSPX leftMotor2 = new VictorSPX(1);
  private VictorSPX rightMotor1 = new VictorSPX(2);
  private VictorSPX rightMotor2 = new VictorSPX(3);
  private Joystick joy1 = new Joystick(0);

  private double startTime;



  public Robot() {}

private double startTime;
  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
    startTime = Timer.getFPGATimestamp();
  }

  @Override
  public void autonomousPeriodic() {

    double time = Timer.getFPGATimestamp();
    if(time - startTime < 3){
    leftMotor1.set(0.6);
    leftMotor2.set(0.6);
    rightMotor1.set(-0.6);
    rightMotor2.set(-0.6);
    }
    else{
    leftMotor1.set(0);
    leftMotor2.set(0);
    rightMotor1.set(0);
    rightMotor2.set(0);
    }
  }

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    double speed = -joy1.getRawAxis(1) * 0.6;
    double turn = joy1.getRawAxis(4) * 0.3;
    
    double left = speed + turn;
    double right = speed - turn;

    leftMotor1.set(left);
    leftMotor2.set(left);
    rightMotor1.set(-right);
    rightMotor2.set(-right);
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
