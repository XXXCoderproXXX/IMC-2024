package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommand extends Command{
    
    public double motorSpeed;
    public boolean isReversed;
    private IntakeSubsystem intakeSubsystem;
    public IntakeCommand(double motorspeed, boolean isReversed){
        this.motorSpeed = motorspeed;
        this.isReversed = isReversed;
    }

    @Override
    public void initialize() {
        intakeSubsystem = new IntakeSubsystem();
        

    }

    @Override
    public void execute(){
        intakeSubsystem.SetMotor(motorSpeed, isReversed);
    }

    public void Stop(){
        intakeSubsystem.Stop();
    }
}
