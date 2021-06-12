package com.higoramorim.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.higoramorim.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
