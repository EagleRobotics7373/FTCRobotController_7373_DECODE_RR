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
        AprilTagDetection id22 = aprilTagWebcam.getTagBySpecificId(22);
        AprilTagDetection id23 = aprilTagWebcam.getTagBySpecificId(23);
        if (id21 != null) {
            telemetry.addData("id21", id21.toString());
            telemetry.addData("Tag 21 X", id21.ftcPose.x);
            telemetry.addData("Tag 21 Y", id21.ftcPose.y);
            telemetry.addData("Tag 21 Z", id21.ftcPose.z);
        } else {
            telemetry.addData("id21", "Not detected");
        }
        if (id22 != null) {
            telemetry.addData("id22", id22.toString());
            telemetry.addData("Tag 22 X", id22.ftcPose.x);
            telemetry.addData("Tag 22 Y", id22.ftcPose.y);
            telemetry.addData("Tag 22 Z", id22.ftcPose.z);
        } else {
            telemetry.addData("id22", "Not detected");
        }
        if (id21 != null) {
            telemetry.addData("id23", id23.toString());
            telemetry.addData("Tag 23 X", id23.ftcPose.x);
            telemetry.addData("Tag 23 Y", id23.ftcPose.y);
            telemetry.addData("Tag 23 Z", id23.ftcPose.z);
        } else {
            telemetry.addData("id23", "Not detected");
        }

    }
}
