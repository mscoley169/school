import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class DialogBoxExample {

	public static void main(String[] args) {
		
		int n = JOptionPane.showConfirmDialog(
			    null,
			    "Would you like green eggs and ham?",
			    "An Inane Question",
			    JOptionPane.YES_NO_OPTION);
		/*-----------------------------------------------------------------
		 * Possible showConfirmDialog return values
		   The values for this integer are:
		   	YES_OPTION, NO_OPTION 
		   	CANCEL_OPTION 
		   	OK_OPTION 
		   	CLOSED_OPTION 
		   	Except for CLOSED_OPTION, each option corresponds to the button 
		   	the user pressed. When CLOSED_OPTION is returned, it indicates 
		   	that the user closed the dialog window explicitly, rather than 
		   	by choosing a button inside the option pane.
		 -----------------------------------------------------------------*/

		if (n == JOptionPane.YES_OPTION){
			/*-----------------------------------------------------------------
			 * showMessageDialog parameters
				showMessageDialog(Component parentComponent, 
				Object message, 
				String title, 
				int messageType, 
				Icon icon)
			-----------------------------------------------------------------*/
			JOptionPane.showMessageDialog(null, "You selected Yes", "Title", JOptionPane.WARNING_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null, "You selected No", "This is the title", JOptionPane.WARNING_MESSAGE, UIManager.getIcon("Tree.leafIcon"));
			/* Some default UIManger Icons
			  	Tree.collapsedIcon
				FileChooser.directoryIcon
				FileChooser.detailsViewIcon
				OptionPane.questionIcon
				FileChooser.newFolderIcon
				FileView.floppyDriveIcon
				Tree.openIcon
				Tree.expandedIcon
				OptionPane.informationIcon
				Tree.closedIcon
				Tree.leafIcon
				FileChooser.upFolderIcon
				OptionPane.errorIcon
				ToolBar.handleIcon
				FileChooser.floppyDriveIcon
				FileChooser.fileIcon
				RadioButton.icon
				FileView.fileIcon
			 */
		}

	}

}
