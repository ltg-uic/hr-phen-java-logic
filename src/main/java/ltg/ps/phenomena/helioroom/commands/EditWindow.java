/*
 * Created Apr 26, 2011
 */
package ltg.ps.phenomena.helioroom.commands;

import org.dom4j.Element;

import ltg.ps.api.phenomena.Phenomena;
import ltg.ps.api.phenomena.PhenomenaCommand;

/**
 * TODO Description
 *
 * @author Gugo
 */
public class EditWindow extends PhenomenaCommand {

	/**
	 * @param target
	 */
	public EditWindow(Phenomena target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ltg.ps.api.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see ltg.ps.api.Command#parse(org.dom4j.Element)
	 */
	@Override
	public void parse(Element e) {
		System.err.println(e.asXML());
	}

	/* (non-Javadoc)
	 * @see ltg.ps.api.Command#toXML()
	 */
	@Override
	public String toXML() {
		// TODO Auto-generated method stub
		return null;
	}

}
