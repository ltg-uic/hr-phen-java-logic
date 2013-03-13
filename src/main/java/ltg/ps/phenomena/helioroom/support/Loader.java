/*
 * Created Jan 18, 2011
 */
package ltg.ps.phenomena.helioroom.support;

import ltg.ps.phenomena.PhenomenaDebugger;

/**
 * TODO Description
 *
 * @author Gugo
 */
public class Loader {

	public static void main(String[] args) {
		// Configure the phenomena debugger
		PhenomenaDebugger.configure("ps_dev@54.243.60.48", "ps_dev");
		// Start the debugger
		PhenomenaDebugger.debug("target/helioroom-0.1.jar");
	}

}
