package com.Lockers.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class FileOperations {
	Scanner sc = new Scanner(System.in);
	String directory = "E:\\LockedMe.com";
	
	public void makeDir() {
		try {
			File makedir = new File(this.directory);
			makedir.mkdir();
		} catch (Exception e) {
			System.out.println("       Unable to make a directory.");
			makeDir();
		}
	}
	
	public void addNew() {
		
		try {
			String fileName = sc.nextLine();
			File addNew = new File(this.directory+"\\"+fileName);
			
			if(!addNew.exists()) {
			addNew.createNewFile();
			System.out.println();
			System.out.println("       New file "+"'"+fileName+"'"+" created successfully.");
			}else {
				System.out.println("       FileName already exist.Try again with some other name!");
			}
		} catch (IOException e) {
			System.out.println("       Unable to create new file.Try again.");
			addNew();
		}
	}
	public void getlist() {
		try {
			ArrayList<String> list = new ArrayList<>();
			File getList = new File(this.directory);
			String[] fileList = getList.list();
			for(int i=0;i<fileList.length;i++) {
				list.add(fileList[i]);
			}
			Collections.sort(list);
			Iterator<String> itr = list.iterator();
			System.out.println("       All File List(sorted in ascending order):");
			System.out.println();
			if(itr.hasNext()) {
				while(itr.hasNext()) {
					System.out.println("       "+itr.next());
				}
			}else {
				System.out.println("       No Files Exist In This Directory.");
			}
		} catch (Exception e) {
			System.out.println("       Unable to list the files.Try again.");
			getlist();
		}
	}
	public void deleteFile() {
		try {
			ArrayList<String> l1 = new ArrayList<>();
			File getL1 = new File(this.directory);
			String[] fileL1 = getL1.list();
			for(int i=0;i<fileL1.length;i++) {
				l1.add(fileL1[i]);
			}
			String filename = sc.nextLine();
			File delFile = new File(this.directory+"\\"+filename);
			if(l1.contains(filename)) {
			delFile.delete();
			System.out.println();
			System.out.println("       "+filename+" Deleted Successfully.");
			}else {
				System.out.println("       FileName does not exist in this directory. Try again with other name!");
			}
		}catch(Exception e){
			System.out.println("       Unable to delete file.Try again.");
			deleteFile();
		}
	}
	public void searchFile() {
		try {
			ArrayList<String> l2 = new ArrayList<>();
			File getL2 = new File(this.directory);
			String[] fileL2 = getL2.list();
			for(int i=0;i<fileL2.length;i++) {
				l2.add(fileL2[i]);
			}
			String name = sc.nextLine();
			File search = new File(this.directory+"\\"+name);
			if(l2.contains(name)) {
				System.out.println();
				System.out.println("       File "+name+" found in the directory "+search.getAbsolutePath());
			}else {
				System.out.println();
				System.out.println("       File "+name+" not found!");
			}
		}catch(Exception e) {
			System.out.println("       Unable to find FileName.Try again.");
			searchFile();
		}
	}
	
}
