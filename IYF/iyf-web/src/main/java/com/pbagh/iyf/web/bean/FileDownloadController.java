						
package com.pbagh.iyf.web.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

public class FileDownloadController {

	private StreamedContent file;
	
	public FileDownloadController() {        
		
	}


    public StreamedContent getFile() {
        return file;
    }  
}
                    