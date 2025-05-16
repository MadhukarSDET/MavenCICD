package utlity;

public class ConFactory {

	public static FrameworkConfig getConfig() {
		return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
	}

}
