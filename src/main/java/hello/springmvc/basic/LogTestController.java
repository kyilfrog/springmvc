package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class LogTestController {
	
	//@Slf4j 애노테이션이 밑에 코드를 자동으로 생성해준다.
	//private final Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/log-test")
	public String LogTest() {
		String name = "Spring";
		
		System.out.println("name = " + name);
		log.trace("trace log={}", name);
		log.debug("debug log={}", name);
		log.info(" info log={}",name);
		log.warn(" warn log={}", name);
		log.error("error log={}", name);
		
		return "ok";
	}
}
