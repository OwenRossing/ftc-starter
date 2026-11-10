package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

/**
 * Your TeleOp for the goBILDA StarterBot with mecanum wheels. Press Run in Sim (top right of Android Studio),
 * then INIT and START on the page. START_HERE.md has the robot's parts and the keyboard controls.
 */
@TeleOp(name = "My TeleOp")
public class MyTeleOp extends OpMode {

    // the StarterBot's parts
    private DcMotor leftFrontDrive, rightFrontDrive, leftBackDrive, rightBackDrive; // the four mecanum wheels
    private DcMotor intake; // the black Gecko wheels across the front, they pick balls up
    private CRServo leftIntakeServo, rightIntakeServo; // the front corners, they pull balls out of corners and flowers
    private DcMotorEx launcher; // the wheel that throws balls into the Hive
    private CRServo windmill; // pushes balls from the hopper into the launcher

    /** Runs once when you press INIT. Nothing is allowed to move yet! */
    @Override
    public void init() {
        // the names in quotes have to match the robot's config exactly
        leftFrontDrive = hardwareMap.get(DcMotor.class, "left_front_drive");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "right_front_drive");
        leftBackDrive = hardwareMap.get(DcMotor.class, "left_back_drive");
        rightBackDrive = hardwareMap.get(DcMotor.class, "right_back_drive");
        intake = hardwareMap.get(DcMotor.class, "intake");
        leftIntakeServo = hardwareMap.get(CRServo.class, "left_intake_servo");
        rightIntakeServo = hardwareMap.get(CRServo.class, "right_intake_servo");
        launcher = hardwareMap.get(DcMotorEx.class, "launcher");
        windmill = hardwareMap.get(CRServo.class, "windmillServo");

        telemetry.addLine("Ready! Press START");
    }

    /** Runs over and over after you press START, about 50 times a second */
    @Override
    public void loop() {
        // your code goes here

        telemetry.addData("Right trigger", gamepad1.right_trigger);
    }
}
