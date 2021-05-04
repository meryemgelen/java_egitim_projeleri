package hgm.gov.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import hgm.gov.service.PersonelService;
import lombok.Data;

@Data
@Named
@ManagedBean
public class Giris {
	private String tcNo;
	private String sifre;
	@Inject
	private PersonelService personelService;

	public String girisYap() {
		if (personelService.sifreKontrolu(tcNo, sifre.toCharArray())) {
			// giri� ba�ar�l�
			return "giris_basarili";
		}
		// hata mesaj� g�nderilecek
		// giri� yap�lamad�
		FacesContext facesContext = FacesContext.getCurrentInstance();
		FacesMessage mesaj = new FacesMessage("T.C No veya �ifre yanl��");
		facesContext.addMessage("null", mesaj);
		return null;
	}
}
