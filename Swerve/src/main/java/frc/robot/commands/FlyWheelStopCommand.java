package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FlyWheelSubsytem;

public class FlyWheelStopCommand extends Command{
    
    
    private FlyWheelSubsytem flyWheelSubsytem;
    public double motorSpeed;
    public FlyWheelStopCommand(double speed){
        this.motorSpeed = speed;
    }

    @Override
    public void initialize() {
        flyWheelSubsytem = new FlyWheelSubsytem();

    }

    @Override
    public void execute(){
        flyWheelSubsytem.StopShooter();
    }

   
}
