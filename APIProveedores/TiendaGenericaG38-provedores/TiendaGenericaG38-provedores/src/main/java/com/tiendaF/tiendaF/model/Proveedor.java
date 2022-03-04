package com.tiendaF.tiendaF.model;

import org.springframework.data.annotation.Id;


public class Proveedor {
	
	@Id
	private Long nit_proveedor;
	
	private String nombre_proveedor;
	private String direccion_proveedor;
	private Long telefono_proveedor;
	private String ciudad_proveedor;
	
	public Proveedor() {
		super();
	}

	public Proveedor(Long nit_proveedor, String nombre_proveedor, String direccion_proveedor, Long telefono_proveedor,
			String ciudad_proveedor) {
		super();
		this.nit_proveedor = nit_proveedor;
		this.nombre_proveedor = nombre_proveedor;
		this.direccion_proveedor = direccion_proveedor;
		this.telefono_proveedor = telefono_proveedor;
		this.ciudad_proveedor = ciudad_proveedor;
	}

	public Long getNit_proveedor() {
		return nit_proveedor;
	}

	public void setNit_proveedor(Long nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}

	public String getNombre_proveedor() {
		return nombre_proveedor;
	}

	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}

	public String getDireccion_proveedor() {
		return direccion_proveedor;
	}

	public void setDireccion_proveedor(String direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}

	public Long getTelefono_proveedor() {
		return telefono_proveedor;
	}

	public void setTelefono_proveedor(Long telefono_proveedor) {
		this.telefono_proveedor = telefono_proveedor;
	}

	public String getCiudad_proveedor() {
		return ciudad_proveedor;
	}

	public void setCiudad_proveedor(String ciudad_proveedor) {
		this.ciudad_proveedor = ciudad_proveedor;
	}

	@Override
	public String toString() {
		return "Proveedor [nit_proveedor=" + nit_proveedor + ", nombre_proveedor=" + nombre_proveedor
				+ ", direccion_proveedor=" + direccion_proveedor + ", telefono_proveedor=" + telefono_proveedor
				+ ", ciudad_proveedor=" + ciudad_proveedor + "]";
	}
	
	
}