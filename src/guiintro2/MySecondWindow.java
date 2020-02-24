package guiintro2;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MySecondWindow {

	protected Shell shell;
	private Text Vornametf;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MySecondWindow window = new MySecondWindow();
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
		
		Button btnMyButton = new Button(shell, SWT.NONE);
		btnMyButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("My Button wurde gedrückt");
			}
		});
		btnMyButton.setBounds(174, 68, 75, 25);
		btnMyButton.setText("My Button");
		
		Label lblVorname = new Label(shell, SWT.NONE);
		lblVorname.setBounds(115, 138, 55, 15);
		lblVorname.setText("Vorname");
		
		Vornametf = new Text(shell, SWT.BORDER);
		Vornametf.setBounds(173, 138, 76, 21);

	}
	public Text getVtf() {
		return vtf;
	}
	public Text getVornametf() {
		return Vornametf;
	}
}
