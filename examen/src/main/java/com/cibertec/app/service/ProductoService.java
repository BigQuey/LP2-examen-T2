package com.cibertec.app.service;

import java.util.List;

import com.cibertec.app.entity.Producto;

public interface ProductoService {
	public List<Producto> getAllProducto();
	public Producto guardarProducto(Producto userEntity);
}
