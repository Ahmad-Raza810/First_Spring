package com.ahmad.beans;

public class Project {
  private int ProjectSize;

public Project() {
	System.out.println("project created...");
}

public int getProjectSize() {
	return ProjectSize;
}

public void setProjectSize(int projectSize) {
	ProjectSize = projectSize;
	System.out.println("project size instantiated..");
}
  
	
}
