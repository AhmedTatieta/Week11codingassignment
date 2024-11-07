package ProjectService;

public class ProjectService {

	public void modifyProjectDetails(Project project) {
		if(!projectDao.modifyProjectDetails(project)) {
			throw new DbException("Project with ID=" + project.getProjectId() + " does not exist.");
		 }
	 }
	
	/**
	
	* @param projectId
	*/ 
	public void deleteProject(Integer projectId)  {
		if(!projectDao.deleteProject(projectId)  {
			throw new DbException("Project with ID=" + projectId + does not exist.");
		}
	}
	
	
	
	
	
	


