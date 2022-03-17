import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="EProduct")
public class Product {
  @Id
  @GeneratedValue
  @Column (name="Product_id")
  private int id;
  @Column (name="Product_name")
  private String name;
  @Column (name="Product_price")
  private double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
}
