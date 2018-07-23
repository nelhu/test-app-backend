package com.nel.tab.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.nel.tab.dto.FileWarpper;
import com.nel.tab.exception.ErrorDTO;

public class BaseController {

	private Log logger = LogFactory.getLog(BaseController.class);
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpServletResponse response;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		System.out.println("root");
		mv.setViewName("index");
		return mv;
	}
	
	 @PostMapping("/files")
	 public void file(FileWarpper fw) throws Exception {
		 
		 System.out.println(fw.getTitle());
		 
	 }
	
//	@ExceptionHandler(value = Exception.class)
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ResponseBody
//	public Map<String, Object> handleExcption(Exception e) {
//		
//		Map<String, Object> exception = new HashMap<String, Object>();
//		String msg;
//		String log;
//	
//		if (e instanceof ErrorDTO) {
//			msg = ((ErrorDTO)e).getErrorMsg();
//			log = ((ErrorDTO)e).getExceptionMsg() == null ? 
//					msg : String.format("error msg is [%s], exception msg is [%s]", msg, ((ErrorDTO)e).getExceptionMsg());
//		} else {
//			msg = e.getMessage();
//			log = e.getMessage();
//		}
//		logger.error(log);
//		
//		exception.put("message", msg);
//		return exception;
//	}
	
	
}
