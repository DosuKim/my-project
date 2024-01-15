package kr.ezen.log;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;


@Configuration
@RestController
@Slf4j // log 변수 자동 생성
public class LogTestController {
	
	@GetMapping("/logTest")
	public String logTest() {
		String msg = "Spring Boot3 Log를 출력해보자!!!";
		log.trace(" log : {}",msg);
		log.debug(" log : {}",msg);
		log.info(" log : {}",msg);
		log.warn(" log : {}",msg);
		log.error(" log : {}",msg);
		return "Ok<br><a href='/'>home</a>";
	}
}
