package enterpriseapp.tutorial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import enterpriseapp.hibernate.dto.Dto;

/**
 * This is our Hibernate entity class mapped just as usual. No magic here ;)
 * ... well, maybe ther's a little. We need to extend Dto (yeah right that's
 * not too cool, but you'll see some magic because of this) and override
 * some getter and setter.
 * 
 * For the sake of completeness, check META-INF/persistence.xml and
 * configuration.properties.
 * 
 * @author Alejandro Duarte
 *
 */
@Entity
public class Person extends Dto {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	private String phoneNumber;

	@Override
	public Long getId() { // we've got to override this
		return id;
	}

	@Override
	public void setId(Object id) { // and this
		this.id = (Long) id;
	}
	
	/* also... providing this setter (for Long) is good (you can tell! I've spent like a month
	   debugging an app and solved with this little setter) */
	public void setId(Long id) { 
		this.id = id;
	}

	public String getName() { // also this... I'm jus kidding XD
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
