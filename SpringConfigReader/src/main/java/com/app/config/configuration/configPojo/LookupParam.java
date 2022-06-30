package com.app.config.configuration.configPojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class LookupParam {
	String name;
	String sql;
	String key;
	String value;
	Boolean clearMap;
}
