package singleton;

/**
 * Responsible for creating a single global instance access point.
 */
public class GlobalConfig {
	static private GlobalConfig config;
	
	private int secret_number;
	private String secret_word;
	
	
	
	private GlobalConfig() {
		this.secret_number = 42;
		this.secret_word = "sh";
	}
	
	
	
	public static GlobalConfig getInstance() {
		if (config == null) {
			GlobalConfig.config = new GlobalConfig();
		}
		
		return GlobalConfig.config;
	}



	public int getSecret_number() {
		return secret_number;
	}
	
	public String getSecret_word() {
		return secret_word;
	}
}
