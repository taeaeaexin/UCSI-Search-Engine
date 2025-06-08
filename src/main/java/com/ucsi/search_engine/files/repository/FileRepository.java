package com.ucsi.search_engine.files.repository;

import com.ucsi.search_engine.files.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
