package com.velocity.Dao;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class WebinarDao {

	private String Username;
	private String Password;
	private String WebinarTitle;
	private String Country;
	private String Description;
	private String WebinarType;
	private String Link;
	private String Speaker;
	private String EstimateDuration;
	private String Channel;
	private String Association;
	private String SourceOfContent;
	private String SourceInfo;
	private String ContentLevel;

	
}
