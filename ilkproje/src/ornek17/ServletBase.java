package ornek17;

public abstract class ServletBase {

    public abstract void doGet();

    public void doProcess() {
	System.out.println("vt ba�lant�s� kur");
	doGet();
	System.out.println("VT ba�lant�s�n� kapat");
    }
}
