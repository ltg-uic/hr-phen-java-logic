/*
 * Created Apr 26, 2011
 */
package ltg.ps.phenomena.helioroom.commands;

import ltg.ps.api.phenomena.Phenomena;
import ltg.ps.api.phenomena.PhenomenaCommand;
import ltg.ps.api.phenomena.PhenomenaWindow;
import ltg.ps.phenomena.helioroom.Helioroom;
import ltg.ps.phenomena.helioroom.Planet;

import org.dom4j.Element;

/**
 * TODO Description
 *
 * @author Gugo
 */
public class EditPlanet extends PhenomenaCommand {
	
	private Planet modifiedPlanet = null;

	/**
	 * @param target
	 */
	public EditPlanet(Phenomena target, PhenomenaWindow origin) {
		super(target, origin);
	}

	/* (non-Javadoc)
	 * @see ltg.ps.api.Command#execute()
	 */
	@Override
	public void execute() {
		((Helioroom)target).modifyPlanet(modifiedPlanet);
	}

	/* (non-Javadoc)
	 * @see ltg.ps.api.Command#parse(org.dom4j.Element)
	 */
	@Override
	public void parse(Element xml) {
		modifiedPlanet = ((Helioroom) target).getPlanet(xml.attribute("name").getText());
		String attribute = ((Element) xml.elements().get(0)).getName();
		String value = ((Element) xml.elements().get(0)).getTextTrim();
		if (attribute.equals("color"))
			modifiedPlanet.setColor(value);
		if (attribute.equals("colorName"))
			modifiedPlanet.setColorName(value);
		if (attribute.equals("classOrbitalTime"))
			modifiedPlanet.setClassOrbitalTime(Integer.valueOf(value));
		if (attribute.equals("startPosition"))
			modifiedPlanet.setStartPosition(Double.valueOf(value));
	}


}
