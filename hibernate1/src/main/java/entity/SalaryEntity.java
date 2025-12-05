package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="salary")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SalaryEntity {
@Id 
private String id;
@Column
private String eid;
private Long salary;
private String month;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public Long getSalary() {
	return salary;
}
public void setSalary(Long salary) {
	this.salary = salary;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
@Override
public String toString() {
	return "SalaryEntity [id=" + id + ", eid=" + eid + ", salary=" + salary + ", month=" + month + "]";
}
}
