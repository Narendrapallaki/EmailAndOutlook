package com.javamailsender.mailcontrollor;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.javamailsender.customexception.CustomeException;

import jakarta.mail.MessagingException;

@RestController
public class MailController {

	@Autowired
	private com.javamailsender.mailservice.MailService mailService;

	@PostMapping("/send") 
	public String mailSend(@ModelAttribute com.javamailsender.entity.MailForm form)
			throws MessagingException, IOException, CustomeException {

		mailService.mailSender(form);
		return "successes";
	}

}
