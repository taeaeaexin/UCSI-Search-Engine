package com.ucsi.search_engine.files.service;

import com.ucsi.search_engine.files.dto.FileResultDto;

import java.util.List;

public interface FileService {
    List<FileResultDto> readAllFiles();
}
