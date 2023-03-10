package org.zerock.web;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController4 {
	private static final Logger logger =
			LoggerFactory.getLogger(SampleController4.class);
	@RequestMapping("doE")
	public String doD(RedirectAttributes rttr) {
		
		logger.info("doE called but redirect to /doF..........");
		
		rttr.addFlashAttribute("msg","This is the Message!! with redirected");
		return "redirect:/doF";
	}
	@RequestMapping("/doF")
	public void doF(String msg) {
		logger.info("doF called......."+ msg);
	}
}
