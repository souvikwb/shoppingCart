package com.souvik.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages={"com.souvik.Model"})
public class MyCouchBaseConfig extends AbstractCouchbaseConfiguration {
	
	 @Override
	    protected List<String> getBootstrapHosts() {
	        return Arrays.asList("localhost");
	    }
	 
	    @Override
	    protected String getBucketName() {
	        return "musicStore";
	    }
	 
	    @Override
	    protected String getBucketPassword() {
	        return "";
	    }

}

