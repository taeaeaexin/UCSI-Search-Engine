package com.ucsi.search_engine.files.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileResultDto {
    private Long id;
    private String fileName;
    private String fileType;
    private String filePath;
    private int fileSize;
}
