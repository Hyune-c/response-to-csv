package com.example.responsetocsv.common;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class CsvResponseEntity {

    public static ResponseEntity<byte[]> create(String fileName, String csvString) {
        return ResponseEntity.ok()
            .contentType(MediaType.APPLICATION_OCTET_STREAM)
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName)
            .body(csvString.getBytes());
    }
}
