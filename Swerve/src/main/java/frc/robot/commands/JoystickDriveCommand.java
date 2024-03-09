// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsytem;

public class JoystickDriveCommand extends Command {

  private DriveSubsytem driveSubsytem;
  private double turnCoeff;
  private double linearCoeff;
  private final Supplier<Double> linearFunc, turnFunc;
  private double realTimeLinear;
  private double realTimeTurn;

  /** Creates a new JoystickDriveCommand. */
  public JoystickDriveCommand(DriveSubsytem drive, Supplier<Double> linearFunction, Supplier<Double> turnFunction, double turnCoef, double linearCoef) {
    // Use addRequirements() here to declare subsystem dependencies.

    this.driveSubsytem = drive;
    this.turnCoeff = turnCoef;
    this.linearCoeff = linearCoef;
    this.turnFunc = turnFunction;
    this.linearFunc = linearFunction;

    addRequirements(driveSubsytem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    realTimeLinear = 0;
    realTimeTurn = 0;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    realTimeLinear = linearFunc.get();
    realTimeTurn = turnFunc.get();

    driveSubsytem.drive(realTimeTurn * turnCoeff, realTimeLinear * linearCoeff);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveSubsytem.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
