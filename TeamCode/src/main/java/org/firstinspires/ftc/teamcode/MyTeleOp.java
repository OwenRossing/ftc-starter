package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Your TeleOp for the starter bot. Press Run in Sim (top right of Android Studio), then INIT and START on
 * the page. START_HERE.md has the robot's parts and the keyboard controls.
 */
@TeleOp(name = "My TeleOp")
public class MyTeleOp extends OpMode {

    // the starter bot's parts
    private DcMotor frontLeft, frontRight, backLeft, backRight; // the four wheels
    private DcMotor intake; // the roller across the front, it picks balls up
    private DcMotor shooter; // the flywheel on top
    private Servo gate; // between the intake and the shooter. 0 = shut, 1 = open

    /** Runs once when you press INIT. Nothing is allowed to move yet! */
    @Override
    public void init() {
        // the names in quotes have to match the robot's config exactly
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        intake = hardwareMap.get(DcMotor.class, "intake");
        shooter = hardwareMap.get(DcMotor.class, "shooter");
        gate = hardwareMap.get(Servo.class, "gate");

        telemetry.addLine("Ready! Press START");
    }

    /** Runs over and over after you press START, about 50 times a second */
    @Override
    public void loop() {
        // your code goes here

        telemetry.addData("Right trigger", gamepad1.right_trigger);
    }
}
