/* 
 * GPIO control for:
 * Raspberry Pi - Model A
 * Raspberry Pi - Model B (Rev 1)
 * Raspberry Pi - Model B (Rev 2)
 * Raspberry Pi - Model B+
 */
package org.chloe.raspi;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class Raspi_Gpio_Control extends Raspberry_Pi {
	
	/*
	 * Using abstract pin numbering scheme same as
	 * PI4J and WiringPi found here:
	 * http://wiringpi.com/pins/
	 */

	final GpioController gpio;
	
	final GpioPinDigitalOutput pin_00;
	final GpioPinDigitalOutput pin_01;
	final GpioPinDigitalOutput pin_02;
	final GpioPinDigitalOutput pin_03;
	final GpioPinDigitalOutput pin_04;
	final GpioPinDigitalOutput pin_05;
	final GpioPinDigitalOutput pin_06;
	final GpioPinDigitalOutput pin_07;

	
	public Raspi_Gpio_Control() {
		
		System.out.println("Loading GPIO Instance");
		
        // create gpio controller
        gpio = GpioFactory.getInstance();
        
        // provision gpio pin #00 to pin #07 as an output pin
        pin_00 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, PinState.HIGH);
        pin_01 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, PinState.HIGH);
        pin_02 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, PinState.HIGH);
        pin_03 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, PinState.HIGH);
        pin_04 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, PinState.HIGH);
        pin_05 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, PinState.HIGH);
        pin_06 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, PinState.HIGH);
        pin_07 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, PinState.HIGH);
		
	}
	
	// toggle #pin HIGH
	public void toggleON(boolean GPIO_00, boolean GPIO_01, boolean GPIO_02,
			boolean GPIO_03, boolean GPIO_04, boolean GPIO_05, boolean GPIO_06,
			boolean GPIO_07) {
		
		if (GPIO_00 == true) {
			pin_00.high();
		}
		
		if (GPIO_01 == true) {
			pin_01.high();
		}
		
		if (GPIO_02 == true) {
			pin_02.high();
		}
		
		if (GPIO_03 == true) {
			pin_03.high();
		}
		
		if (GPIO_04 == true) {
			pin_04.high();
		}
		
		if (GPIO_05 == true) {
			pin_05.high();
		}
		
		if (GPIO_06 == true) {
			pin_06.high();
		}
		
		if (GPIO_07 == true) {
			pin_07.high();
		}
		
	}
	
	// stop all GPIO activity/threads by shutting down the GPIO controller
	public void releaseController() {
		gpio.shutdown();
	}
	
	
	

}
