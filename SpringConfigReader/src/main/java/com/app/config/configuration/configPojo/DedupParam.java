package com.app.config.configuration.configPojo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class DedupParam {
	String name;
	String sql;
	String preLoad;
	String microBatch;
	String logTable;
	Boolean enableInd;
}
