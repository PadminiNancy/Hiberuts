/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;
import java.io.File;
import java.io.FileOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Ankita
 */
public class UploadHelper {

    public void uploadNow(FormFile file, String filePath, String id, String doctype)throws Exception {

	    File folder = new File(filePath);



	    if(!folder.exists())
            {
	    	folder.mkdir();
	    }

	    String fileName = id+"."+doctype;

	    if(!("").equals(fileName))
            {

	         File newFile = new File(filePath, fileName);

	        if(!newFile.exists())
                {
	          FileOutputStream fos = new FileOutputStream(newFile);
	          fos.write(file.getFileData());
	          fos.flush();
	          fos.close();
	        }

    }

}


}

