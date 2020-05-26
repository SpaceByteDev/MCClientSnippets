package instertclientnamehere;

import java.io.File;

import com.minesaria.minesariaclient.gui.hud.ScreenPosition;

public class ModToggle {
	public static File getFolder(String mod) {
		File file = new File(FileManager.MOD_DIR, mod);
		file.mkdirs();
		return file;
	}

	public static void saveIsEnabledToFile(String mod, Boolean b) {
		FileManager.writeJsonToFile(new File(getFolder(mod), "Enabled.json"), b);
	}
	public static Boolean loadEnabledFromFile(String mod) {
		Boolean b = FileManager.readFromJson(new File(getFolder(mod), "Enabled.json"), Boolean.class);
		
		if (b == null) {
			b = false;
			saveIsEnabledToFile(mod, b);
		}
		return b;
	}
}
