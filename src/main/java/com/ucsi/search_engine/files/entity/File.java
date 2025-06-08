package com.ucsi.search_engine.files.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="files")
@Data
public class File {
    @Id
    private Long id;
    private String fileName;
    private String fileExtension;
    private String filePath;
    private int fileSize;
}
