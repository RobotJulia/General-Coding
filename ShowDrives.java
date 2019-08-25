import java.io.File;

import javax.swing.filechooser.FileSystemView;

public class ShowDrives {

	public static void main(String[] args) {
		
		FileSystemView fsv = FileSystemView.getFileSystemView();
		
		File[] drives = File.listRoots();
		
		if(drives.length > 0 && drives != null) {
			for(File drive : drives) {
				System.out.println("------------------");
				System.out.println("Drive Name: " + drive);
				System.out.println("Drive type: " + fsv.getSystemTypeDescription(drive));
				System.out.println("Total Space: " + drive.getTotalSpace()/(1024*1024*1024) + " GB");
				System.out.println("Total Free Space: " + drive.getFreeSpace()/(1024*1024*1024) + " GB");
				System.out.println("Total Usable Space: " + drive.getUsableSpace()/(1024*1024*1024) + " GB");
			}
			
		}

	}

}
