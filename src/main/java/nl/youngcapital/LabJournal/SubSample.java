package nl.youngcapital.LabJournal;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity

public class SubSample {
	@OneToOne
	private	Amount amount;
	private String danger;
	private String description;
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@ManyToMany
	private List <Operation> operations;
	@ManyToOne
	@JoinColumn(name = "Sample_id")
	private Sample sample;
	public Amount getAmount() {
		return amount;
	}

		public String getDanger() {
			return danger;
		}
	public String getDescription() {
		return description;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public List<Operation> getOperations() {
			return operations;
		}
	public Sample getSample() {
		return sample;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public void setDanger(String danger) {
		this.danger = danger;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public void setSample(Sample sample) {
		this.sample = sample;
	}

}
