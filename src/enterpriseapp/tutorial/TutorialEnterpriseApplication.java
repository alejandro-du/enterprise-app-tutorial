package enterpriseapp.tutorial;

import com.vaadin.ui.Window;

import enterpriseapp.EnterpriseApplication;
import enterpriseapp.ui.crud.CrudBuilder;
import enterpriseapp.ui.crud.CrudComponent;

/**
 * This is our main application class. Here we'll need to extend
 * EnterpriseApplication to gain all Enterprise App power and mightiness.
 * 
 * @author Alejandro Duarte
 *
 */
public class TutorialEnterpriseApplication extends EnterpriseApplication {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		// don't ever, ever, ever, EVER forget the following line. This will bring Hibernate's Goods powers
		super.init();
		
		// create a full operating CRUD interface component right away!
		CrudComponent<Person> crud = new CrudBuilder<Person>(Person.class).build();
		crud.setSizeFull();
		
		// usual Vaadin stuff
		Window mainWindow = new Window("Address Book");
		mainWindow.setSizeFull();
		mainWindow.setContent(crud);
		setMainWindow(mainWindow);
		
		// that's it... what are you waing for? run it!
	}

}
