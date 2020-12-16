package net.rom95.manifest.curse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ManifestGui extends JFrame {

	private static final long serialVersionUID = -1319372543907354143L;

	JPanel panel;
	JPanel urlPanel;
	JPanel urlPanel0;
	JPanel urlPanel1;
	JPanel outputPanel;
	JPanel outputPanel0;
	JPanel outputPanel2;
	JPanel statusPanel;
	JScrollPane scrollPane0;
	JScrollPane scrollPane2;
	JTextField urlField0;
	JTextField urlField1;
	public JTextArea outputArea0;
	public JTextArea outputArea1;
	JLabel urlLabel0;
	JLabel currentStatus;
	public JButton compareButton;
	
	BufferedImage icon;

	private JLabel urlLabel0_1;

	public ManifestGui() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("CursedManifesto");
		setForeground(new Color(255, 69, 0));
		getContentPane().setBackground(Color.DARK_GRAY);
		setBounds(100, 100, 800, 600);
                java.net.URL imageURL = getClass().getClassLoader().getResource("icon.png");
                ImageIcon app_icon = new ImageIcon(imageURL);
                setIconImage(app_icon.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

		urlPanel = new JPanel();
		urlPanel.setLayout(new BoxLayout(urlPanel, BoxLayout.LINE_AXIS));
		urlPanel.setMaximumSize(new Dimension(1000, 100));

		urlPanel0 = new JPanel();
		urlPanel0.setAlignmentX(Component.LEFT_ALIGNMENT);
		urlPanel0.setLayout(new BoxLayout(urlPanel0, BoxLayout.PAGE_AXIS));

		urlPanel1 = new JPanel();
		urlPanel1.setLayout(new BoxLayout(urlPanel1, BoxLayout.PAGE_AXIS));

		outputPanel = new JPanel();
		outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.LINE_AXIS));

		outputPanel0 = new JPanel();
		outputPanel0.setAlignmentX(Component.LEFT_ALIGNMENT);
		outputPanel0.setAlignmentY(Component.TOP_ALIGNMENT);
		outputPanel0.setLayout(new BoxLayout(outputPanel0, BoxLayout.PAGE_AXIS));

		outputPanel2 = new JPanel();
		outputPanel2.setAlignmentY(Component.TOP_ALIGNMENT);
		outputPanel2.setAlignmentX(Component.LEFT_ALIGNMENT);
		outputPanel2.setLayout(new BoxLayout(outputPanel2, BoxLayout.PAGE_AXIS));

		statusPanel = new JPanel();
		statusPanel.setLayout(new BorderLayout());
		statusPanel.setMaximumSize(new Dimension(1000, 200));

		urlLabel0 = new JLabel("Modpack Version");
		urlLabel0.setAlignmentY(Component.TOP_ALIGNMENT);
		currentStatus = new JLabel("");

		urlField0 = new JTextField("", 54);
		urlField0.setMaximumSize(new Dimension(100, 20));
		urlField0.setPreferredSize(new Dimension(100, 20));
		urlField0.setAlignmentX(Component.LEFT_ALIGNMENT);
		urlField1 = new JTextField("", 54);
		urlField1.setBorder(null);
		urlField1.setVerifyInputWhenFocusTarget(false);
		urlField1.setVisible(false);
		urlField1.setEditable(false);
		urlField1.setEnabled(false);

		compareButton = new JButton("Export Modpack");
		compareButton.setAlignmentX(CENTER_ALIGNMENT);

		
		outputArea0 = new JTextArea();
		outputArea0.setFont(new JLabel().getFont());
		outputArea0.setEditable(false);

		scrollPane0 = new JScrollPane(outputArea0);
		scrollPane0.setAlignmentX(Component.LEFT_ALIGNMENT);
		scrollPane0.setAlignmentY(Component.TOP_ALIGNMENT);
		
		scrollPane2 = new JScrollPane(outputArea1);
		scrollPane2.setBorder(null);
		scrollPane2.setAlignmentX(Component.LEFT_ALIGNMENT);
		scrollPane2.setAlignmentY(Component.TOP_ALIGNMENT);
		
		urlLabel0_1 = new JLabel("Included Mod List");
		urlLabel0_1.setAlignmentY(0.0f);
		outputPanel0.add(urlLabel0_1);
		outputPanel0.add(scrollPane0);
		
		outputPanel2.add(scrollPane2);

		Border standardBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		outputPanel0.setBorder(standardBorder);
		outputPanel2.setBorder(standardBorder);

		urlPanel0.setBorder(standardBorder);
		urlPanel1.setBorder(standardBorder);

		statusPanel.setBorder(standardBorder);

		urlPanel0.add(urlLabel0);
		urlPanel0.add(urlField0);
		urlPanel1.add(urlField1);
		urlPanel.add(urlPanel0);
		urlPanel.add(urlPanel1);
		outputPanel.add(outputPanel0);
		outputPanel.add(outputPanel2);

		statusPanel.add(currentStatus);
		panel.add(urlPanel);
		panel.add(outputPanel);
		panel.add(compareButton);
		panel.add(statusPanel);
		getContentPane().add(panel);

		setLocationRelativeTo(null);
		setResizable(true);
	}
}
