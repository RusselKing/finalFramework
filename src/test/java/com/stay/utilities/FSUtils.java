package com.stay.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class FSUtils {
		public static void createFolders(String path){
			String stamp = LocalDateTime.now().toString();
			stamp = stamp.replace("-", "");
			stamp = stamp.replaceAll(":", "");
			stamp = stamp.substring(0, 15);
			String folderPath= path+stamp;
			File folders = new File(folderPath);
			folders.mkdirs();
		}
		
		public static void deleteFolder(String path){
			
			File folderDelete= new File(path);
			folderDelete.delete();
		}

		public static void createTextFile(String path){
			String stamp = LocalDateTime.now().toString();
			stamp = stamp.replace("-", "");
			stamp = stamp.replaceAll(":", "");
			stamp = stamp.substring(0, 15);
			String filePath= path+stamp+".txt";
			
				File file = new File(filePath);
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
}
