package ProjectDao;

public class ProjectDao {
public boolean modifyProjectDetails(Project project) {
	// @formatter:off
	String sql = ""
        + "UPDATE " + PROJECT_TABLE + "SET"
        + "project_name = ?, "
        + "estimated_hours = ?, "
        + "actual_hours = ?, "
        + "difficulty = ?,"
        + "notes = ?"
        + "WHERE project_id = ?";
	// @formatter:on
	
	try(Connection conn = DbConnection.getConnection()) {
		startTransaction(conn);
		
		try(PreparedStatement stmt = conn.prepareStatement(sql)) {
			setParameter(stmt, 1, project.getProjectName(), String.class);
			setParameter(stmt, 2, project.getEstimatedHours(), BigDecimal.class);
			setParameter(stmt, 3, prroject.getActualHours(), BigDecimal.class);
			setParameter(stmt, 4, project.getDifficulty(), Integer.class);
			setParameter(stmt, 5, project.getNotes(), String.class);
			setParameter(stmt, 6, project.getProjectId(), Integer.class);
			
			
		boolean modified = stmt.executeUpdate() == 1;
		commitTransaction(conn);
		
		return modified;
		}
	    catch(Exception e)  {
	    	rollbackTransaction(conn);
	    	throw new DbException(e);
	    }
	}
	catch(SQLException e) {
		throw new DbException(e):
	}
}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
