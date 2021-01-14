package com.revature.day03.Assignment2;

import java.io.File;

public class FolderMain {
	public static void main(String[] args) throws Exception{
		File file=new File("myfile_new.txt");
		
		// Make a directory
		File dir =new File("src/com/revature/io");
		dir.mkdir();
		if(dir.isDirectory()) {
			String []dirContents=dir.list();
			for(int i=0;i<dirContents.length;i++) {
				System.out.println(dirContents[i]);
			}
		}
		System.out.println(dir.getAbsolutePath());
		
		boolean isDeleted=file.delete();
	}
}
