# Start here

This is a real FTC robot project. Everything you write in `TeamCode` can go on a real robot later.
Until then, you run it in a 3D sim of the BIOBUZZ field and drive the **starter bot** with a controller.

## Run your code

1. Open `TeamCode/src/main/java/org/firstinspires/ftc/teamcode/MyTeleOp.java`. That's your code.
2. At the top right of Android Studio, pick **Run in Sim** and press the green play button.
3. A page opens in your browser. Pick your OpMode, press **INIT**, then **START**, like on a real Driver Hub.
4. Plug in a controller and press any button so the page sees it. No controller? The keyboard works, it's listed on the page.

Changed your code? Press the play button again. The old sim closes, and the page reconnects on its own.

## The starter bot

| Name in the code | What it is | What it does |
| --- | --- | --- |
| `frontLeft`, `frontRight`, `backLeft`, `backRight` | `DcMotor` | The four mecanum wheels |
| `intake` | `DcMotor` | The roller across the front. Forward picks balls up off the floor (it holds 4) |
| `shooter` | `DcMotor` | The flywheel on top. It fires forward, the way the robot faces |
| `gate` | `Servo` | Between the intake and the shooter. `0` is shut, `1` is open |

How the balls move: the intake pulls a ball in. With the gate open and the intake still running, balls go up into
the shooter, one about every third of a second. Spin the shooter up first, or the ball just falls out.

Like a real robot, the motors on the left side are mounted backwards. You'll find out what that means.

## When something goes wrong

- **Red text on the page** means your code crashed. Read the line that starts with `HINT`, then the line number.
- **Yellow warnings** are things a real robot would get in trouble for, like moving during INIT.
- **Red squiggles in Android Studio** mean it won't compile. Hover over them to see why.

---

## For mentors: setting up a laptop

1. Install Android Studio (it brings its own Java).
2. Clone with the sim included:
   ```
   git clone --recurse-submodules <this repo's URL>
   ```
   Already cloned without it? Run `git submodule update --init` in the repo.
3. Open the folder in Android Studio and let Gradle sync finish.
4. Pick **Run in Sim** and press play once, so it downloads what it needs (needs internet the first time).

To get a newer sim later: `git submodule update --remote sim`, then commit the change so every laptop gets it.
The robot itself is set in `sim.properties`.
