package com.cibertec.app.service;

import java.util.List;

import com.cibertec.app.entity.Inventario;

public interface InventarioService {
	
	public List<Inventario> getAllInventario();
	public Inventario updateInventario(Inventario userEntity); 
	public Inventario findInventarioById(Integer id);
}
