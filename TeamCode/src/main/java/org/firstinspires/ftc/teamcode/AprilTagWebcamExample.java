package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisms.AprilTagWebcam;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;

@Autonomous
public class AprilTagWebcamExample extends OpMode {
    AprilTagWebcam aprilTagWebcam = new AprilTagWebcam();

    @Override
    public void init() {
        aprilTagWebcam.init(hardwareMap, telemetry);
    }

    @Override
    public void loop() {
        //update the vision portal
        aprilTagWebcam.update();
        AprilTagDetection id21 = aprilTagWebcam.getTagBySpecificId(21);
        if (id21 != null) {
            telemetry.addData("id21", id21.toString());
        } else {
            telemetry.addData("id21", "Not detected");
        }
    }
}
