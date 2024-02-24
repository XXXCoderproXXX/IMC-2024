package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PivotArmSubsytem extends SubsystemBase {

  public PivotArmSubsytem() {};
  
  private final WPI_TalonSRX m_toughbox_left_1 = new WPI_TalonSRX(Constants.kPivotArm.M_TOUGHBOX_LEFT_1);
  private final WPI_TalonSRX m_toughbox_left_2 = new WPI_TalonSRX(Constants.kPivotArm.M_TOUGHBOX_LEFT_2);

  private final WPI_TalonSRX m_toughbox_right_1 = new WPI_TalonSRX(Constants.kPivotArm.M_TOUGHBOX_RIGHT_1);
  private final WPI_TalonSRX m_toughbox_right_2 = new WPI_TalonSRX(Constants.kPivotArm.M_TOUGHBOX_RIGHT_2);



  public void PivotArmUp(double speed, boolean isLeftReversed, boolean isRightReversed){

    if (isLeftReversed) {
      m_toughbox_left_1.set(ControlMode.PercentOutput, -speed);
      m_toughbox_left_2.set(ControlMode.PercentOutput, -speed);
    }
    else{
      m_toughbox_left_1.set(ControlMode.PercentOutput, speed);
      m_toughbox_left_2.set(ControlMode.PercentOutput, speed);
    }
    
    if (isRightReversed) {
      m_toughbox_right_1.set(ControlMode.PercentOutput, -speed);
      m_toughbox_right_2.set(ControlMode.PercentOutput, -speed);
    }
    else{
      m_toughbox_right_1.set(ControlMode.PercentOutput, speed);
      m_toughbox_right_2.set(ControlMode.PercentOutput, speed);
    }
  }


  public void PivotArmDown(double speed, boolean isLeftReversed, boolean isRightReversed){
    
    if (isLeftReversed) {
      m_toughbox_left_1.set(ControlMode.PercentOutput, speed);
      m_toughbox_left_2.set(ControlMode.PercentOutput, speed);
    }
    else{
      m_toughbox_left_1.set(ControlMode.PercentOutput, -speed);
      m_toughbox_left_2.set(ControlMode.PercentOutput, -speed);
    }
    
    if (isRightReversed) {
      m_toughbox_right_1.set(ControlMode.PercentOutput, speed);
      m_toughbox_right_2.set(ControlMode.PercentOutput, speed);
    }
    else{
      m_toughbox_right_1.set(ControlMode.PercentOutput, -speed);
      m_toughbox_right_2.set(ControlMode.PercentOutput, -speed);
    }
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
