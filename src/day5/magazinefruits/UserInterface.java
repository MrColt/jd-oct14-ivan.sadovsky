package day5.magazinefruits;

import javax.swing.*;

import day5.magazinefruits.customer.Customer;
import day5.magazinefruits.fruits.Denomination;
import day5.magazinefruits.workwithshop.Shop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

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

		JLabel lName = new JLabel("Enter Your Name: ");
		final JTextField tName = new JTextField();
		tName.setColumns(25);
		panel.add(lName, new GridBagConstraints(0, 0, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, GridBagConstraints.NONE,
				new Insets(0, 0, 0, 0), 0, 0));
		panel.add(tName, new GridBagConstraints(1, 0, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));

		Denomination[] items = shop.getCatalog();
		JLabel lProduct = new JLabel("Select Fruit: ");
		final JComboBox patternList = new JComboBox(items);

		panel.add(lProduct, new GridBagConstraints(0, 1, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));
		panel.add(patternList, new GridBagConstraints(1, 1, 1, 1, 0, 0,
				GridBagConstraints.CENTER, 0, new Insets(0, 3, 0, 0), 0, 0));
		
		JLabel price = new JLabel("Price: ");
		

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
			@Override
			public void actionPerformed(ActionEvent e) {
				Customer c = new Customer();
				c.setName(tName.getText());

				int quantity = Integer.parseInt(tlQuantity.getText());
				Denomination fruitName = (Denomination) patternList.getSelectedItem();
				shop.makePurchase(c.getName(), fruitName, quantity);
				tName.removeAll();
			}
		});

		return panel;
	}
}
