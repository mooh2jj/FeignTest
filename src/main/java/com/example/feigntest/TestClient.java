package com.example.feigntest;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// @FeignClient 을 작성하면 인터페이스를 클래스로 구체화 시킬 필요가 없음. annotation이 작성해준다.
@FeignClient(name = "test", url="http://localhost:8080")    // name은 서비스 디스커버리를 사용할 경우 호출되는 마이크로서비스 이름에 해당한다.
public interface TestClient {

    @GetMapping("/test")
    String test();
}
