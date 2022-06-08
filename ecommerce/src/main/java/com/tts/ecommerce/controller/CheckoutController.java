package com.tts.ecommerce.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tts.ecommerce.model.ChargeRequest;

public class CheckoutController {
	@Value("${STRIPE_PUBLIC_KEY}")
	private String stripePublicKey;
	
	@RequestMapping("/checkout")
	public String checkout(Model model) {
		model.addAttribute("amount", 50*100); //in centimes
		model.addAttribute("stripePublicKey", stripePublicKey);
		model.addAttribute("currency", ChargeRequest.Currency.USD);
		return "checkout";
	}
}
