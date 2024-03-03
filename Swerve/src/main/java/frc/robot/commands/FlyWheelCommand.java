package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FlyWheelSubsytem;

public class FlyWheelCommand extends Command{
    
    
    private FlyWheelSubsytem flyWheelSubsytem;
    public double motorSpeed;
    public FlyWheelCommand(double speed){
        this.motorSpeed = speed;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute(){
        flyWheelSubsytem.Shoot(motorSpeed);
    }

   
}
