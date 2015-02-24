package day5.magazineExample;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import day5.magazineExample.Customer.Customer;
import day5.magazineExample.ServiceClass.Shop;
import day5.magazineExample.namesandtypes.Names;

public class UserInterface {
	private Shop shop;

	public UserInterface(Shop shop) {
		this.shop = shop;

		JFrame f = new JFrame("FRUITSHOP");
		f.setLocation(300, 100);
		f.setMinimumSize(new Dimension(500, 200));

		f.getContentPane().add(createUI());

		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	private JPanel createUI() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		JLabel lName = new JLabel("Your name: ");
		final JTextField tName = new JTextField();
		tName.setColumns(25);
		panel.add(lName, new GridBagConstraints(0, 0, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, GridBagConstraints.NONE,
				new Insets(0, 0, 0, 0), 0, 0));
		panel.add(tName, new GridBagConstraints(1, 0, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));

		Names[] items = shop.getCatalog();
		JLabel lProduct = new JLabel("Select Fruit: ");
		final JComboBox patternList = new JComboBox(items);

		panel.add(lProduct, new GridBagConstraints(0, 1, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));
		panel.add(patternList, new GridBagConstraints(1, 1, 1, 1, 0, 0,
				GridBagConstraints.CENTER, 0, new Insets(0, 3, 0, 0), 0, 0));

		JLabel lQuantity = new JLabel("Enter Quantity: ");
		NumberFormat nf = NumberFormat.getNumberInstance();
		final JFormattedTextField tlQuantity = new JFormattedTextField(nf);
		tlQuantity.setColumns(2);
		tlQuantity.setValue(1);

		panel.add(lQuantity, new GridBagConstraints(0, 2, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));
		panel.add(tlQuantity, new GridBagConstraints(1, 2, 1, 1, 0, 0,
				GridBagConstraints.CENTER, 0, new Insets(0, 0, 0, 0), 0, 0));

		JButton btnBuy = new JButton("Buy");
		panel.add(btnBuy, new GridBagConstraints(1, 3, 1, 1, 0, 0,
				GridBagConstraints.CENTER, 0, new Insets(0, 0, 0, 0), 0, 0));

		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer c = new Customer();
				c.setCustomerName(tName.getText());
				int qnt = Integer.parseInt(tlQuantity.getText());
				Names birdName = (Names) patternList.getSelectedItem();
				shop.makePurchase(c.getCustomerName(), birdName, qnt);
				tName.removeAll();
			}
		});

		return panel;
	}
}
