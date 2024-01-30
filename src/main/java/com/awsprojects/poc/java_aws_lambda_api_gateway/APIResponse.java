package com.awsprojects.poc.java_aws_lambda_api_gateway;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class APIResponse {
	private String body;
	private Integer statusCode;
	private Map<String,String> headers;
}
