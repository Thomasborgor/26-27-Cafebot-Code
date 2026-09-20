package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Test extends LinearOpMode {

    private DcMotor thing = null;

    public void runOpMode() {
        telemetry.addLine("Hello!");
        telemetry.update();
    }
}
