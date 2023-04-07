package rs.ac.singidunum.testiranje.uvlamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UVLampTest {
    @Test
    public void switch1_ShouldChangeStateToStandBy_IfCurrentStateIsTurnedOff() {
        UVLamp lamp = new UVLamp();

        lamp.switch1(); // OFF  -> STBY

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("STBY", lamp.getScreenText())
        );
    }

    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsStandBy() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF  -> STBY

        lamp.switch1(); // STBY -> OFF

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.OFF, lamp.getLedState()),
                () -> Assertions.assertEquals("", lamp.getScreenText())
        );
    }

    @Test
    public void switch2_ShouldChangeStateToProgrammeSelection_IfCurrentStateIsStandBy() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF  -> STBY

        lamp.switch2(); // STBY -> PRSEL

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PRSEL", lamp.getScreenText())
        );
    }

    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsProgrammeSelection() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL

        lamp.switch1(); // PRSEL -> OFF

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.OFF, lamp.getLedState()),
                () -> Assertions.assertEquals("", lamp.getScreenText())
        );
    }

    @Test
    public void switch3_ShouldChangeStateToStandBy_IfCurrentStateIsProgrammeSelection() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL

        lamp.switch3(); // PRSEL -> STBY

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("STBY", lamp.getScreenText())
        );
    }

    @Test
    public void switch2_ShouldChangeStateToProgram1_IfCurrentStateIsProgrammeSelection() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL

        lamp.switch2(); // PRSEL -> PR1-READY

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PR1", lamp.getScreenText())
        );
    }

    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsProgram1Ready() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY

        lamp.switch1(); // PR1-READY -> OFF

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.OFF, lamp.getLedState()),
                () -> Assertions.assertEquals("", lamp.getScreenText())
        );
    }

    @Test
    public void switch3_ShouldChangeStateToProgrammeSelection_IfCurrentStateIsProgram1Ready() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY

        lamp.switch3(); // PR1-READY -> PRSEL

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PRSEL", lamp.getScreenText())
        );
    }

    @Test
    public void switch2_ShouldChangeStateToProgram2Ready_IfCurrentStateIsProgram1Ready() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY

        lamp.switch2(); // PR1-READY -> PR2-READY

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PR2", lamp.getScreenText())
        );
    }

    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsProgram2Ready() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch2(); // PR1-READY -> PR2-READY

        lamp.switch1(); // PR2-READY -> OFF

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.OFF, lamp.getLedState()),
                () -> Assertions.assertEquals("", lamp.getScreenText())
        );
    }

    @Test
    public void switch3_ShouldChangeStateToProgrammeSelection_IfCurrentStateIsProgram2Ready() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch2(); // PR1-READY -> PR2-READY

        lamp.switch3(); // PR2-READY -> PRSEL

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PRSEL", lamp.getScreenText())
        );
    }

    @Test
    public void switch2_ShouldChangeStateToProgram1Ready_IfCurrentStateIsProgram2Ready() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch2(); // PR1-READY -> PR2-READY

        lamp.switch2(); // PR2-READY -> PR1-READY

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PR1", lamp.getScreenText())
        );
    }

    @Test
    public void switch4_ShouldChangeStateToProgram1Running_IfCurrentStateIsProgram1Ready() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY

        lamp.switch4(); // PR1-READY -> PR1-RUNNING

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.BLINKING, lamp.getLedState()),
                () -> Assertions.assertEquals("PR1", lamp.getScreenText())
        );
    }

    @Test
    public void switch4_ShouldChangeStateToProgram2Running_IfCurrentStateIsProgram2Ready() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch2(); // PR1-READY -> PR2-READY

        lamp.switch4(); // PR2-READY -> PR2-RUNNING

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.BLINKING, lamp.getLedState()),
                () -> Assertions.assertEquals("PR2", lamp.getScreenText())
        );
    }

    @Test
    public void switch3_ShouldChangeStateToProgrammeSelection_IfCurrentStateIsProgram2Running() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch2(); // PR1-READY -> PR2-READY
        lamp.switch4(); // PR2-READY -> PR2-RUNNING

        lamp.switch3(); // PR2-RUNNING -> PRSEL

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PRSEL", lamp.getScreenText())
        );
    }

    @Test
    public void switch3_ShouldChangeStateToProgram1Paused_IfCurrentStateIsProgram1Running() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch4(); // PR1-READY -> PR1-RUNNING

        lamp.switch3(); // PR1-RUNNING -> PR1-PAUSED

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("PAUSE", lamp.getScreenText())
        );
    }

    @Test
    public void switch4_ShouldChangeStateToProgram1Running_IfCurrentStateIsProgram1Paused() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch4(); // PR1-READY -> PR1-RUNNING
        lamp.switch3(); // PR1-RUNNING -> PR1-PAUSED

        lamp.switch4(); // PR1-PAUSED -> PR1-RUNNING

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.BLINKING, lamp.getLedState()),
                () -> Assertions.assertEquals("PR1", lamp.getScreenText())
        );
    }

    @Test
    public void internalEvent_ShouldChangeStateToStandBy_IfCurrentStateIsProgram2Running_WhenMoreThan30SecondsPass() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch2(); // PR1-READY -> PR2-READY
        lamp.switch4(); // PR2-READY -> PR2-RUNNING

        try {
            Thread.sleep(31000);
        } catch (Exception ignore) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("STBY", lamp.getScreenText())
        );
    }

    @Test
    public void internalEvent_ShouldNotChangeStateToStandBy_IfCurrentStateIsProgram2Running_WhenLessThan30SecondsPass() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch2(); // PR1-READY -> PR2-READY
        lamp.switch4(); // PR2-READY -> PR2-RUNNING

        try {
            Thread.sleep(29000);
        } catch (Exception ignore) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.BLINKING, lamp.getLedState()),
                () -> Assertions.assertEquals("PR2", lamp.getScreenText())
        );
    }

    @Test
    public void internalEvent_ShouldChangeStateToStandBy_IfCurrentStateIsProgram1Running_WhenMoreThan60SecondsPass() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch4(); // PR1-READY -> PR1-RUNNING

        try {
            Thread.sleep(61000);
        } catch (Exception ignore) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.ON, lamp.getLedState()),
                () -> Assertions.assertEquals("STBY", lamp.getScreenText())
        );
    }

    @Test
    public void internalEvent_ShouldNotChangeStateToStandBy_IfCurrentStateIsProgram1Running_WhenLessThan60SecondsPass() {
        UVLamp lamp = new UVLamp();
        lamp.switch1(); // OFF   -> STBY
        lamp.switch2(); // STBY  -> PRSEL
        lamp.switch2(); // PRSEL -> PR1-READY
        lamp.switch4(); // PR1-READY -> PR1-RUNNING

        try {
            Thread.sleep(59000);
        } catch (Exception ignore) { }

        Assertions.assertAll(
                () -> Assertions.assertEquals(UVLamp.LED_STATE.BLINKING, lamp.getLedState()),
                () -> Assertions.assertEquals("PR1", lamp.getScreenText())
        );
    }
}
