package com.tiendaF.tiendaF.commons;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceApi <T, ID extends Serializable> {
	
	T save (T Entity);
	void delete(ID codigo_producto);
	T get (ID codigo_producto);
	List<T> getAll();

}
