package com.ezen.springdata.profile.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ProfileImageDTO {

	private Integer id;
	private String originalFileName;
	private String storedFileName;
	private MultipartFile profileImageFile;
}
