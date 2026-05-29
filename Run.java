package co.edu.uptc.runner;

import java.io.IOException;

import co.edu.uptc.presenter.Presenter;

public class Run {
	public static void main(String[]arg) throws IOException {
		Presenter obj = new Presenter();
		obj.init();
	}
}
