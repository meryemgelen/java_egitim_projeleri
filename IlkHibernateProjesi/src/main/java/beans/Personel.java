package beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // bu clas�n veritabanundan veri okumak i�in olan bir class oldu�unu
		// tan�ml�yoruz.
@Table(name = "personel")
public class Personel {
	@Id // bu class da primery key olarak bu kullan�lacak
	private int id;
	@Column(name = "tcno")
	private String tcKimlikNo;
	private String adi;
	private String soyadi;
	private String sifre;
	@OneToMany(mappedBy = "personel")
	private List<PersonelAdres> personelAdresler;
}
