// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc810.Stronghold;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveFrontLeft;
    public static CANTalon driveFrontRight;
    public static CANTalon driveBackLeft;
    public static CANTalon driveBackRight;
    public static RobotDrive driveTankDrive;
    public static CANTalon intakeRoller;
    public static Solenoid shooterPusher;
    public static CANTalon shooterLeftCannon;
    public static CANTalon shooterRightCannon;
    public static CANTalon armHinge;
    public static CANTalon armExtender;
    public static AnalogPotentiometer armArmAngle;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveFrontLeft = new CANTalon(2);
        LiveWindow.addActuator("Drive", "FrontLeft", driveFrontLeft);
        
        driveFrontRight = new CANTalon(3);
        LiveWindow.addActuator("Drive", "FrontRight", driveFrontRight);
        
        driveBackLeft = new CANTalon(4);
        LiveWindow.addActuator("Drive", "BackLeft", driveBackLeft);
        
        driveBackRight = new CANTalon(5);
        LiveWindow.addActuator("Drive", "BackRight", driveBackRight);
        
        driveTankDrive = new RobotDrive(driveFrontLeft, driveBackLeft,
              driveFrontRight, driveBackRight);
        
        driveTankDrive.setSafetyEnabled(true);
        driveTankDrive.setExpiration(0.1);
        driveTankDrive.setSensitivity(0.5);
        driveTankDrive.setMaxOutput(1.0);

        intakeRoller = new CANTalon(6);
        LiveWindow.addActuator("Intake", "Roller", intakeRoller);
        
        shooterPusher = new Solenoid(1, 0);
        LiveWindow.addActuator("Shooter", "Pusher", shooterPusher);
        
        shooterLeftCannon = new CANTalon(7);
        LiveWindow.addActuator("Shooter", "LeftCannon", shooterLeftCannon);
        
        shooterRightCannon = new CANTalon(8);
        LiveWindow.addActuator("Shooter", "RightCannon", shooterRightCannon);
        
        armHinge = new CANTalon(9);
        LiveWindow.addActuator("Arm", "Hinge", armHinge);
        
        armExtender = new CANTalon(10);
        LiveWindow.addActuator("Arm", "Extender", armExtender);
        
        armArmAngle = new AnalogPotentiometer(0, 1.0, 0.0);
        LiveWindow.addSensor("Arm", "ArmAngle", armArmAngle);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}