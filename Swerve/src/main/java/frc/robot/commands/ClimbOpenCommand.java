package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimbSubsystem;


public class ClimbOpenCommand extends Command{
    
    
    private ClimbSubsystem climbSubsystem;
    public ClimbOpenCommand(){
        
    }

    @Override
    public void initialize() {
        climbSubsystem = new ClimbSubsystem();
        

    }

    @Override
    public void execute(){
        climbSubsystem.OpenPneumatics();
    }

    
}
