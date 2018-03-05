package com.example.disprojectmanager;

public class member{

    private String Name;
    private String FunFactAbout;
    private String PhotoUrl;

    /**
	 * Constructor
	 */
    public member(String Name, String FunFactAbout, String PhotoUrl)
    {
        this.Name = Name;
        this.FunFactAbout = FunFactAbout;
        this.PhotoUrl = PhotoUrl;
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @return the funFactAbout
	 */
	public String getFunFactAbout() {
		return FunFactAbout;
	}
	/**
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return PhotoUrl;
	}
	
	
	
    
}

