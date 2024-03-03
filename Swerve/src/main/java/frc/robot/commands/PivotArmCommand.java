package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PivotArmSubsytem;

public class PivotArmCommand extends Command{
    
    public double speed;
    public boolean isMovingUp;
    private PivotArmSubsytem pivotArmSubsytem;
    public PivotArmCommand(PivotArmSubsytem arm, double speed, boolean isMovingUp){
        this.speed = speed;
        this.isMovingUp = isMovingUp;
        this.pivotArmSubsytem = arm;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute(){
        pivotArmSubsytem.PivotArmMove(speed, isMovingUp);
    }

    @Override
    public void end(boolean interrupted) 
    {
        pivotArmSubsytem.Stop();
    }
}
