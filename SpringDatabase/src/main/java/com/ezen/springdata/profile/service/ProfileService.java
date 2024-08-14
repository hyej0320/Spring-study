package com.ezen.springdata.profile.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ezen.springdata.profile.dto.ProfileImageDTO;
import com.ezen.springdata.profile.repository.ProfileRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProfileService {
	
	private final ProfileRepository profileRepository;

	public void save(ProfileImageDTO profileImageDTO) throws IllegalStateException, IOException {
		// 1. 클라이언트로부터 전달 받은 파일을 서버 컴퓨터에 내보내기
		MultipartFile profileImageFile = profileImageDTO.getProfileImageFile();
//		
//		if (profileImageFile == null) {
//			return;
//		}

		saveFile(profileImageFile);
	}
	
	public void multisave(ProfileImageDTO profileImageDTO) throws IllegalStateException, IOException {
		List<MultipartFile> profileImageFiles = profileImageDTO.getProfileImageFiles();
//		
//		if (profileImageFiles == null || profileImageFiles.size() == 0) {
//			return ;
//		}
		for (MultipartFile profileImageFile : profileImageFiles) {
			saveFile(profileImageFile);
		}
	}

	String rootPath = "C:/spring_upload_files/";
	
	public void saveFile(MultipartFile profileImageFile) throws IllegalStateException, IOException {
		
		if (profileImageFile == null || profileImageFile.isEmpty()) {
			return ;
		}
		
		String originalFileName = profileImageFile.getOriginalFilename();
		String storedFileName = String.format("%s-%s", System.currentTimeMillis(), originalFileName);
		String savePath = rootPath + storedFileName;
		
		profileImageFile.transferTo(new File(savePath));
		
		ProfileImageDTO profileImageDTO = new ProfileImageDTO();
		// 2. 서버 컴퓨터에 파일 쓰기를 성공했다면 DB에 경로들을 보관
		profileImageDTO.setOriginalFileName(originalFileName);
		profileImageDTO.setStoredFileName(storedFileName);

		profileRepository.saveProfileImage(profileImageDTO);
	}
}
