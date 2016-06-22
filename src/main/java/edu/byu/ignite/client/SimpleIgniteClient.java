package main.java.edu.byu.ignite.client;

import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;


public class SimpleIgniteClient {
	
	public static void main(String[] args) {
		IgniteConfiguration cfg = new IgniteConfiguration();
		cfg.setClientMode(true);

		Ignition.start(cfg);
	}
}