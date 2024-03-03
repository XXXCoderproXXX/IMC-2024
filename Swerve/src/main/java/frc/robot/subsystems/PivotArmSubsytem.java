package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PivotArmSubsytem extends SubsystemBase {

  private final WPI_TalonSRX m_toughbox_left_1 = new WPI_TalonSRX(Constants.kPivotArm.M_TOUGHBOX_LEFT_1);
  private final WPI_TalonSRX m_toughbox_left_2 = new WPI_TalonSRX(Constants.kPivotArm.M_TOUGHBOX_LEFT_2);
  

 

  public PivotArmSubsytem() {
    m_toughbox_left_2.follow(m_toughbox_left_1);
    //m_toughbox_right_2.follow(m_toughbox_right_2);


  }
  
 


  public void PivotArmMove(double speed, boolean isMovingUp){
    if (isMovingUp) {
      m_toughbox_left_1.set(speed);
      //m_toughbox_right_1.set(speed);
    }
    else{
      m_toughbox_left_1.set(-speed);
      //m_toughbox_right_1.set(-speed);
    }
    
  }

  public void Stop(){
    m_toughbox_left_1.set(0);
    //m_toughbox_right_1.set(0);
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
