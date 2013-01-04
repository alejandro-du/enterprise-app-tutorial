package enterpriseapp.tutorial;

import com.vaadin.ui.Window;

import enterpriseapp.EnterpriseApplication;
import enterpriseapp.ui.crud.CrudBuilder;
import enterpriseapp.ui.crud.CrudComponent;

public class TutorialEnterpriseApplication extends EnterpriseApplication {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		super.init();
		CrudComponent<Person> crud = new CrudBuilder<Person>(Person.class).build();
		crud.setSizeFull();
		Window mainWindow = new Window("Address Book");
		mainWindow.setSizeFull();
		mainWindow.setContent(crud);
		setMainWindow(mainWindow);
	}

}
