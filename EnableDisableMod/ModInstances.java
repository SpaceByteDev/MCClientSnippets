package instertclientname.mods;

import java.io.File;

import instertclientname.ModToggle;
import instertclientname.FileManager;
import instertclientname.gui.hud.HUDManager;
import instertclientname.gui.hud.ScreenPosition;
import instertclientname.mods.Mod;

public class HUDInstances {

	private static Mod mod;

	public static void register(HUDManager api) {
		screenText = new ScreenText();
		api.register(screenText);

		if (FileIO.loadEnabledFromFile("Mod") == true) {
			mod = new Mod();
			api.register(mod);
		}
	}
}
