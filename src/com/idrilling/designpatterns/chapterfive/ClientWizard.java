package com.idrilling.designpatterns.chapterfive;

public class ClientWizard {
	public static void main(String[] atgs){
		InstallSoftware invoke = new InstallSoftware();
		invoke.installWizard(new Wizard());
	}
}
