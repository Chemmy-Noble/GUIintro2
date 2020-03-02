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
				String text = getErgebnis().getText();
				int ergebnis = Integer.parseInt(text);
				String text2 = getText().getText();
				int zahl2 = Integer.parseInt(text2);
				ergebnis = ergebnis + zahl2;
				//
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		button.setBounds(298, 53, 75, 25);
		button.setText("+");

		Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = getErgebnis().getText();
				int ergebnis = Integer.parseInt(text);
				String text2 = getText().getText();
				int zahl2 = Integer.parseInt(text2);
				ergebnis = ergebnis - zahl2;
				//
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		button_1.setBounds(298, 84, 75, 25);
		button_1.setText("-");

		Button button_2 = new Button(shell, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = getErgebnis().getText();
				int ergebnis = Integer.parseInt(text);
				String text2 = getText().getText();
				int zahl2 = Integer.parseInt(text2);
				ergebnis = ergebnis * zahl2;
				//
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		button_2.setBounds(298, 119, 75, 25);
		button_2.setText("*");

		Button button_3 = new Button(shell, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = getErgebnis().getText();
				int ergebnis = Integer.parseInt(text);
				String text2 = getText().getText();
				int zahl2 = Integer.parseInt(text2);
				ergebnis = ergebnis / zahl2;
				//
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		button_3.setBounds(298, 150, 75, 25);
		button_3.setText("/");

	}

	public Text getErgebnis() {
		return ergebnis;
	}

	public Text getText() {
		return EZtf;
	}
}
