package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.Command;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class ExampleSubsytem extends SubsystemBase {

   private final WPI_TalonSRX m_example = new WPI_TalonSRX(5);

   public ExampleSubsytem(){
        m_example.configFactoryDefault();
   }

   public void SetMotor(double speed,boolean isReversed){

    if (!isReversed) {
        m_example.set(ControlMode.PercentOutput, speed);
    }
    else{
        m_example.set(ControlMode.PercentOutput, -speed);
    }


   }

   public void Stop(){                  
        m_example.set(0);
   }

   public Command setMotor(double speed, boolean isReversed){
    return this.run(()->     
        m_example.set(ControlMode.PercentOutput, speed)

    );
   }

}
