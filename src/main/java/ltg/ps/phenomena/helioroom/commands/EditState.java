/*
 * Created May 22, 2011
 */
package ltg.ps.phenomena.helioroom.commands;

import ltg.ps.api.phenomena.Phenomena;
import ltg.ps.api.phenomena.PhenomenaCommand;
import ltg.ps.api.phenomena.PhenomenaWindow;
import ltg.ps.phenomena.helioroom.Helioroom;

import org.dom4j.Element;

/**
 * TODO Description
 *
 * @author Gugo
 */
public class EditState extends PhenomenaCommand {
	
	private String state = null;
	private long pauseTS = -1;
	private long resumeTS = -1;

	/**
	 * @param target
	 */
	public EditState(Phenomena target, PhenomenaWindow origin) {
		super(target, origin);
	}

	
	/* (non-Javadoc)
	 * @see ltg.ps.api.Command#execute()
	 */
	@Override
	public void execute() {
		((Helioroom)target).setState(state);
		if (pauseTS != -1) 
			((Helioroom)target).setStartOfLastPauseTime(pauseTS);
		else 
			((Helioroom)target).setStartTime(resumeTS);
	}

	
	/* (non-Javadoc)
	 * @see ltg.ps.api.Command#parse(org.dom4j.Element)
	 */
	@Override
	public void parse(Element xml) {
		if (xml.getTextTrim().equals("pause")) {
			// Save the pause timestamp
			state = Helioroom.STATE_PAUSED;
			pauseTS = Long.valueOf(xml.attribute("ts").getText());
		} else if (xml.getTextTrim().equals("resume")) {
			// save the resume timestamp
			state = Helioroom.STATE_RUNNING;
			resumeTS = Long.valueOf(xml.attribute("ts").getText());
		}
		else 
			log.error("Impossible to parse state of phenomena!");
		
	}

}
