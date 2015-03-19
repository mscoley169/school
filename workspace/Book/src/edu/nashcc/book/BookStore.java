package edu.nashcc.book;

import javax.swing.JOptionPane;

public class BookStore {

	public static void main(String[] args) {

		String title = JOptionPane.showInputDialog(null,
				"Enter the title of the book: ", "Book Title",
				JOptionPane.QUESTION_MESSAGE);
		String author = JOptionPane.showInputDialog(null,
				"Enter the author of the book: ", "Author",
				JOptionPane.QUESTION_MESSAGE);
		Book book1 = new Book(title, author);
		book1.setCategory("Computer Science");
		book1.setPrice(143.28);
		book1.setTotalPrice(143.28);

		JOptionPane
				.showMessageDialog(null, book1.getData(),
						"Formatted with StringBuilder",
						JOptionPane.INFORMATION_MESSAGE);

		// demonstrating getters
		JOptionPane.showMessageDialog(
				null,
				"Category: " + book1.getCategory() + "\nTitle: "
						+ book1.getTitle() + "\nAuthor: " + book1.getAuthor()
						+ "\nBase Price: " + book1.getPrice()
						+ "\nTotal Price: " + book1.getTotalPrice(),
				"Getter Demo", JOptionPane.INFORMATION_MESSAGE);

		// auto formatted with ctrl+shift+F

	}

}
