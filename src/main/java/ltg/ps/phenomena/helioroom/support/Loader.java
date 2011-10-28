/*
 * Created Jan 18, 2011
 */
package ltg.ps.phenomena.helioroom.support;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ltg.ps.phenomena.helioroom.Helioroom;

/**
 * TODO Description
 *
 * @author Gugo
 */
public class Loader {

	/**
	 * TODO Description
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String conf = null;
		try {
			conf = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conf!=null)
			System.out.println(conf);
		
		Helioroom h = new Helioroom("hr_dev");
		//h.restore();
		h.configure(conf);
		//h.configureWindows(conf);
		//System.out.println(h.toXML());
	}

}
