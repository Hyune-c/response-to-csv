package com.example.responsetocsv.web.sample;

import com.example.responsetocsv.web.sample.response.SampleResponse;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResponseController {

    @GetMapping("/api/sample-response")
    public List<SampleResponse> sampleResponse() {
        List<SampleResponse> sampleResponses = List.of(
            new SampleResponse("BHC",
                "0000003250",
                "[BHC]후라이드 +콜라1.25L",
                "NULL",
                "[이용안내]...",
                "16500",
                "16500",
                "0"),
            new SampleResponse("STARBUCKS",
                "0000004250",
                "[STARBUCKS]카페라떼",
                "NULL",
                "[이용안내]...",
                "6500",
                "6500",
                "0")
        );

        return sampleResponses;
    }
}
