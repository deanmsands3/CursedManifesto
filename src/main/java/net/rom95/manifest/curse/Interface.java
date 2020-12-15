package net.rom95.manifest.curse;

public class Interface {

	public static void output(ManifestGui manifestGui, String s) {
		if(manifestGui != null) {
			String currText = manifestGui.outputArea0.getText();
			manifestGui.outputArea0.setText(currText.isEmpty() ? s : (currText + "\n" + s));
			manifestGui.outputArea0.addInputMethodListener(null);
		}
	}

	public static void reset(ManifestGui manifestGui) {
		if (manifestGui != null) {
			manifestGui.outputArea0.setText("");
		}
	}
	
	public static String getVersionDeclared(ManifestGui manifestGui) {
		String version = null;
		if(manifestGui != null) {
			version = manifestGui.urlField0.getText();
		}
		return version;
	}
}
