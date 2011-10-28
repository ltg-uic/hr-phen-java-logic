/*
 * Created Jan 18, 2011
 */
package ltg.ps.phenomena.helioroom;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import ltg.ps.api.phenomena.Phenomena;
import ltg.ps.api.phenomena.PhenomenaWindow;

/**
 * TODO Description
 *
 * @author Gugo
 */
public class HelioroomWindow extends PhenomenaWindow {
	
	private Helioroom hr = null;
	private int viewAngleBegin = -1;
	private int viewAngleEnd = -1;
	
	
	public HelioroomWindow(String windowName, int viewAngleBegin, int viewAngleEnd) {
		super(windowName);
		this.viewAngleBegin = viewAngleBegin;
		this.viewAngleEnd = viewAngleEnd;
	}

	
	@Override
	public void update(Phenomena p) {
		this.hr = (Helioroom) p;
	}

	
	@Override
	public String toXML() {
		Element root = DocumentHelper.createElement("helioroom");
		root.addElement("viewAngleBegin").addText(String.valueOf(viewAngleBegin));
		root.addElement("viewAngleEnd").addText(String.valueOf(viewAngleEnd));
		root.addElement("planetRepresentation").addText(String.valueOf(hr.getPlanetRepresentation()));
		root.addElement("planetNames").addText(String.valueOf(hr.getPlanetNames()));
		root.addElement("state").addText(String.valueOf(hr.getState()));
		root.addElement("startTime").addText(String.valueOf(hr.getStartTime()));
		Element plans = DocumentHelper.createElement("planets");
		Element e = null;
		for (Planet p: hr.getPlanets()){
			e = DocumentHelper.createElement("planet");
			e.addElement("name").addText(p.getName());
			e.addElement("color").addText(p.getColor());
			e.addElement("colorName").addText(p.getColorName());
			e.addElement("classOrbitalTime").addText(String.valueOf(p.getClassOrbitalTime()));
			e.addElement("startPosition").addText(String.valueOf(p.getStartPosition()));
			plans.add(e);
		}
		root.add(plans);
		if (hr!=null) 
			return hr.removeXMLDeclaration(DocumentHelper.createDocument(root));
		return "";	
	}


	public int getViewAngleBegin() {
		return viewAngleBegin;
	}


	public int getViewAngleEnd() {
		return viewAngleEnd;
	}

}
