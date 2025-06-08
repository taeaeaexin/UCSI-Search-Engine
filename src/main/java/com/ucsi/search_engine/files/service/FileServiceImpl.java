package com.ucsi.search_engine.files.service;

import com.ucsi.search_engine.files.dto.FileResultDto;
import com.ucsi.search_engine.files.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {
    private final FileRepository fileRepository;

    @Override
    public List<FileResultDto> readAllFiles() {
        return fileRepository.findAll().stream()
                .map(file -> FileResultDto.builder()
                        .id(file.getId())
                        .fileName(file.getFileName())
                        .filePath(file.getFilePath())
                        .filePath(file.getFilePath())
                        .fileSize(file.getFileSize())
                        .build()
                ).toList();
    }
}
