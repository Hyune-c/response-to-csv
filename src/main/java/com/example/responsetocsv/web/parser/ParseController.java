package com.example.responsetocsv.web.parser;

import com.example.responsetocsv.common.CsvResponseEntity;
import com.example.responsetocsv.domain.GetWebClientService;
import com.example.responsetocsv.web.parser.request.GetParseToFileRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.CDL;
import org.json.JSONArray;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ParseController {

    private final GetWebClientService getWebClientService;

    @GetMapping(value = "/api/parse-to-file", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<?> parseToFile(@RequestBody GetParseToFileRequest request) {
        String apiResponse =
            (request.getMethod().equals(HttpMethod.GET.name()))
                ? getWebClientService.get(request.getUri()).block()
                : null;

        String csvString = CDL.toString(new JSONArray(apiResponse));

        return CsvResponseEntity.create(request.getFileName(), csvString);
    }
}
