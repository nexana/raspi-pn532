package be.nexana.badgesystem;

import com.pi4j.io.gpio.*;

public class LedController {
    private GpioPinDigitalOutput blueLed = null;
    private GpioPinDigitalOutput redLed = null;

    public void setup() {
        GpioController gpio = GpioFactory.getInstance();
        this.blueLed = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "BlueLed", PinState.LOW);
        this.redLed = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "RedLed", PinState.LOW);
    }

    public void blueLed() {
        this.blueLed.high();
    }

    public void redLed() {
        this.redLed.high();
    }
}
