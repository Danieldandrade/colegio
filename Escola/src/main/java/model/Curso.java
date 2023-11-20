package model;

public class Curso {
	private int idCurso;
	private String nomeCurso;
	private String cargaHoraria;
	private String tipoCurso;
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Curso(int idCurso, String nomeCurso, String cargaHoraria, String tipoCurso) {
		super();
		this.idCurso = idCurso;
		this.nomeCurso = nomeCurso;
		this.cargaHoraria = cargaHoraria;
		this.tipoCurso = tipoCurso;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getTipoCurso() {
		return tipoCurso;
	}
	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
	
	
}
