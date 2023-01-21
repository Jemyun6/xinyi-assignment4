package com.assignment4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Files {
	 
	public void writing(String str, String path, ArrayList<Person> list) throws IOException, FileNotFoundException{
		File writeFile = new File(path);
		
		try {
			BufferedWriter writeText = new BufferedWriter(new FileWriter(writeFile));
			
			writeText.write(str);
			writeText.newLine();
			for(int i = 0; i < list.size(); i++) {
				writeText.write(list.get(i).toString());
				writeText.newLine();
			}
			
			writeText.flush();
			writeText.close();
		}
		finally {
			
		}
		
		
	}

}
