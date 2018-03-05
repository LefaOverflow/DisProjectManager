package com.example.disprojectmanager;

import java.util.ArrayList;

public class team{

    private String Name;
    private ArrayList<member> Members;
    
    /**
	 * Constructor
	 */
    public team(String Name, ArrayList<member> Members)
    {
        this.Name = Name;
        this.Members = Members;
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @return the members
	 */
	public ArrayList<member> getMembers() {
		return Members;
	}


