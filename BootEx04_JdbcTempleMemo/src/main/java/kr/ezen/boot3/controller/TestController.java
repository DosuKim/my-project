package kr.ezen.boot3.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration // 환경설정 파일
@Controller // 템플릿을 이용하여 출력하겠다.
@RequestMapping(value = "/test") // 경로 지정
public class TestController {
	
	@Autowired // 자동 주입
	private JdbcTemplate jdbcTemplate; 
	
	@GetMapping("/") // 인터넷 상의 주소를 만든다.
	public String test(Model model) {
		// JdbcTemplate 을 이용하여 날짜 얻기
		model.addAttribute("today", jdbcTemplate.queryForObject("select sysdate from dual", Date.class));
		return "test";
	}
}
