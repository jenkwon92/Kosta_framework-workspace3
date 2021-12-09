package org.kosta.myproject.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kosta.myproject.model.domain.CustomerDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyAjaxController {
	@RequestMapping("testAjax1")
	@ResponseBody // ajax 방식으로 응답하기 위한 어노테이션 (페이지가 아니라 데이터로 응답)
	public String testAjax1(String userId) {
		return userId+" ajax response";//클라이언트에게 응답하는 데이터를 리턴한다 
	}
	@RequestMapping("testAjax2")
	@ResponseBody // DTO or VO 로 리턴하면 JSONObject로 응답한다 ( jackson databind 라이브러리에 의해 )
	public CustomerDTO testAjax2(String customerId) {
		return new CustomerDTO(customerId,"아이유","오리");
	}
	@RequestMapping("testAjax3")
	@ResponseBody  // List로 반환하면 JSONArray로 응답한다( jackson databind library ) 
	public List<String> testAjax3(String id) {
		List<String> list=new ArrayList<String>();
		list.add("화성행궁");
		list.add("잣향기푸른숲");
		list.add("융건릉");
		return list;
	}
	@RequestMapping("testAjax4")
	@ResponseBody //jackson databind에 의해 JSONArray>JSONObject
	public List<CustomerDTO> testAjax4(String id){
		List<CustomerDTO> list=new ArrayList<CustomerDTO>();
		list.add(new CustomerDTO("java","아이유","오리"));
		list.add(new CustomerDTO("spring","강하늘","판교"));
		return list;
	}
	@RequestMapping("testAjax5")
	@ResponseBody // map을 jsonobject로 생성해서 응답한다 
	public Map<String,Object> testAjax5(String id) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("CAR_NO", 123);
		map.put("MODEL", "소나타");
		return map;
	}
	//ajax 통신시 한글로 된 일반문자열로 응답할 경우 아래와 같이 
	//별도의 한글 처리가 필요 
	//@RequestMapping(value="testAjax6",produces = "application/text;charset=utf-8")
	//현재 버전에서는 위와 같은 설정없이 한글처리가 잘됨 
	@RequestMapping("testAjax6")
	@ResponseBody
	public String testAjax6(String name,String address) {
		return "응답데이터";
	}
}















