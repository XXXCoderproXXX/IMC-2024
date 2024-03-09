// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

<<<<<<< Updated upstream
import com.kauailabs.navx.frc.AHRS;
=======
// import com.revrobotics.CANEncoder;
>>>>>>> Stashed changes
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkBase.IdleMode;;

public class DriveSubsytem extends SubsystemBase {

<<<<<<< Updated upstream
  

  private CANSparkMax m_leftFrontMotor = new CANSparkMax(Constants.kDrivetrain.kLeftFrontMotor, MotorType.kBrushless);
  // private CANSparkMax m_leftRearMotor = new CANSparkMax(Constants.kDrivetrain.kLeftRearMotor, MotorType.kBrushless);
  private CANSparkMax m_rightFrontMotor = new CANSparkMax(Constants.kDrivetrain.kRightFrontMotor, MotorType.kBrushless);
  // private CANSparkMax m_rightRearMotor = new CANSparkMax(Constants.kDrivetrain.kRightRearMotor, MotorType.kBrushless);

  private DifferentialDrive m_drive = new DifferentialDrive(m_leftFrontMotor,m_rightFrontMotor);
=======
  // RelativeEncoder leftEncoder = m_leftFrontMotor.getEncoder();
  RelativeEncoder rightEncoder = m_rightFrontMotor.getEncoder();

  RelativeEncoder encoder = m_leftRearMotor.getEncoder();
>>>>>>> Stashed changes

  private DifferentialDrive m_drive = new DifferentialDrive(m_leftRearMotor, m_rightFrontMotor);

  public DriveSubsytem() {

    m_leftFrontMotor.restoreFactoryDefaults();
    // m_leftRearMotor.restoreFactoryDefaults();
    m_rightFrontMotor.restoreFactoryDefaults();
    // m_rightRearMotor.restoreFactoryDefaults();

<<<<<<< Updated upstream
    // m_leftRearMotor.follow(m_leftFrontMotor);
    // m_rightRearMotor.follow(m_rightFrontMotor);
=======
    m_leftRearMotor.getInverted();

    
    m_leftFrontMotor.follow(m_leftRearMotor);
    m_rightRearMotor.follow(m_rightFrontMotor);
>>>>>>> Stashed changes

    m_drive.setSafetyEnabled(false);
  }

  public void drive(double x, double y) {
<<<<<<< Updated upstream
    m_drive.arcadeDrive(x, y);
=======
    m_drive.arcadeDrive(x , y);
>>>>>>> Stashed changes
  }

  public void stop() {
    m_drive.arcadeDrive(0, 0);
  }

    public void brakeMotors(boolean on) {
    IdleMode mode;
    if (on) {
      mode = IdleMode.kBrake;
    } else
      mode = IdleMode.kCoast;

    m_leftFrontMotor.setIdleMode(mode);
  }
 
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
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
