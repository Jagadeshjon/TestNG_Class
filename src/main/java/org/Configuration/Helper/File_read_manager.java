package org.Configuration.Helper;

import java.io.IOException;

public class File_read_manager {
	private File_read_manager() {

	}

	public static File_read_manager get_FRM() {
		File_read_manager read = new File_read_manager();
		return read;

	}

	public Configration_Reader get_CR() throws IOException  {
		Configration_Reader reader = new Configration_Reader();
		return reader;
	}

}
