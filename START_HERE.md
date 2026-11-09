# Start here

This is a real FTC robot project. Everything you write in `TeamCode` can go on a real robot later.
Until then, you run it in a 3D sim of the BIOBUZZ field and drive the **starter bot** with a controller.

## Run your code

1. Open `TeamCode/src/main/java/org/firstinspires/ftc/teamcode/MyTeleOp.java`. That's your code.
2. At the top right of Android Studio, pick **Run in Sim** and press the green play button.
3. A page opens in your browser. Pick your OpMode, press **INIT**, then **START**, like on a real Driver Hub.
4. Plug in a controller and press any button so the page sees it. No controller? The keyboard works, it's listed on the page.

Changed your code? Press the play button again. The old sim closes, and the page reconnects on its own.

## The robot: goBILDA StarterBot

It's the robot the FTC Starter Kit builds (goBILDA 3200-2627-0003), with the same config names as the real one.

| Name in the code | What it is | What it does |
| --- | --- | --- |
| `left_drive`, `right_drive` | `DcMotor` | Each one drives the three wheels on its side. It's a tank drive, so it can't slide sideways |
| `intake` | `DcMotor` | The green Gecko wheels across the front. Positive power pulls balls in (it holds 4) |
| `left_intake_servo`, `right_intake_servo` | `CRServo` | Spinning wheels on the front corners. They pull balls out of corners and out of a flower |
| `launcher` | `DcMotorEx` | The flywheel that throws balls into the Hive. Use `setVelocity()`, in ticks per second |
| `windmill` | `CRServo` | Pushes balls from the hopper into the launcher, one about every third of a second |

How the balls move: run the intake to pull a ball in. Spin the launcher up first, then run the windmill to feed
balls into it. If the launcher isn't up to speed, the ball just falls out. About 1250 ticks/s lands a ball in the
Hive from where the robot starts.

A `CRServo` (continuous rotation servo) works like a motor: `setPower(1)` spins it one way, `-1` the other.

Like a real robot, one side's motor is mounted backwards. You'll find out what that means.

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
