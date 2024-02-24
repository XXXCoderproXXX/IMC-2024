package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ExampleSubsytem;
import frc.robot.subsystems.IntakeSubsystem;

public class ExampleCommand extends Command{
    
    public double motorSpeed;
    public boolean isReversed;
    private ExampleSubsytem exampleSubsytem;
    public ExampleCommand(double motorspeed, boolean isReversed){
        this.motorSpeed = motorspeed;
        this.isReversed = isReversed;
    }

    @Override
    public void initialize() {
        exampleSubsytem = new ExampleSubsytem();
        

    }

    @Override
    public void execute(){
        System.out.println("CIM CIM CIM");
        exampleSubsytem = new ExampleSubsytem();
        exampleSubsytem.SetMotor(motorSpeed, isReversed);
    }

    public void end(){
                exampleSubsytem = new ExampleSubsytem();

        exampleSubsytem.Stop();
    }
}
