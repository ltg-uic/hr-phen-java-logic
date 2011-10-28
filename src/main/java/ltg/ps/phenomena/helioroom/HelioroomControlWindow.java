/*
 * Created Apr 26, 2011
 */
package ltg.ps.phenomena.helioroom;

import ltg.ps.api.phenomena.Phenomena;
import ltg.ps.api.phenomena.PhenomenaWindow;

/**
 * TODO Description
 *
 * @author Gugo
 */
public class HelioroomControlWindow extends PhenomenaWindow {
	
	private Helioroom hr = null;
	
	public HelioroomControlWindow(String windowName) {
		super(windowName);
	}

	
	@Override
	public String toXML() {
		if (hr!=null)
			return hr.toXML();
		return "";
	}

	
	@Override
	public void update(Phenomena p) {
		this.hr = (Helioroom) p;
	}

}
