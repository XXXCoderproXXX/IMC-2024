package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FlyWheelSubsytem;

public class FlyWheelCommand extends Command{
    
    
    private FlyWheelSubsytem flyWheelSubsytem;
    public double motorSpeed;
    public FlyWheelCommand(FlyWheelSubsytem subsystem, double speed){
        this.motorSpeed = speed;
        this.flyWheelSubsytem = subsystem;
        addRequirements(flyWheelSubsytem);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute(){
        flyWheelSubsytem.Shoot(motorSpeed);
    }

    @Override
    public void end(boolean interrupted) 
    {
        flyWheelSubsytem.Shoot(0.0);
    }
   
}
