package com.example.responsetocsv.web.sample.response;

import lombok.Getter;

@Getter
public class SampleResponse {

    private final String BRAND_NAME;
    private final String GOODS_ID;
    private final String GOODS_NAME;
    private final String IMG_URL;
    private final String MSG;
    private final String PRICE;
    private final String DISC_PRICE;
    private final String DISC_RATE;

    public SampleResponse(String BRAND_NAME, String GOODS_ID, String GOODS_NAME, String IMG_URL, String MSG, String PRICE,
        String DISC_PRICE, String DISC_RATE) {
        this.BRAND_NAME = BRAND_NAME;
        this.GOODS_ID = GOODS_ID;
        this.GOODS_NAME = GOODS_NAME;
        this.IMG_URL = IMG_URL;
        this.MSG = MSG;
        this.PRICE = PRICE;
        this.DISC_PRICE = DISC_PRICE;
        this.DISC_RATE = DISC_RATE;
    }
}
