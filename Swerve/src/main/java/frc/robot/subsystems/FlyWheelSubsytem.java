package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class FlyWheelSubsytem extends SubsystemBase {

  private final WPI_TalonSRX m_intake_top = new WPI_TalonSRX(Constants.kFlyWheel.M_INTAKE_TOP);
  private final WPI_TalonSRX m_intake_bottom = new WPI_TalonSRX(Constants.kFlyWheel.M_INTAKE_BOTTOM);

  public FlyWheelSubsytem() {

      m_intake_bottom.configFactoryDefault();
      m_intake_top.configFactoryDefault();
  };

  

  //Alttaki ters 

  public void Shoot(double speed){
    m_intake_top.set(ControlMode.PercentOutput,speed);
    m_intake_bottom.set(ControlMode.PercentOutput, -speed);
  }

  public void StopShooter(){
    m_intake_top.set(ControlMode.PercentOutput, 0);
    m_intake_bottom.set(ControlMode.PercentOutput, 0);
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
