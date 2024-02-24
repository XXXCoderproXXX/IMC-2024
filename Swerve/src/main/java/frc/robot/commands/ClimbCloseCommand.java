package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimbSubsystem;

public class ClimbCloseCommand extends Command{
    
    
    private ClimbSubsystem climbSubsystem;
    public ClimbCloseCommand(){
        
    }

    @Override
    public void initialize() {
        climbSubsystem = new ClimbSubsystem();
        

    }

    @Override
    public void execute(){
        climbSubsystem.ClosePneumatics();
    }

   
}
