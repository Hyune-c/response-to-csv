package com.example.responsetocsv.web.parser.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetParseToFileRequest {

    private final String method;
    private final String uri;
    private final String fileName;
}
