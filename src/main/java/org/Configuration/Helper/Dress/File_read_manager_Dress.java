package org.Configuration.Helper.Dress;
import java.io.IOException;

public class File_read_manager_Dress {
	private File_read_manager_Dress() {

	}

	public static File_read_manager_Dress get_FRMD() {
		File_read_manager_Dress read = new File_read_manager_Dress();
		return read;

	}

	public Configration_Reader_Dress get_CRD() throws IOException  {
		Configration_Reader_Dress reader = new Configration_Reader_Dress();
		return reader;
	}

}