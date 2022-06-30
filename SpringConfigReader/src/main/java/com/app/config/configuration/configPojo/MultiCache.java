package com.app.config.configuration.configPojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@ConfigurationProperties(prefix = "multicache.caches")
@Getter
@Setter
@ToString
public class MultiCache {
	private List<LookupParam> lookupCache ;
	private DedupParam dedupCache ;
}
