package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class FlyWheelSubsytem extends SubsystemBase {

  private final CANSparkMax m_flywheel_top = new CANSparkMax(Constants.kFlyWheel.M_INTAKE_TOP, MotorType.kBrushless);
  private final CANSparkMax m_flywheel_bottom = new CANSparkMax(Constants.kFlyWheel.M_INTAKE_BOTTOM, MotorType.kBrushless);
  public FlyWheelSubsytem() {

    m_flywheel_bottom.restoreFactoryDefaults();
    m_flywheel_top.restoreFactoryDefaults();
  };
  //Alttaki ters 
  public void Shoot(double speed){
    m_flywheel_top.set(speed);
    m_flywheel_bottom.set(-speed);
    
  }

  public void StopShooter(){
    m_flywheel_bottom.set(0);
    m_flywheel_top.set(0);
    
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
