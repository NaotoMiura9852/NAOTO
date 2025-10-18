package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character {
	
	public Daemon(String fileName) {
		
		super("Unknown", 0, 0, 0);
		
		loadDaemon(fileName);
		
	}
	
	private void loadDaemon(String fileName) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			
			this.name = br.readLine();
			
			this.hp = Integer.parseInt(br.readLine());
			
			this.at = Integer.parseInt(br.readLine());
			
			this.sp = Integer.parseInt(br.readLine());
			
		} catch (IOException e) {
			
			System.out.println("ファイル読み込みエラー:" + e.getMessage());
			
		}
		
	}

}
