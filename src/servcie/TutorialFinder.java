package servcie;

public class TutorialFinder {
	public String getBestTutorial(String language) {
		if(language.equals("java")) {
		return "javabrains";
		}
		else {
			return "language not suppoerted ";
			
		}
	}
	

}
