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
			
			this.setName(br.readLine());
			
			this.setHp(Integer.parseInt(br.readLine()));
			
			this.setAt(Integer.parseInt(br.readLine()));
			
			this.setSp(Integer.parseInt(br.readLine()));
			
		} catch (IOException e) {
			
			System.out.println("ファイル読み込みエラー:" + e.getMessage());
			
		}
		
	}

}
