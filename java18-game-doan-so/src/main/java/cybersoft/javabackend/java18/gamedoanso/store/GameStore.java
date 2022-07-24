package cybersoft.javabackend.java18.gamedoanso.store;

import java.util.ArrayList;
import java.util.List;

import cybersoft.javabackend.java18.gamedoanso.model.LanDoan;
import cybersoft.javabackend.java18.gamedoanso.model.ManChoi;
import cybersoft.javabackend.java18.gamedoanso.model.Player;

public class GameStore {
	private List<Player> dsNguoiChoi;
	private List<ManChoi> dsManChoi;
	private List<LanDoan> dsLanDoan;

	public GameStore() {
		dsNguoiChoi = new ArrayList<>();
		dsManChoi = new ArrayList<>();
		dsLanDoan = new ArrayList<>();
	}

	public List<Player> getDsNguoiChoi() {
		return dsNguoiChoi;
	}

	public List<ManChoi> getDsManChoi() {
		return dsManChoi;
	}

	public List<LanDoan> getDsLanDoan() {
		return dsLanDoan;
	}

}
