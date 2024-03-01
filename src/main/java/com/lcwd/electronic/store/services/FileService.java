package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.exceptions.BadApiRequestException;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface FileService {
    String uploadFile(MultipartFile file, String path) throws IOException, BadApiRequestException;

    InputStream getResource(String path, String name) throws FileNotFoundException ;
}
