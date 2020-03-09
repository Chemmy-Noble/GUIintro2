package guiintro2;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MyFirstWindow {

	protected Shell shell;
	private Text EZtf;
	private Text ergebnis;
	private Text text_1;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstWindow window = new MyFirstWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");

		EZtf = new Text(shell, SWT.BORDER);
		EZtf.setBounds(10, 53, 76, 21);

		ergebnis = new Text(shell, SWT.BORDER);
		ergebnis.setText("0");
		ergebnis.setBounds(10, 123, 76, 21);

		Label lblZahl = new Label(shell, SWT.NONE);
		lblZahl.setBounds(10, 32, 55, 15);
		lblZahl.setText("Zahl");

		Label lblErgebnis = new Label(shell, SWT.NONE);
		lblErgebnis.setBounds(10, 102, 55, 15);
		lblErgebnis.setText("Ergebnis");

		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = Textfeld().getText();
				int text_1 = Integer.parseInt(text);
				String text2 = getText().getText();
				int zahl2 = Integer.parseInt(text2);
				text_1 = text_1 + zahl2;
				//
				getErgebnis().setText(Integer.toString(text_1));
			}
		});
		button.setBounds(349, 166, 75, 25);
		button.setText("+");

		Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = Textfeld().getText();
				int text_1 = Integer.parseInt(text);
				String text2 = getText().getText();
				int zahl2 = Integer.parseInt(text2);
				text_1 = text_1 - zahl2;
				//
				getErgebnis().setText(Integer.toString(text_1));
			}
		});
		button_1.setBounds(349, 135, 75, 25);
		button_1.setText("-");

		Button button_2 = new Button(shell, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = Textfeld().getText();
				int text_1 = Integer.parseInt(text);
				String text2 = getText().getText();
				int zahl2 = Integer.parseInt(text2);
				text_1 = text_1 * zahl2;
				//
				getErgebnis().setText(Integer.toString(text_1));
			}
		});
		button_2.setBounds(349, 97, 75, 25);
		button_2.setText("*");

		Button button_3 = new Button(shell, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = Textfeld().getText();
				int text_1 = Integer.parseInt(text);
				String text2 = getText().getText();
				int zahl2 = Integer.parseInt(text2);
				text_1 = text_1 / zahl2;
				//
				getErgebnis().setText(Integer.toString(text_1));
			}
		});
		button_3.setBounds(349, 58, 75, 25);
		button_3.setText("/");
		
		Button button_4 = new Button(shell, SWT.NONE);
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = Textfeld().getText();
				int text_1 = Integer.parseInt(text);
			}
		});
		button_4.setBounds(106, 166, 75, 25);
		button_4.setText("0");
		
		
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_5.setBounds(106, 133, 75, 25);
		button_5.setText("1");
		
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_6.setBounds(187, 133, 75, 25);
		button_6.setText("2");
		
		Button button_7 = new Button(shell, SWT.NONE);
		button_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_7.setBounds(268, 133, 75, 25);
		button_7.setText("3");
		
		Button button_8 = new Button(shell, SWT.NONE);
		button_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_8.setBounds(106, 97, 75, 25);
		button_8.setText("4");
		
		Button button_9 = new Button(shell, SWT.NONE);
		button_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_9.setBounds(187, 97, 75, 25);
		button_9.setText("5");
		
		Button button_10 = new Button(shell, SWT.NONE);
		button_10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_10.setBounds(268, 97, 75, 25);
		button_10.setText("6");
		
		Button button_11 = new Button(shell, SWT.NONE);
		button_11.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_11.setBounds(106, 58, 75, 25);
		button_11.setText("7");
		
		Button button_12 = new Button(shell, SWT.NONE);
		button_12.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_12.setBounds(187, 58, 75, 25);
		button_12.setText("8");
		
		Button button_13 = new Button(shell, SWT.NONE);
		button_13.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_13.setBounds(268, 58, 75, 25);
		button_13.setText("9");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setText("0");
		text_1.setBounds(105, 10, 319, 37);

	}

	public Text getErgebnis() {
		return ergebnis;
	}

	public Text getText() {
		return EZtf;
	}
	public Text Textfeld() {
		return text_1;
	}
}
