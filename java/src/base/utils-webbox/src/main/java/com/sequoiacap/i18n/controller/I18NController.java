package com.sequoiacap.i18n.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.jhorstmann.i18n.GettextResourceBundle;
import net.jhorstmann.i18n.I18N;

@Controller
@RequestMapping("/i18n")
public class I18NController
{
	@RequestMapping("/_i.fn")
	public String _i(Model model)
	{
		ResourceBundle bundle = I18N.getBundle();

		Map<String, String> msgs = new HashMap<String, String>();

		for(String key: bundle.keySet())
		{
			String value = bundle.getString(key);

			msgs.put(key, value);
		}

		model.addAttribute("msgs", msgs);

		return "i18n/_i";
	}
}
