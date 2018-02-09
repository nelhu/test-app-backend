package com.nel.tab.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
/**
 * descrition 全局的异常处理器, 用于处理非自定义和自定义错误: 缺点： 不能自定义返回对象，只能返回ModelAndView
 * @author Administrator
 *
 */
//@Component
public class GlobalExcptionHandler implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// TODO Auto-generated method stub
		
//		ex.printStackTrace();
//		
//		ErrorDTO ce = new ErrorDTO();
//		
//		if (ex instanceof ErrorDTO) {
//			ce = (ErrorDTO) ex;
//		}
//		
//		ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("message", ce);
//        modelAndView.setViewName("/common/error/html");
//        
//		return modelAndView;
		return null;
	}

}
