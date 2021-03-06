package org.kosta.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 REST(REpresentational State Transfer) : 분산 환경 아키텍쳐 /다양한 시스템 간의 통신 / 자원에 식별자 부여 / HTTP Method 
식별자(URI)가 부여된 자원정보를 표준화된 HTTP 메서드로 제어하는 소프트웨어 아키텍쳐
자원에 고유한 식별자를 부여하며 HTTP GET,POST,PUT,DELETE METHOD를 이용해 제어한다  

특징 
1. 웹에 존재하는 모든 자원에 고유한 URI(통합자원식별자:Uniform Resource Identifier)를 부여해 활용 
HTTP GET(조회) , POST(생성) , PUT(수정), DELELTE(삭제) Method를 통해 제어

2. "다양한 클라이언트"에게 서비스를 제공, 클라이언트와 서버 역할의 명확한 분리가 가능.  
-> 모바일 , 태블릿, PC , TV 등과 같은 다양한 디바이스 및 시스템에게  
    HTTP기반 서비스를 제공하기 위해 사용되고 클라이언트는 REST API를 통해 
    서버와 정보를 주고 받는다 


REST API : 
REST 기반 서비스 API 
어플리케이션 간의 데이터 통신을 위한 어플리케이션 프로그래밍 인터페이스

RESTful : REST API 제공하는 웹서비스 시스템을 지칭 , "A 서비스 시스템은 'RESTful' 하다"
 
 
 * @author lyric
 *
 */
@SpringBootApplication
public class SpringBootStudy6RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudy6RestApplication.class, args);
	}

}
