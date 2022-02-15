package com.coltla.dp.controller;

import com.coltla.dp.model.Model;
import com.coltla.dp.view.View;

public class Controller {

	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}
	
	
}
