package org.chloe.raspi;

import java.io.IOException;
import com.pi4j.system.SystemInfo;

public class Raspberry_Pi {
	
	// Hardware Info variables
	String piCpuArchitecture = null;
	String piSerialNumber = null;
	String piProcessor = null;
	
	public Raspberry_Pi()  {
		try {
			piCpuArchitecture = SystemInfo.getCpuArchitecture();
			piSerialNumber = SystemInfo.getSerial();
			piProcessor = SystemInfo.getProcessor();
		} catch (IOException | InterruptedException e) {
			System.out.println("--> Error getting system info...");
			e.printStackTrace();
		}

	}
	
	
	public void displayHardwareInfo() {
		
	}
	
	/*
	 * Returns the Raspberry Pi Hardware version:
	 * 1. Raspberry Pi - Model A
	 * 2. Raspberry Pi - Model B (rev 1)
	 * 3. Raspberry Pi - Model B (rev 2)
	 * 4. Raspberry Pi - Model A+
	 * 5. Raspberry Pi - Model B+
	 * 6. Raspberry Pi - Compute Module
	 * 7. Raspberry Pi 2 - Model B
	 */
	public String getPiVersion() throws IOException, InterruptedException {
		String piVersion = null;
		
		// TODO: implement version check
		
		
		return piVersion;
	
	}
	
	

}
