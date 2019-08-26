import java.sql.Date;

public class Novela {
	String tituloOriginal;
	String tituloMeta;
	String titulosIncluidos;
	String titulosNormalizados;
	
	String isbn;
	String calificacion;
	String autorOriginal;
	String nacionalidad;
	
	String autorMetaRol;
	String pseudoAutorRol;
	String generoMeta;
	int  edicionOriginal; //Confirmar tipo de variable
	Date fechaPublicacion;
	String lugarPublicacion;
	String editorial;
	String coleccion;
	
	String expedientesRelacionados; //Transform to int
	String incidencias;
	String fuente;
	String materia; //Confirmar tipo de variable
	String localizacion_FR;
	//int clave //Confirmar tipo de variable
	int tirada; //Confirmar tipo de variable
	String precio;
	String cajaAGA; //sin valor
	
	int numeroExpediente;
	int año;
	int numeroColeccion;
	int codigo;//sin valor
	//int legajo; //sin valor
	int paginasTM;
	int paginasTO;
	String localizacionEP;
	String numeroEdicion;
	Date fechaEntrada;
	Date fechaResolucion;
	Date fechaDeposito;
	
	/*
	 * TODO generar los metodos de getter y setter de las variables que estan comentadas
	 */
	public String getTituloOriginal() {
		return tituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}
	public String getTituloMeta() {
		return tituloMeta;
	}
	public void setTituloMeta(String tituloMeta) {
		this.tituloMeta = tituloMeta;
	}
	public String getTitulosIncluidos() {
		return titulosIncluidos;
	}
	public void setTitulosIncluidos(String titulosIncluidos) {
		this.titulosIncluidos = titulosIncluidos;
	}
	public String getTitulosNormalizados() {
		return titulosNormalizados;
	}
	public void setTitulosNormalizados(String titulosNormalizados) {
		this.titulosNormalizados = titulosNormalizados;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	public String getAutorOriginal() {
		return autorOriginal;
	}
	public void setAutorOriginal(String autorOriginal) {
		this.autorOriginal = autorOriginal;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getAutorMetaRol() {
		return autorMetaRol;
	}
	public void setAutorMetaRol(String autorMetaRol) {
		this.autorMetaRol = autorMetaRol;
	}
	public String getPseudoAutorRol() {
		return pseudoAutorRol;
	}
	public void setPseudoAutorRol(String pseudoAutorRol) {
		this.pseudoAutorRol = pseudoAutorRol;
	}
	public String getGeneroMeta() {
		return generoMeta;
	}
	public void setGeneroMeta(String generoMeta) {
		this.generoMeta = generoMeta;
	}
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public String getLugarPublicacion() {
		return lugarPublicacion;
	}
	public void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getColeccion() {
		return coleccion;
	}
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}
	public String getExpedientesRelacionados() {
		return expedientesRelacionados;
	}
	public void setExpedientesRelacionados(String expedientesRelacionados) {
		this.expedientesRelacionados = expedientesRelacionados;
	}
	public String getIncidencias() {
		return incidencias;
	}
	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}
	public String getFuente() {
		return fuente;
	}
	public void setFuente(String fuente) {
		this.fuente = fuente;
	}
	public String getLocalizacion_FR() {
		return localizacion_FR;
	}
	public void setLocalizacion_FR(String localizacion_FR) {
		this.localizacion_FR = localizacion_FR;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getCajaAGA() {
		return cajaAGA;
	}
	public void setCajaAGA(String cajaAGA) {
		this.cajaAGA = cajaAGA;
	}
	public int getNumeroExpediente() {
		return numeroExpediente;
	}
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getNumeroColeccion() {
		return numeroColeccion;
	}
	public void setNumeroColeccion(int numeroColeccion) {
		this.numeroColeccion = numeroColeccion;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPaginasTM() {
		return paginasTM;
	}
	public void setPaginasTM(int paginasTM) {
		this.paginasTM = paginasTM;
	}
	public int getPaginasTO() {
		return paginasTO;
	}
	public void setPaginasTO(int paginasTO) {
		this.paginasTO = paginasTO;
	}
	public String getLocalizacionEP() {
		return localizacionEP;
	}
	public void setLocalizacionEP(String localizacionEP) {
		this.localizacionEP = localizacionEP;
	}
	public String getNumeroEdicion() {
		return numeroEdicion;
	}
	public void setNumeroEdicion(String numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Date getFechaResolucion() {
		return fechaResolucion;
	}
	public void setFechaResolucion(Date fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}
	public Date getFechaDeposito() {
		return fechaDeposito;
	}
	public void setFechaDeposito(Date fechaDeposito) {
		this.fechaDeposito = fechaDeposito;
	}
	
	
	
}
