package com.example.disprojectmanager;

import java.util.ArrayList;

public class project{

    private String Name;
    private ArrayList<team> theTeam;

    /**
	 * Constructor
	 */
    public project(String Name, ArrayList<team> theTeam)
    {
        this.Name = Name;
        this.theTeam = theTeam;
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @return the theTeam
	 */
	public ArrayList<team> getTheTeam() {
		return theTeam;
	}   
}

