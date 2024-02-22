package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClimbSubsystem extends SubsystemBase {

  public ClimbSubsystem() {};

  private final DoubleSolenoid doubleSolenoid_left = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.kPneumatics.DOUBLE_SOLENOID_LEFT_FORWARD,
  Constants.kPneumatics.DOUBLE_SOLENOID_LEFT_REVERSE);
  private final DoubleSolenoid doubleSolenoid_right = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.kPneumatics.DOUBLE_SOLENOID_RIGHT_FORWARD, 
  Constants.kPneumatics.DOUBLE_SOLENOID_RIGHT_REVERSE);

  public void OpenPneumatics() {
  
      System.out.println("Pistons Opened");
      doubleSolenoid_left.set(DoubleSolenoid.Value.kForward);
      doubleSolenoid_right.set(DoubleSolenoid.Value.kForward);
          
        
  }

  public void ClosePneumatics() {

      System.out.println("Pistons Closed");
      doubleSolenoid_left.set(DoubleSolenoid.Value.kReverse);
      doubleSolenoid_right.set(DoubleSolenoid.Value.kReverse);

  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
