package net.rom95.manifesto.frontend.wizard;

import java.io.File;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.swingonly.ui.tools.DesignGridLayout;
import net.swingonly.ui.wizard.WizardStepView;
import net.swingonly.wizard.WizardStepModel;
import net.swingonly.wizard.WizardUtils;

/**
 * View of the first wizard's step.
 */
public class FirstStepView extends WizardStepView {

  private boolean		init	= false;
  private JPanel		ui;
  private JTextField	firstName;
  private JTextField	lastName;

  public FirstStepView(WizardStepModel wizardStepModel) {
    super(wizardStepModel);
  }

  @Override
  public boolean commit() {
    String firstName_str = "";
    File selectedFile;
    if (WizardUtils.isNotBlank(firstName.getText()))
      firstName_str = firstName.getText();

    String lastName_str = "";
    if (WizardUtils.isNotBlank(lastName.getText()))
      lastName_str = lastName.getText();

    this.getModel().setSummary(firstName_str + ", " + lastName_str);
    return true;	
  }

  @Override
  public void updateUI() {
    init();
    ui.updateUI();
  }

  @Override
  public JComponent getUI() {
    init();
    return ui;
  }

  private void init() {
    //other ways to setup a form: 
    //http://stackoverflow.com/questions/3180535/how-to-make-an-input-form-in-java-code-not-netbeans-using-jform
    if (!init) {
      ui = new JPanel();
      firstName = new JTextField();
      lastName = new JTextField();
      DesignGridLayout layout = new DesignGridLayout(ui);
      layout.row().grid(new JLabel("First name: ")).add(firstName);
      layout.row().grid(new JLabel("Last name: ")).add(lastName);
      init = true;
    }
  }
}