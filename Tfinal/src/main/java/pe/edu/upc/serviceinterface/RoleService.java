package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Role;

public interface RoleService {

	public void insert(Role role);

				List<Role> list();
}
