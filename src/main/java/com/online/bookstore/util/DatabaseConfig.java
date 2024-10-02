package com.online.bookstore.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Value;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Configuration
@PropertySource(value="classpath:application.properties")
public class DatabaseConfig {

	
	@Value("${db.driver}")
	public static String DRIVER_NAME;
	
	@Value("${db.host}")
	public static String CONNECTION_STRING;
	
	@Value("${db.port}")
	public static String DB_PORT;
	
	@Value("${db.name}")
	public static String DB_NAME;
	
	@Value("${db.username}")
	public static String DB_USER_NAME;
	
	@Value("${db.password}")
	public static String DB_PASSWORD;
	
	
	}
