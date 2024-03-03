package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PivotArmSubsytem;

public class PivotArmCommand extends Command{
    
    public double speed;
    public boolean isMovingUp;
    private PivotArmSubsytem pivotArmSubsytem;
    public PivotArmCommand(double speed, boolean isMovingUp){
        this.speed = speed;
        this.isMovingUp = isMovingUp;
    }

    @Override
    public void initialize() {
       pivotArmSubsytem = new PivotArmSubsytem();

    }

    @Override
    public void execute(){
        pivotArmSubsytem.PivotArmMove(speed, isMovingUp);
    }

    public void Stop(){
        pivotArmSubsytem.Stop();
    }
}
