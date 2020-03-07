package com.springboot.test.coltroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/* REST를 위한 전용 컨트롤러
*  REST : REpresentative State Transfer의 약자로 분산 시스템을 위한 아키텍처
*  테이워크를 경유해서 외부 서버에 접속하거나 필요한 정보를 불러오기 위한 구조
*  이 개념을 바탕으로 설계된 시스템을 RESTFul 이라 한다.
*  HTML을 사용하지 않고 단순한 텍스트로 정보를 전달 */
public class HelloController {

    @RequestMapping("/")
    /* 서버의 URL과 특정 처리를 연결하는 어노테이션 */
    public String index(){
        return "Hello Spring-Boot World!!";
    }

    @RequestMapping("/{num}")
    /* URL의 쿼리 스트링 부분에 지정한 값을 추출해서 사용하기 */
    public String num(@PathVariable int num){
        int result = 1 ;
        String resultStr ="1";
        for(int i = 1 ; i <= num ; i++){
            result*=i;
            resultStr +="*"+ i;//String.valueOf(i);
        }

        return resultStr +" = "+result;

    }
}
