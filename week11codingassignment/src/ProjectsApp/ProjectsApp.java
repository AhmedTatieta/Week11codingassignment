package ProjectsApp;

// @formatter:off
private List<String> operations = List.of(
		"1) Add a project",
		"2) List projects",
		"3) Select a project",
		"4) Update project details",
		"5) Delete a project"
);
// @formatter:on




private void processUserSelections() {
	boolean done = false;
	
	while(!done) {
		try {
			int selection = getUserSelection();
			
			switch(selection) {
			case -1:
				done = exitMenu();
				break;
				
				
	updateProjectDetails();
	break;
	
			case 5;
			deleteProject();
			break;
			
	default:
		System.out.println("\n" + selection + " is not a valid selection. Try again.");
		break;
			}
		}
	catch(Exception e) {
		System.out.println("\nError: ") + e + "Try again.");
	}
}
}


private void deleteProject() {
	listProjects():
		
		Integer projectId = getIntInput("Enter the ID of the project to delete");
	    
	   projectService.deleteProject(projectId);
	   System.out.println("Project" + projectId + "was deleted successfully.");
	   System.out.println("\n" + selection + " is not valid selection. Try again.");
	   break;
}
}
}

private void updateProjectDetais() {
	if(Objects.isNull(curProject)) {
		System.out.println("\nPlease select a project.");
		return;
	}

	String projectName = 
			getStringInput("Enter the project name [" + curProjectName() + "]")
}








public class ProjectsApp {

}
