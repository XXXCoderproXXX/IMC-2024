package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
<<<<<<< Updated upstream
import frc.robot.commands.ClimbCloseCommand;
import frc.robot.commands.ClimbOpenCommand;
import frc.robot.commands.FlyWheelCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.IntakeStopCommand;
import frc.robot.commands.PivotArmCommand;
import frc.robot.commands.PivotArmStopCommand;
import frc.robot.subsystems.ClimbSubsystem;
import frc.robot.subsystems.DriveSubsytem;
import frc.robot.subsystems.IntakeSubsystem;
=======
import frc.robot.commands.DriveWithConstantSpeedCommand;
import frc.robot.commands.JoystickDriveCommand;
import frc.robot.commands.OpenClimbCommand;
import frc.robot.commands.ClimbCommand;
import frc.robot.subsystems.ClimbSubsystem;
import frc.robot.subsystems.DriveSubsytem;
>>>>>>> Stashed changes


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
  public final DriveSubsytem driveSubsytem;

  

  public RobotContainer() {
    driver = new Joystick(Constants.kControls.DRIVE_JOYSTICK_ID);
    controller = new PS4Controller(Constants.kControls.DRIVE_CONTROLLER_ID);


    climbSubsystem = new ClimbSubsystem();
    driveSubsytem = new DriveSubsytem();
<<<<<<< Updated upstream

    // Configure button bindings
=======
>>>>>>> Stashed changes
    configureButtonBindings();

  }

 
  private void configureButtonBindings() {
    
<<<<<<< Updated upstream
    new JoystickButton(controller, Constants.kControls.CONTROLLER_CLIMB_OPEN_PISTONS).onTrue(new ClimbOpenCommand());
    new JoystickButton(controller, Constants.kControls.CONTROLLER_CLIMB_CLOSE_PISTONS).onTrue(new ClimbCloseCommand());

    new JoystickButton(controller, Constants.kControls.CONTROLLER_INTAKE_BUTTON).onTrue(new IntakeCommand(0.8, false));
    new JoystickButton(controller, Constants.kControls.CONTROLLER_INTAKE_STOP).onTrue(new IntakeCommand(0.5, true));


    new JoystickButton(driver, Constants.kControls.DRIVERTRAIN_SLOWER).whileTrue(driveSubsytem.setSpeedCommand(0.5));
    new JoystickButton(driver, Constants.kControls.DRIVERTRAIN_SLOWER).whileFalse(driveSubsytem.setSpeedCommand(1));


    // Button 6 for one action Pivot Arm
    // new JoystickButton(controller, 6).whileTrue(new PivotArmCommand(0.5, true));
    // new JoystickButton(controller, 6).whileFalse(new PivotArmStopCommand());

    // // Button 4 for second action Pivot Arm
    // new JoystickButton(controller, 4).whileTrue(new PivotArmCommand(0.5, false));
    // new JoystickButton(controller, 4).whileFalse(new PivotArmStopCommand());
=======
    new JoystickButton(driver, Constants.kControls.CONTROLLER_CLIMB_OPEN_PISTONS).whileTrue(new OpenClimbCommand(climbSubsystem, doubleSolenoid_left, doubleSolenoid_right));
    new JoystickButton(driver, Constants.kControls.CONTROLLER_CLIMB_CLOSE_PISTONS).whileTrue(new ClimbCommand(climbSubsystem, doubleSolenoid_left, doubleSolenoid_right));
>>>>>>> Stashed changes

      
<<<<<<< Updated upstream
    new JoystickButton(driver, Constants.kControls.CONTROLLER_FLYWHEEL_START).whileTrue(new FlyWheelCommand(0.7));

    new JoystickButton(driver, 3).whileTrue(new IntakeCommand(0.7, false));
    new JoystickButton(driver, 3).whileFalse(new IntakeStopCommand());


  }


  public Command getAutonomousCommand() {
    return null;
=======
  }

  private void defaultCommands() { 
    driveSubsytem.setDefaultCommand(new JoystickDriveCommand(driveSubsytem, () -> -driver.getY(), () -> driver.getZ(), 0.6f, 0.8f));
  }

  public Command getAutonomousCommand() {
    return new SequentialCommandGroup(
      new DriveWithConstantSpeedCommand(driveSubsytem, 0.5)).raceWith(new WaitCommand(1.2));
>>>>>>> Stashed changes
  }
}
