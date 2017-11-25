package action;

import servcie.TutorialFinder;

public class TutorialAction {
	private String bestTutorial;
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getBestTutorial() {
		return bestTutorial;
	}

	public void setBestTutorial(String bestTutorial) {
		this.bestTutorial = bestTutorial;
	}

	public String execute() {
		
		return "fail";
	}
}
