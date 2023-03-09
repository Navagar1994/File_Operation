package org.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperations {
	
	public static void main(String[] arg) throws IOException {
	
	File f = new File("C:\\Users\\Administrator\\Desktop\\eclipse\\A");	
	
//mkdir()----(makedirctory)<-------- METHOD-- To create single folder //
	
	boolean folder = f.mkdir();
	System.out.println(folder);
	
	File f2 = new File("C:\\Users\\Administrator\\Desktop\\eclipse\\A\\B\\c");
	
//mkdirs()--- (makedirectorys) <-------- METHOD -- To create multiple folder//
		
		boolean folder2 = f2.mkdirs();
		System.out.println(folder2);

//createnewfile()---To create new file and mention the formate must	//		
	File f3 = new File("C:\\Users\\Administrator\\Desktop\\eclipse\\A\\B\\C\\D.text");
    
	System.out.println("..............createNewFile..............");
	
	boolean file = f3.createNewFile();
	System.out.println(file);
	
	System.out.println(".............isDirectory...........");
	
//ISDIRECTOR()Y---> To cheack the foplder or file is presented or not//
	
	System.out.println("f2......"+f2.isDirectory());
	System.out.println("f3......"+f3.isDirectory());
	 
	System.out.println("............isFile...........");
	
//ISFILE()-----> To cheack the file is presented or not//
	
	System.out.println("f2........"+f2.isFile());
	System.out.println("f3........"+f3.isFile());
	
//getAbsolutePath()-----> to cheack the file location
	System.out.println(".........getAbsolutePath..........");
	
	String path = f3.getAbsolutePath();
	System.out.println(path);
	
//---CHEACKING METHODS---//------->To cheack the file is ready to read or write
	System.out.println(".........CHEACKING METHODS.........");
//--exists()--//----> To cheack the file is already exits or not
	
//	boolean exists = f3.exists();
//	System.out.println(exists);
	//or//
	System.out.println(f3.exists());
	
//---isHidden()---//------>To cheack the file is hidden or not
	
	System.out.println(f3.isHidden());
	
//---canRead()----To cheack the file is readable or not
	
	System.out.println(f3.canRead());
	
//---canWrite()---- To cheack the file is able to write or not
	
	System.out.println(f3.canWrite());
	
//LIST---> To get the all file names------//

	File  f4 = new File("C:\\Users\\Administrator\\eclipse-workspace");

	String[] filenames = f4.list();
	
	for(String a:filenames) {
		System.out.println(a);
	}
//----Listfiles---->To find the all file location
	
	File[] filelocation = f4.listFiles();
	
	for(File b:filelocation) {
		System.out.println(b);
	}
//--- Write---To write something----->It is a static method presented in "fileUtils"
	// so call with classname.methodname
	
	FileUtils.write(f3, "welcome to hevean\n");  //0
	FileUtils.write(f3, "enjoy  it",true);         //1
	
//----ReadLines----> To read the lines in the file---->It is a static method Presented in "fileUtils"
	
	List<String> readLines = FileUtils.readLines(f3);
	
	String r = readLines.get(0);
	System.out.println(r);
	
	for(String c:readLines) {
		System.out.println(c);
	}
//---copyFile---->
		
//    File f5 = new File("C:\\Users\\Administrator\\eclipse-workspace\\A\\B\\C\\D.text");

	File f5 = new File("C:\\Users\\Administrator\\eclipse-workspace\\B\\E.text");
	
    FileUtils.copyFile(f3, f5);
	
	}
}



