package com.coltla.dp;

import javax.swing.SwingUtilities;


import com.coltla.dp.controller.Controller;
import com.coltla.dp.model.Model;
import com.coltla.dp.view.View;

public class Application {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				runApp();
			}
		});
	}

	protected static void runApp() {
		Model model = new Model();
		View view = new View(model);
		
		Controller controller = new Controller(view, model);
	}

}
