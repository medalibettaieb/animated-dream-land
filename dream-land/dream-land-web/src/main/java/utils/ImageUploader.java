package utils;

import java.io.FileOutputStream;
import java.util.UUID;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import mBeans.AmusementBean;
import tn.bettaieb.dream_land.services.AmusementServiceLocal;
import tn.bettaieb.dream_land.utilities.DirectoryInitilizer;

@ManagedBean
@ViewScoped
public class ImageUploader {
	private UploadedFile uploadedFile;
	@EJB
	private AmusementServiceLocal amusementServiceLocal;
	@ManagedProperty(value = "#{amusementBean}")
	private AmusementBean amusementBean;

	public void handleFileUpload(FileUploadEvent event) {
		uploadedFile = event.getFile();
		String shortImagePath = UUID.randomUUID().toString() + ".jpg";

		if (uploadedFile != null && uploadedFile.getContents() != null) {
			try {
				byte[] contents = uploadedFile.getContents();
				FileOutputStream fos = new FileOutputStream(DirectoryInitilizer.IMAGE_DIR + "/" + shortImagePath);
				fos.write(contents);
				fos.close();

				amusementServiceLocal.addImage(shortImagePath, amusementBean.getAmusement());

			} catch (Exception e) {
				FacesMessage message = new FacesMessage("pb", event.getFile().getFileName() + " is not uploaded.");
				FacesContext.getCurrentInstance().addMessage(null, message);
			}
		}

	}

	public UploadedFile getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(UploadedFile uploadedFile) {
		this.uploadedFile = uploadedFile;
	}

	public AmusementServiceLocal getAmusementServiceLocal() {
		return amusementServiceLocal;
	}

	public void setAmusementServiceLocal(AmusementServiceLocal amusementServiceLocal) {
		this.amusementServiceLocal = amusementServiceLocal;
	}

	public AmusementBean getAmusementBean() {
		return amusementBean;
	}

	public void setAmusementBean(AmusementBean amusementBean) {
		this.amusementBean = amusementBean;
	}

}
