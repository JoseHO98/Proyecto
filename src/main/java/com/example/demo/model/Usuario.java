package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long id;
	
	@Column(name="nombre", nullable = false)
	public String nombre;
	
	@Column(name="apellido", nullable = false)
	public String apellido;
	
	@Column(name="email", nullable = false)
	public String email;
	
	@Column(name="celular", nullable = false)
	public String celular;
	
	@Column(name="username", nullable = false)
	public String username;
	
	@Column(name="contrasena", nullable = false)
	public String contrasena;
	
	@Column(name="fecha_registro", nullable = false)
	public String FechaRegistro;
	
	@ManyToOne
	@JoinColumn(name="tipo_usuario", nullable = false)
	public TipoUsuario TipoUsuario;
	
}
