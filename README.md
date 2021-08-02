# API response 를 csv 로 변환하기

![](https://img.shields.io/badge/spring%20boot-2.5.3-green) ![](https://img.shields.io/badge/java-11-green)

![](https://img.shields.io/badge/org.json-%20-yellow)

## 0. 추후 지원 기능

- POST method - 현재는 GET method 만 지원됩니다.
- custom header - Authorization 등
- nested json response

## 1. 사용 방법

```http request
### request
GET http://localhost:8080/api/parse-to-file
Content-Type: application/json

{
  "method": "GET", 
  "uri": "http://localhost:8080/api/sample-response",
  "fileName": "goods.csv"
}


### response
GET http://localhost:8080/api/parse-to-file

HTTP/1.1 200 
Content-Disposition: attachment; filename=goods.csv
Content-Type: application/octet-stream;charset=UTF-8
Content-Length: 233
Date: Mon, 02 Aug 2021 06:58:45 GMT
Keep-Alive: timeout=60
Connection: keep-alive

msg,goods_NAME,disc_PRICE,img_URL,price,goods_ID,brand_NAME,disc_RATE
[이용안내]...,[BHC]후라이드 +콜라1.25L,16500,NULL,16500,0000003250,BHC,0
[이용안내]...,[STARBUCKS]카페라떼,6500,NULL,6500,0000004250,STARBUCKS,0


Response code: 200; Time: 765ms; Content length: 197 bytes
```
