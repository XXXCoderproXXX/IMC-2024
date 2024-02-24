package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class IntakeSubsystem extends SubsystemBase {

   private final WPI_TalonSRX m_intake = new WPI_TalonSRX(Constants.kIntake.M_INTAKE_PORT);

   public IntakeSubsystem(){
        m_intake.configFactoryDefault();
   }

   public void SetMotor(double speed,boolean isReversed){

    if (!isReversed) {
        m_intake.set(ControlMode.PercentOutput, speed);
    }
    else{
        m_intake.set(ControlMode.PercentOutput, -speed);
    }


   }

   public void Stop(){                  
        m_intake.set(0);
   }

   

}
