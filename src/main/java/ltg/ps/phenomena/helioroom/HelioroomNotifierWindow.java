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
public class HelioroomNotifierWindow extends PhenomenaWindow {
	
	private Helioroom hr = null;
	
	public HelioroomNotifierWindow(String windowName) {
		super(windowName);
	}

	
	@Override
	public String toXML() {
		if (hr!=null) 
			return "<updatePhenomena>" + hr.toXML() + "</updatePhenomena>";	
		return "";
	}

	
	@Override
	public void update(Phenomena p) {
		this.hr = (Helioroom) p;
	}

}
