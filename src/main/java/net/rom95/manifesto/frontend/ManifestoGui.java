package net.rom95.manifesto.frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import net.rom95.manifesto.frontend.resource.Accessor;
import net.swingonly.api.SwingOnlyApplication;
import net.swingonly.api.SwingOnlyApplicationBranding;
import net.swingonly.api.SwingOnlyEnvironment;
import net.swingonly.api.SwingOnlySplashScreen;
import net.swingonly.api.SwingOnlySplashScreenFactory;
import net.swingonly.api.SwingOnlyUIStarterListener;
import net.swingonly.api.file.SwingOnlyFileManager;
import net.swingonly.ui.tools.DesignGridLayout;

public class ManifestoGui {

	Accessor accessor = new Accessor();

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		new ManifestoGui();
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public ManifestoGui() {

		// This has to be done at the very beginning, i.e. first method call within
		// main().
		SwingOnlyApplication.initialize("Cursed Manifesto");

		SwingOnlyApplicationBranding.setAppName("Cursed Manifesto");
		SwingOnlyApplicationBranding.setAppVersion("v1.0.0_BETA");
		SwingOnlyApplicationBranding.setCopyRight("Developed By: ROMVoid95");
		SwingOnlyApplicationBranding.setProviderName("ReadOnly Development");
		SwingOnlyEnvironment.addResourceLocator(accessor.get());
		SwingOnlyApplicationBranding.setAppIcon(SwingOnlyEnvironment.getImageIcon("appicon.png"));
		SwingOnlyEnvironment.setUIStarterListener(new MyStarterListener());

		ResourceBundle fileSelect = ResourceBundle.getBundle(accessor.get().getPackage().getName() + ".file");
		SwingOnlyEnvironment.setUserDefinedActionsResourceBundle(fileSelect);

		// Start the application
		SwingOnlyApplication.startApplication(null);
	}

	private static class MyStarterListener implements SwingOnlyUIStarterListener {
		private SwingOnlyFileManager fileManager;
		private SwingOnlySplashScreen splash;

		@Override
		public Component getApplicationComponent() {
			Color globalColor = new Color(64, 64, 64);

			JPanel mainPanel = new JPanel(new BorderLayout());
			JTabbedPane tabPanel = new JTabbedPane();

			mainPanel.setBackground(globalColor);
			tabPanel.setBackground(globalColor);

			JPanel exportPanel = new JPanel();
			exportPanel.setBackground(globalColor);

			JButton selectButton = new JButton();
			JTextField outputPath = new JTextField();
			DesignGridLayout layout = new DesignGridLayout(exportPanel);
			layout.row().grid(new JLabel("First name: ")).add(selectButton);
			layout.row().grid(new JLabel("Last name: ")).add(outputPath);

			tabPanel.add("Export Function", exportPanel);

			mainPanel.add(tabPanel, BorderLayout.CENTER);
			return mainPanel;
		}

		@Override
		public boolean isAboutToQuit() {
			// You can add some code to figure out if application can exit.

			// Return false to prevent application from exiting (e.g. a background task is
			// still running).
			// Return true otherwise.

			// Do not add a Quit dialogue box to ask user confirmation: the framework
			// already does that
			// for you.
			return true;
		}

		@Override
		public void postStart() {
			// This method is called by the framework just before displaying UI (main
			// frame).

			// we close the splash screen just before main frame becomes visible
			splash.finish();
		}

		@Override
		public void preStart() {
			// This method is called by the framework at the very beginning of application
			// startup.

			// we start a splash screen
			splash = SwingOnlySplashScreenFactory.startSplashSreen(SwingOnlyEnvironment.getImageIcon("appbanner.png"),
					true);

			// we simulate some initialization work with a simple for loop that also
			// increments
			// splash screen progress bar and message field
			for (int i = 5; i <= 100; i += 5) {
				splash.setProgressPercent(i);
				splash.setMessage("Step " + ((i / 5)));
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}

		@Override
		public void frameDisplayed() {
		}
	}

	private static class FileSelectManager implements PropertyChangeListener {

		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			if (evt.getPropertyName().equals("FileOpen")) {

			}
		}

	}

}
