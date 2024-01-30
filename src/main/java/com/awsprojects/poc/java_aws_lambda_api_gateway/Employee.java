package com.awsprojects.poc.java_aws_lambda_api_gateway;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private Integer empId;
	private String empName;
	private String email;
	
}
