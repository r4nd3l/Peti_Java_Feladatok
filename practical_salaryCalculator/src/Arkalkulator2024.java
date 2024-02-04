// ötlet a https://www.hrportal.hu/berkalkulator.html

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Arkalkulator2024 {

  private JFrame frame;
  private JTextField bruttoField, gyermekekField;
  private JComboBox<String> egyedulNeveliBox;
  private JTextArea resultArea;

  private int bruttoSalary;

  int numberOfChildren;
  boolean isSingleParent;

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      Arkalkulator2024 calculator = new Arkalkulator2024();
      calculator.createAndShowGUI();
    });
  }

  private void createAndShowGUI() {
    frame = new JFrame("Árkalkulátor 2024");
    frame.setSize(750, 360);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    JPanel inputPanel = createInputPanel();
    frame.add(inputPanel, BorderLayout.NORTH);

    resultArea = new JTextArea();
    resultArea.setEditable(false);
    JScrollPane resultScrollPane = new JScrollPane(resultArea);
    frame.add(resultScrollPane, BorderLayout.CENTER);

    JPanel buttonPanel = createButtonPanel();
    frame.add(buttonPanel, BorderLayout.SOUTH);

    frame.setVisible(true);
  }

  private JPanel createInputPanel() {
    JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));

    bruttoField = new JTextField();
    gyermekekField = new JTextField();
    String[] egyedulNeveliOptions = { "Nem", "Igen" };
    egyedulNeveliBox = new JComboBox<>(egyedulNeveliOptions);

    inputPanel.add(new JLabel("Bruttó havi munkabér (HUF):"));
    inputPanel.add(bruttoField);
    inputPanel.add(new JLabel("Eltartottak (gyermekek) száma:"));
    inputPanel.add(gyermekekField);
    inputPanel.add(new JLabel("Gyermekét/gyermekeit egyedül neveli:"));
    inputPanel.add(egyedulNeveliBox);

    return inputPanel;
  }

  private JPanel createButtonPanel() {
    JPanel buttonPanel = new JPanel(new FlowLayout());

    JButton szamolButton = new JButton("Számol");
    szamolButton.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          calculateAndDisplay();
        }
      }
    );

    JButton ujraButton = new JButton("Újra");
    ujraButton.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          resetFields();
        }
      }
    );

    buttonPanel.add(szamolButton);
    buttonPanel.add(ujraButton);

    return buttonPanel;
  }

  private void calculateAndDisplay() {
    if (validateInput()) {
      // Calculate net salary with VAT
      double netSalary = calculateNetSalary();
      displayResult(netSalary);
    }
  }

  private boolean validateInput() {
    try {
      bruttoSalary = Integer.parseInt(bruttoField.getText());
      numberOfChildren =
        gyermekekField.getText().isEmpty()
          ? 0
          : Integer.parseInt(gyermekekField.getText());
      isSingleParent = egyedulNeveliBox.getSelectedIndex() == 1;
      return true;
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(
        frame,
        "Invalid value entered. Please enter valid numbers.",
        "Error",
        JOptionPane.ERROR_MESSAGE
      );
      return false;
    }
  }

  private double calculateNetSalary() {
    double vatRate = 0.33; // VAT is 33%
    double vatAmount = bruttoSalary * vatRate;
    return bruttoSalary - vatAmount;
  }

  private void displayResult(double netSalary) {
    resultArea.setText(String.format("Nettó fizetés: %.2f HUF", netSalary));
  }

  private void resetFields() {
    bruttoField.setText("");
    gyermekekField.setText("");
    egyedulNeveliBox.setSelectedIndex(0);
    resultArea.setText("");
  }
}
