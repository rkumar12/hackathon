package com.support.pivotal.hackathon.cloud.foundry.analyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Normalizer.Form;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.support.pivotal.hackathon.cloud.foundry.analyzer.dao.FileDao;

@Controller
public class HelloController {
	
	@Autowired
    private Properties applicationProperties;
	
	@Autowired
	private FileDao fileDao;

	@RequestMapping(value="/welcome" ,method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "HACKATHON STARTED");
		return "hello";

	}

	@RequestMapping(value="/input", method=RequestMethod.GET)
	public String input(Form form) {
		return "inputFile";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file, ModelMap model) throws Exception {
		String fileDir = applicationProperties.getProperty("file.dir");
		
		
		// store the file to local directory - it may not good as a Cloud Foundry application
		String filePath = fileDir + file.getOriginalFilename();
		String fileName=file.getOriginalFilename();
		int length=(int)file.getSize();
		File saveFile = new File(filePath);
		FileUtils.copyInputStreamToFile(file.getInputStream(), saveFile);
	
		// so far, temporarily, converting the uploaded file to String
		InputStream in = file.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		StringBuffer buf = new StringBuffer();
		String str;
		while ((str = reader.readLine()) != null) {
			buf.append(str);
			buf.append("<br>");
		}
		//fileDao.saveFile(new FileDetails(length, fileName, in));

		model.addAttribute("pathToFile", filePath);
		//model.addAttribute("fileToString", buf.toString());
		return "finish";
	}

}
