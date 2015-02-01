package com.support.pivotal.hackathon.cloud.foundry.analyzer;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.support.pivotal.hackathon.cloud.foundry.analyzer.dao.FileDao;
import com.support.pivotal.hackathon.cloud.foundry.analyzer.domain.CustomerInformation;

@Controller
public class MigrationAssistController {
	@Autowired
    private Properties applicationProperties;
	
	@Autowired
	private FileDao fileDao;
	
	 @RequestMapping(value = "/customerInfo", method = RequestMethod.GET)
	   public ModelAndView customerInfo() {
	      return new ModelAndView("inputFile", "command", new CustomerInformation());
	   }
	   
	   @RequestMapping(value = "/addCustomerInfo", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")CustomerInformation customerInfo, 
	   ModelMap model) {
		  String complexity="HIGH";
		  if(customerInfo.getTechnology().equals("JAVA")){
			  complexity="LOW";
		  }
	      model.addAttribute("name", customerInfo.getfName());
	      model.addAttribute("complexity", complexity);
	      
	      return "uploadDone";
	   }
}
