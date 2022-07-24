package cybersoft.javabackend.java18.gamedoanso.model;

import java.util.List;

public class Player {
	private String userName;
	private String passWord;
	private List<ManChoi> manChoi;
	private String name;

	public Player(String userName, String passWord, String name) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public List<ManChoi> getManChoi() {
		return manChoi;
	}

	public String getName() {
		return name;
	}

}