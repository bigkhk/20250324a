package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals; 

@SpringBootTest
class Step07CicdApplicationTests {

	@Test 
	void contextLoads() {
		int result = 2 + 3;
		/* 예시 - 서버 시작시에 특정 DATABASE 로부터 검색
		 * 그 데이터는 꼭 fisa여야만 하는 상황
		 * fisa가 없다면 서버 중지 또는 다른 로직 실행
		 * 
		 *  개발중에 데이터에 대한 test 검증용등으로 사용
		 */
		
		System.out.println("비교 전***********");
		assertEquals(5, result);  
		
		System.out.println("비교 후***********");
	}

}
