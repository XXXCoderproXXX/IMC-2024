package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommand extends Command{
    
    public double motorSpeed;
    public boolean isReversed;
    private IntakeSubsystem intakeSubsystem;
    public IntakeCommand(IntakeSubsystem intake ,double motorspeed, boolean isReversed){
        this.motorSpeed = motorspeed;
        this.isReversed = isReversed;
        this.intakeSubsystem = intake;
        addRequirements(intakeSubsystem);
    }

    @Override
    public void initialize() {
    
    }

    @Override
    public void execute(){
        intakeSubsystem.SetMotor(motorSpeed, isReversed);
    }

    @Override
    public void end(boolean interrupted) 
    {
        intakeSubsystem.Stop();
    }

}
