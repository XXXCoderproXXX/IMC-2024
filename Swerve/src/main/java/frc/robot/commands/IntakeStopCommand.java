package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeStopCommand extends Command{

    private IntakeSubsystem intakeSubsystem;
    public IntakeStopCommand(){
       
    }
    @Override
    public void initialize() {
        
    }

    @Override
    public void execute(){
        intakeSubsystem.Stop();
    }

    public void Stop(){
        intakeSubsystem.Stop();
    }
}
