package frc.robot;


/**
 * This class contains values that remain constant while the robot is running.
 * 
 * It's split into categories using subclasses, preventing too many members from
 * being defined on one class.
 */
public class Constants {
  /** All joystick, button, and axis IDs. */
  public static class kControls {
    

    public static final int DRIVE_JOYSTICK_ID = 0;
    public static final int DRIVE_CONTROLLER_ID = 1;

    public static final int JOYSTICK_CLIMB_OPEN_PISTONS = 6;
    public static final int JOYSTICK_CLIMB_CLOSE_PISTONS = 4;


    public static final int CONTROLLER_INTAKE_BUTTON = 2;
    public static final int CONTROLLER_INTAKE_STOP = 11;

    public static final int CONTROLLER_FLYWHEEL_START = 5;

    public static final int DRIVERTRAIN_SLOWER = 1;

    public static final int CONTROLLER_PIVOT_ARM_UP = 11;
    public static final int CONTROLLER_PIVOT_ARM_DOWN = 12;

    


    
  }

  public static class kIntake{
    public static final int M_INTAKE_PORT = 0;
  }

  public static class kPneumatics {

    public static final int DOUBLE_SOLENOID_RIGHT_FORWARD = 0;
    public static final int DOUBLE_SOLENOID_RIGHT_REVERSE = 1;

    public static final int DOUBLE_SOLENOID_LEFT_FORWARD = 2;
    public static final int DOUBLE_SOLENOID_LEFT_REVERSE = 3;
  }

  public static class kFlyWheel{

    public static int M_INTAKE_TOP = 7;
    public static int M_INTAKE_BOTTOM = 8;

  }

  public static class kPivotArm{
    
    public static final int M_TOUGHBOX_LEFT_1 = 0;
    public static final int M_TOUGHBOX_LEFT_2 = 0;
    public static final int M_TOUGHBOX_RIGHT_1 = 0;
    public static final int M_TOUGHBOX_RIGHT_2 = 0;

  }

  public static class kDrivetrain {

    public static final int kLeftFrontMotor = 0;
    public static final int kLeftRearMotor = 1;
    public static final int kRightFrontMotor = 2;
    public static final int kRightRearMotor = 3;

    public static final double linear_SlewRateLimit = 0.2;
    public static final double turn_SlewRateLimit = 0.2;

    public static double kspeedlimitConstant = 1;
  }
}
