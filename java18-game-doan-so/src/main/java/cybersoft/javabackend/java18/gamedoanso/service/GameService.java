package cybersoft.javabackend.java18.gamedoanso.service;

import java.util.List;

import cybersoft.javabackend.java18.gamedoanso.model.ManChoi;
import cybersoft.javabackend.java18.gamedoanso.model.Player;
import cybersoft.javabackend.java18.gamedoanso.store.GameStore;
import cybersoft.javabackend.java18.gamedoanso.store.GameStoreHolder;

public class GameService {
	private GameStore store;

	public GameService() {
		store = GameStoreHolder.getStore();
	}

	public Player dangNhap(String userName, String passWord) {
		return store.getDsNguoiChoi().stream()
				.filter(player -> player.getUserName().equals(userName) && player.getPassWord().equals(passWord))
				.findFirst().orElse(null);
	}

	public Player register(String userName, String passWord, String name) {
		if (isValidUser(userName, passWord, name)) {
			return null;
		}
		boolean userExisted = store.getDsNguoiChoi().stream().anyMatch(player -> player.getUserName().equals(userName));
		if (userExisted)
			return null;
		
		Player newUser = new Player(userName, passWord, name);
		store.getDsNguoiChoi().add(newUser);
		
		return newUser;
	}

	private boolean isValidUser(String userName, String passWord, String name) {
		if (userName == null || "".equals(userName))
			return false;
		if (passWord == null || "".equals(passWord))
			return false;
		if (name == null || "".equals(name))
			return false;

		return true;
	}

	public ManChoi startGame(String userName) {
		return null;
	}

	public List<ManChoi> xepHang() {
		return null;
	}

	public ManChoi doanSo(ManChoi manChoi, int so) {
		return null;
	}
	
	
	public class KetQua {
		public static final String GREATER_THAN = "/xep-hang";
		public static final String XEP_HANG= "/xep-hang";
		public static final String XEP_HANG= "/xep-hang";
	}
}