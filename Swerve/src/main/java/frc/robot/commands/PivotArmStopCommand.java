package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PivotArmSubsytem;

public class PivotArmStopCommand extends Command{
    
 
    private PivotArmSubsytem pivotArmSubsytem;
    public PivotArmStopCommand(){
        
    }

    @Override
    public void initialize() {
       pivotArmSubsytem = new PivotArmSubsytem();

    }

    @Override
    public void execute(){
        pivotArmSubsytem.Stop();
    }

    public void Stop(){
        
    }
}
