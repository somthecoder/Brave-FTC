package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@TeleOp(name = "TeleOP Test", group = "test")
public class TeleOpTest_Iterative extends LinearOpMode {

    private DcMotor backLeftMotor;
    private DcMotor backRightMotor;



    @Override
    public void runOpMode() throws InterruptedException {

        //initialize motors
        backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor");
        backRightMotor = hardwareMap.dcMotor.get("backRightMotor");

        // prevents robot from spinning in circles
        backLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive()) {

            // Binds motors to gamepad controller
            backLeftMotor.setPower(gamepad1.left_stick_y);
            backRightMotor.setPower(-gamepad1.right_stick_y);

            idle();
        }

    }
}

