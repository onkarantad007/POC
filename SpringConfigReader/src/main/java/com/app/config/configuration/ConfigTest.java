package com.app.config.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.config.configuration.configPojo.MultiCache;

@Component
public class ConfigTest implements CommandLineRunner{
	
	@Autowired
	MultiCache multiCache;

	@Override
	public void run(String... args) throws Exception {
		
		// reading configuration
		
		multiCache.getLookupCache().stream().forEach(i->{
			System.out.println("lookup-> "+i.getName());
		});
		
		System.out.println("dedup-> "+multiCache.getDedupCache().getPreLoad());

		
	}

}
