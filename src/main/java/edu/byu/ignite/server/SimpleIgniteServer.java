package main.java.edu.byu.ignite.server;

import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;


public class SimpleIgniteServer {
	
	public static void main(String[] args) {
		IgniteConfiguration cfg = new IgniteConfiguration();
		cfg.setClientMode(false); // This is false by default generally...
		
		Ignition.start(cfg);
	}
}