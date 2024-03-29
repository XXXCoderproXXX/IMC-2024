package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.FlyWheelCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.PivotArmCommand;
import frc.robot.subsystems.ClimbSubsystem;
import frc.robot.subsystems.DriveSubsytem;
import frc.robot.subsystems.FlyWheelSubsytem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.PivotArmSubsytem;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  public final Joystick driver;
  public final PS4Controller controller;
  

  public final ClimbSubsystem climbSubsystem;
  public final IntakeSubsystem intakeSubsystem;
  public final DriveSubsytem driveSubsytem;
  public final FlyWheelSubsytem flyWheelSubsytem;
  //public final PivotArmSubsytem pivotArmSubsytem;

  

  public RobotContainer() {
    driver = new Joystick(Constants.kControls.DRIVE_JOYSTICK_ID);
    controller = new PS4Controller(Constants.kControls.DRIVE_CONTROLLER_ID);


    climbSubsystem = new ClimbSubsystem();
    intakeSubsystem = new IntakeSubsystem();
    driveSubsytem = new DriveSubsytem();
    flyWheelSubsytem = new FlyWheelSubsytem();
    //pivotArmSubsytem = new PivotArmSubsytem();

    // Configure button bindings
    configureButtonBindings();

  }

 
  private void configureButtonBindings() {
    
    new JoystickButton(controller, Constants.kControls.CONTROLLER_CLIMB_OPEN_PISTONS).onTrue(new RunCommand(() -> climbSubsystem.OpenPneumatics(), climbSubsystem));
    new JoystickButton(controller, Constants.kControls.CONTROLLER_CLIMB_CLOSE_PISTONS).onTrue(new RunCommand(() -> climbSubsystem.ClosePneumatics(), climbSubsystem));

    new JoystickButton(controller, Constants.kControls.CONTROLLER_INTAKE_BUTTON).onTrue(new IntakeCommand(intakeSubsystem, 1, false));
    new JoystickButton(controller, Constants.kControls.CONTROLLER_INTAKE_STOP).onTrue(new IntakeCommand(intakeSubsystem, 0, false));


    new JoystickButton(driver, Constants.kControls.DRIVERTRAIN_SLOWER).whileTrue(driveSubsytem.setSpeedCommand(0.5));
    new JoystickButton(driver, Constants.kControls.DRIVERTRAIN_SLOWER).whileFalse(driveSubsytem.setSpeedCommand(1));


    // Button 6 for one action Pivot Arm
    // new JoystickButton(controller, 6).whileTrue(new PivotArmCommand(pivotArmSubsytem, 0.5, true));

    // // Button 4 for second action Pivot Arm
    // new JoystickButton(controller, 4).whileTrue(new PivotArmCommand(pivotArmSubsytem, 0.5, false));

      
    new JoystickButton(driver, Constants.kControls.CONTROLLER_FLYWHEEL_START).whileTrue(new FlyWheelCommand(flyWheelSubsytem ,0.7));

    new JoystickButton(driver, 3).whileTrue(new IntakeCommand(intakeSubsystem, 0.7, false));


  }


  public Command getAutonomousCommand() {
    return null;
  }
}
